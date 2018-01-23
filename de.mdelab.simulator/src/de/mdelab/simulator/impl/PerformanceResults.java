package de.mdelab.simulator.impl;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.CategorySeries.CategorySeriesRenderStyle;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.style.Styler.LegendPosition;

/**
 * The performance results of the simulation as the individual execution times
 * in milliseconds of each feedback loop run in each simulation round. That is,
 * it is a collection of {@link PerformanceEntry} objects collected over the
 * whole simulation.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class PerformanceResults extends SimulationResults<PerformanceEntry> {

	private long st;
	private long sst;

	/**
	 * Constructor.
	 * 
	 * @param rounds
	 *            the total number of rounds of the whole simulation.
	 */
	public PerformanceResults(int rounds) {
		this.entries = new ArrayList<PerformanceEntry>(rounds);
	}

	/**
	 * @see SimulationResults#addEntry(SimulationResultsEntry)
	 */
	public void addEntry(PerformanceEntry entry) {
		super.addEntry(entry);
		long executionTime = entry.getExecutionTime();
		this.st += executionTime;
		this.sst += executionTime * executionTime;
	}

	/**
	 * Returns the mean execution time of the feedback loop in milliseconds.
	 * 
	 * @return the mean execution time of the feedback loop in milliseconds.
	 */
	public double getMeanExecutionTime() {
		return this.st / this.entries.size();
	}

	/**
	 * Returns the standard deviation of the execution time of the feedback loop in
	 * milliseconds.
	 * 
	 * @return the standard deviation of the execution time of the feedback loop in
	 *         milliseconds.
	 */
	public double getStandardDeviation() {
		int round = this.entries.size();
		if (round > 1) {
			double mean = this.getMeanExecutionTime();
			double sdev = Math.sqrt((this.sst - mean * mean * round) / (round - 1));
			return sdev;
		} else {
			return 0;
		}
	}

	/**
	 * Returns the total execution time of the feedback loop in milliseconds.
	 * 
	 * @return the total execution time of the feedback loop in milliseconds.
	 */
	public long getTotalExcutionTime() {
		return this.st;
	}

	/**
	 * @see de.mdelab.simulator.impl.SimulationResults#saveResults(java.util.Date)
	 */
	@Override
	public void saveResults(Date timestamp) {
		String time = timestamp.toString().replaceAll(":", "-");
		String filename = LogUtil.RESULTS_FOLDER + "ExecutionTime__" + time;

		// Create Chart
		CategoryChart chart = new CategoryChartBuilder().width(1024).height(768)
				.title("Execution Time of the Feedback Loop").xAxisTitle("Simulation Runs").yAxisTitle("Time (ms)")
				.theme(ChartTheme.Matlab).build();

		// Customize Chart
		chart.getStyler().setXAxisTickMarkSpacingHint(100);
		chart.getStyler().setChartBackgroundColor(new Color(255, 255, 255));
		chart.getStyler().setLegendPosition(LegendPosition.OutsideE);
		chart.getStyler().setAxisTitlesVisible(true);
		chart.getStyler().setDefaultSeriesRenderStyle(CategorySeriesRenderStyle.Bar);

		// Data series for chart
		List<Long> roundData = new ArrayList<Long>(this.entries.size());
		List<Long> timeData = new ArrayList<Long>(this.entries.size());

		// file writer for csv
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filename + ".csv");
			fileWriter.append("Round" + CSV_SEP + "Execution Time (ms)" + CSV_NEW_LINE);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// fill data series for chart and file writer for csv
		for (PerformanceEntry log : this.entries) {
			int round = log.getRound();
			long executionTime = log.getExecutionTime();

			// fill data series for chart
			roundData.add((long) round);
			timeData.add(executionTime);
			// fill file writer for csv
			try {
				fileWriter.append(round + CSV_SEP + executionTime + CSV_NEW_LINE);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// write and save csv file
		try {
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// save chart
		chart.addSeries("Execution Time", roundData, timeData);
		super.saveChart(chart, filename);
	}

}
