package br.uff.tempo.middleware.resources.stubs;

import java.util.ArrayList;
import java.util.List;

import br.uff.tempo.middleware.comm.current.api.Tuple;
import br.uff.tempo.middleware.management.stubs.ResourceAgentStub;
import br.uff.tempo.middleware.resources.interfaces.IThermostat;

public class ThermostatStub extends ResourceAgentStub implements IThermostat {
	
	private static final long serialVersionUID = 1L;

	public ThermostatStub(String calleeID) {
		super(calleeID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTemperature() {
		List<Tuple<String, Object>> params = new ArrayList<Tuple<String, Object>>();
		
		return (Integer) makeCall("getTemperature", params, int.class);
	}



	@Override
	public void setTemperature(int degree) {
		List<Tuple<String, Object>> params = new ArrayList<Tuple<String, Object>>();
		params.add(new Tuple<String, Object>(Integer.class.getName(), degree));

		makeCall("setTemperature", params, void.class);
	}
}
