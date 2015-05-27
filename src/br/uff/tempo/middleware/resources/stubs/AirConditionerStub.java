package br.uff.tempo.middleware.resources.stubs;

import java.util.ArrayList;
import java.util.List;

import br.uff.tempo.middleware.comm.current.api.Tuple;
import br.uff.tempo.middleware.management.stubs.ResourceAgentStub;
import br.uff.tempo.middleware.resources.interfaces.IAirConditioner;

public class AirConditionerStub extends ResourceAgentStub implements IAirConditioner {
	
	private static final long serialVersionUID = 1L;

	public AirConditionerStub(String calleeID) {
		super(calleeID);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void liga() {
		List<Tuple<String, Object>> params = new ArrayList<Tuple<String, Object>>();
		
		makeCall("liga", params, int.class);		
	}

	@Override
	public void desliga() {
		List<Tuple<String, Object>> params = new ArrayList<Tuple<String, Object>>();
		
		makeCall("desliga", params, int.class);
		
	}

	@Override
	public void aumentaPotencia() {
		List<Tuple<String, Object>> params = new ArrayList<Tuple<String, Object>>();
		
		makeCall("aumentaPotencia", params, int.class);
		
	}

	@Override
	public void diminuiPotencia() {
		List<Tuple<String, Object>> params = new ArrayList<Tuple<String, Object>>();
		
		makeCall("diminuiPotencia", params, int.class);
	}
}
