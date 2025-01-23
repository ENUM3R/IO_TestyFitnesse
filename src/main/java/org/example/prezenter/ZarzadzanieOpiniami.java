package org.example.prezenter;

public interface ZarzadzanieOpiniami {

	/**
	 * 
	 * @param nrMieszkania
	 * @param opinia
	 */
	String wystawOpinie(int nrMieszkania, String opinia);

	/**
	 * 
	 * @param idOpinii
	 */
	String usunOpinie(int idOpinii);

}