package de.mdelab.simulator.impl;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.internal.chartpart.Chart;

/**
 * Collection of {@link SimulationResultsEntry} objects collected over the whole
 * simulation.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 * @param <T>
 *            the type of entries ({@link SimulationResultsEntry}) that are
 *            collected.
 */
public abstract class SimulationResults<T extends SimulationResultsEntry> {

	/**
	 * Separator of the CSV file.
	 */
	protected static String CSV_SEP = ";";
	/**
	 * New line character for the CSV file.
	 */
	protected static String CSV_NEW_LINE = "\n";

	/**
	 * List of simulation results entries.
	 */
	protected List<T> entries;

	/**
	 * Adds the given entry to the simulation results.
	 * 
	 * @param entry
	 *            the entry to be added.
	 */
	public void addEntry(T entry) {
		this.entries.add(entry);
	}

	/**
	 * Returns the list of simulation results entries.
	 * 
	 * @return the list of simulation results entries.
	 */
	public List<T> getEntries() {
		return this.entries;
	}

	/**
	 * Saves the given chart to the given file.
	 * 
	 * @param chart
	 *            the chart to be saved.
	 * @param fqFilename
	 *            the fully qualified name of the file.
	 */
	protected void saveChart(Chart<?, ?> chart, String fqFilename) {
		try {
			BitmapEncoder.saveBitmapWithDPI(chart, fqFilename, BitmapFormat.PNG, 300);
		} catch (IOException e) {
			System.err.println("Cannot save chart to " + fqFilename);
			e.printStackTrace();
		}
	}

	/**
	 * Saves this results collected over the whole simulation.
	 * 
	 * @param timestamp
	 *            the time stamp when the simulation has finished.
	 */
	public abstract void saveResults(Date timestamp);

}
