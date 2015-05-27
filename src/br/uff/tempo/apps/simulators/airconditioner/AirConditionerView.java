package br.uff.tempo.apps.simulators.airconditioner;

import android.os.Bundle;
import br.uff.tempo.R;
import br.uff.tempo.apps.simulators.AbstractPanel;
import br.uff.tempo.apps.simulators.AbstractView;
import br.uff.tempo.middleware.management.interfaces.IResourceAgent;
import br.uff.tempo.middleware.resources.AirConditioner;

public class AirConditionerView extends AbstractView{

	@Override
	public IResourceAgent createNewResourceAgent() {
		String name = "GeneralAirConditioner" + getNextID();
		return new AirConditioner(name, name);
	}

	@Override
	public void createView(Bundle savedInstanceState) {
		setContentView(R.layout.airconditioner);
		
	}

	@Override
	public AbstractPanel getPanel() {
		return (AbstractPanel) findViewById(R.id.airconditionerPanel);
	}

}
