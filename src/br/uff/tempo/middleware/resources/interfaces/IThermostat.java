package br.uff.tempo.middleware.resources.interfaces;

import br.uff.tempo.middleware.management.interfaces.IResourceAgent;

public interface IThermostat extends IResourceAgent {

	/**
	 * Gets the current temperature
	 * 
	 * @return An integer that represents the temperature
	 */
	public int getTemperature();

	/**
	 * Changes the current temperature to <code>degree</code>
	 * 
	 * @param degree
	 *            An integer that represents the new degree
	 */
	public void setTemperature(int degree);

}