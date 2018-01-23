package de.mdelab.simulator.impl;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import de.mdelab.simulator.SimulatorImpl;

/**
 * Log utility class of the simulator.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class LogUtil {

	/**
	 * Folder where the logs and simulation results are stored.
	 */
	public static String RESULTS_FOLDER = "./results/";
	/**
	 * The name of the log file.
	 */
	protected static String LOG_FILE = "Simulator.log";

	// various separators for headers
	/**
	 * Separator to structure the log file.
	 */
	public final static String H4 = "----------------------------------------------------------------------------------------------";
	/**
	 * Separator to structure the log file.
	 */
	public final static String H3 = "==============================================================================================";
	/**
	 * Separator to structure the log file.
	 */
	public final static String H2 = "**********************************************************************************************";
	/**
	 * Separator to structure the log file.
	 */
	public final static String H1 = "**********************************************************************************************\n**********************************************************************************************";

	/**
	 * Configures the logging of the simulator.
	 * 
	 * @param logLevel
	 *            the log level of the simulator.
	 * @param logToConsole
	 *            if <code>true</code>, logs are printed to the console, otherwise
	 *            not.
	 */
	public static void configLogging(Level logLevel, boolean logToConsole) {

		// get the global logger to configure it
		Logger logger = Logger.getLogger("de.mdelab.simulator");
		logger.setLevel(logLevel);

		// Handlers are configured below. So no need for any parent handler.
		logger.setUseParentHandlers(false);

		// create a TXT formatter
		Formatter formatterTxt = new SimpleFormatter();
		formatterTxt = new java.util.logging.Formatter() {

			@Override
			public String format(LogRecord record) {
				StringBuffer buffer = new StringBuffer();

				String loggerName = record.getLoggerName();
				String simpleLoggerName = loggerName.substring(loggerName.lastIndexOf(".") + 1);

				if (!simpleLoggerName.equals(SimulatorImpl.class.getSimpleName())) {
					buffer.append("[" + record.getLevel() + "] ");
					// buffer.append(simpleLoggerName + ": ");
				}
				buffer.append(record.getMessage());
				buffer.append("\n");
				return buffer.toString();
			}
		};

		// remove all handlers
		Handler[] handlers = logger.getHandlers();
		for (Handler h : handlers) {
			logger.removeHandler(h);
		}

		if (logToConsole) {
			ConsoleHandler consoleHandler = new ConsoleHandler();
			consoleHandler.setFormatter(formatterTxt);
			consoleHandler.setLevel(logLevel);
			logger.addHandler(consoleHandler);
		}

		try {
			FileHandler fileHandler = new FileHandler(RESULTS_FOLDER + LOG_FILE);
			fileHandler.setLevel(logLevel);
			fileHandler.setFormatter(formatterTxt);
			logger.addHandler(fileHandler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
