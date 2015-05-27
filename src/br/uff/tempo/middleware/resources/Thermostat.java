package br.uff.tempo.middleware.resources;

import br.uff.tempo.middleware.management.ResourceAgent;
import br.uff.tempo.middleware.management.utils.Position;
import br.uff.tempo.middleware.resources.interfaces.IThermostat;

public class Thermostat extends ResourceAgent implements IThermostat {

	private static final String TAG = "Thermostat";
	private static final long serialVersionUID = 1L;
	
	private int temperature;

	public Thermostat(String name, String rans) {
		super(name,"br.uff.tempo.middleware.resources.Thermostat", rans);
	}
	
	public Thermostat(String name, String rans, Position position) {
		super(name, "br.uff.tempo.middleware.resources.Thermostat", rans, position);
	}

	@Override
	public int getTemperature() {
		return temperature;
	}

	@Override
	public void setTemperature(int degree) {
		temperature=degree;
		
	}

	@Override
	public void notificationHandler(String rai, String method, Object value) {
		// TODO Auto-generated method stub
		
	}
	

}
