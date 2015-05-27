package br.uff.tempo.apps.simulators.thermostat;

import android.os.Bundle;
import br.uff.tempo.R;
import br.uff.tempo.apps.simulators.AbstractPanel;
import br.uff.tempo.apps.simulators.AbstractView;
import br.uff.tempo.middleware.management.interfaces.IResourceAgent;
import br.uff.tempo.middleware.resources.Thermostat;

public class ThermostatView extends AbstractView{

	@Override
	public IResourceAgent createNewResourceAgent() {
		String name = "GeneralThermostat" + getNextID();
		return new Thermostat(name, name);
	}

	@Override
	public void createView(Bundle savedInstanceState) {
		setContentView(R.layout.thermostat);
		
	}

	@Override
	public AbstractPanel getPanel() {
		return (AbstractPanel) findViewById(R.id.thermostatPanel);
	}

}
