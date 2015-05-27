package br.uff.tempo.middleware.resources.interfaces;

import br.uff.tempo.middleware.management.interfaces.IResourceAgent;

public interface IAirConditioner extends IResourceAgent {

	//liga o aparelho
	public void liga();
	//desliga o aparelho
	public void desliga();
	//aumentar potencia
	public void aumentaPotencia();
	//diminui potencia
	public void diminuiPotencia();

}