package org.example.prezenter;

import org.example.model.DAOInterfejs;
import org.example.widok.WysylaniePotwierdzen;

public class ZarzadzanieOpiniamiHotelu implements ZarzadzanieOpiniami {

	private WysylaniePotwierdzen potwierdzenie;
	private DAOInterfejs dao;

	/**
	 * 
	 * @param nrMieszkania
	 * @param opinia
	 */
	public String wystawOpinie(int nrMieszkania, String opinia) {
		// TODO - implement ZarzadzanieOpiniamiHotelu.wystawOpinie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idOpinii
	 */
	public String usunOpinie(int idOpinii) {
		// TODO - implement ZarzadzanieOpiniamiHotelu.usunOpinie
		throw new UnsupportedOperationException();
	}

}