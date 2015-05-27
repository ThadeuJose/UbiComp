package br.uff.tempo.middleware.resources;

import br.uff.tempo.middleware.management.ResourceAgent;
import br.uff.tempo.middleware.management.utils.Position;
import br.uff.tempo.middleware.resources.interfaces.IAirConditioner;

public class AirConditioner extends ResourceAgent implements IAirConditioner {
	
	private final int POTENCIA_MAXIMA = 5;
	private final int POTENCIA_MINIMA = 0;

	private static final String TAG = "AirConditioner";
	private static final long serialVersionUID = 1L;
	
	private int potenciaAtual;
	private boolean ligado;

	public AirConditioner(String name, String type, String rans) {
		super(name,"br.uff.tempo.middleware.resources.Thermostat", rans);
	}
	
	public AirConditioner(String name, String rans, Position position) {
		super(name, "br.uff.tempo.middleware.resources.Thermostat", rans, position);
	}

	

	@Override
	public void notificationHandler(String rai, String method, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void liga() {
		if(!ligado)ligado=true;		
		potenciaAtual=1;
	}

	@Override
	public void desliga() {
		if(ligado)ligado=false;
	}

	@Override
	public void aumentaPotencia() {
		if(potenciaAtual < POTENCIA_MAXIMA) potenciaAtual++;		
	}

	@Override
	public void diminuiPotencia() {
		if(potenciaAtual > POTENCIA_MINIMA) potenciaAtual--;
		
	}
	

}

