package org.example.widok;

import org.example.model.DaneDoRezerwacji;

public interface WysylaniePotwierdzen {

	/**
	 * 
	 * @param daneDoRezerwacji
	 */
	boolean wyslijPotwierdzenieRezerwacji(DaneDoRezerwacji daneDoRezerwacji);

	/**
	 * 
	 * @param tresc
	 * @param nrMieszkania
	 */
	boolean wyslijPotwierdzenieOpinii(String tresc, int nrMieszkania);

}