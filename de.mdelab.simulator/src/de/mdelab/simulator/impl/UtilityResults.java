package de.mdelab.simulator.impl;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.style.Styler.LegendPosition;

/**
 * The utility results of the simulation as the individual utilities of the
 * managed system in each simulation round and at a specific point in time. That
 * is, it is a collection of {@link UtilityEntry} objects collected over the
 * whole simulation.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class UtilityResults extends SimulationResults<UtilityEntry> {

	/**
	 * Constructor.
	 * 
	 * @param rounds
	 *            the total number of rounds of the whole simulation.
	 */
	public UtilityResults(int rounds) {
		this.entries = new ArrayList<UtilityEntry>(2 * rounds + 1);
	}

	/**
	 * @see SimulationResults#saveResults(java.util.Date)
	 */
	@Override
	public void saveResults(Date timestamp) {
		String time = timestamp.toString().replaceAll(":", "-");
		String filename = LogUtil.RESULTS_FOLDER + "Utility__" + time;

		// Create Chart
		XYChart chart = new XYChartBuilder().width(1024).height(768).title("Utility of the Managed System")
				.xAxisTitle("Time (ms)").yAxisTitle("Utility").theme(ChartTheme.Matlab).build();

		// Customize Chart
		chart.getStyler().setXAxisTickMarkSpacingHint(100);
		chart.getStyler().setChartBackgroundColor(new Color(255, 255, 255));
		chart.getStyler().setLegendPosition(LegendPosition.OutsideE);
		chart.getStyler().setAxisTitlesVisible(true);
		chart.getStyler().setDefaultSeriesRenderStyle(XYSeriesRenderStyle.Step);

		// Data series for charts
		List<Double> timeData = new ArrayList<Double>(this.entries.size());
		List<Double> utilityData = new ArrayList<Double>(this.entries.size());

		// file writer for csv
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filename + ".csv");
			fileWriter.append("Round" + CSV_SEP + "Timestamp (ms)" + CSV_SEP + "Utility" + CSV_NEW_LINE);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// fill data series for chart and file writer for csv
		for (UtilityEntry log : this.entries) {
			int round = log.getRound();
			double utilityValue = log.getUtilityValue();
			long timeStamp = log.getTimeStamp();

			// fill data series for chart
			timeData.add((double) timeStamp);
			utilityData.add(utilityValue);

			// fill file writer for csv
			try {
				fileWriter.append(round + CSV_SEP + timeStamp + CSV_SEP + utilityValue + CSV_NEW_LINE);
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
		chart.addSeries("Utility", timeData, utilityData);
		super.saveChart(chart, filename);
	}

}
