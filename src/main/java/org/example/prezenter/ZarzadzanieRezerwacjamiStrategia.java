package org.example.prezenter;

import org.example.model.*;

public interface ZarzadzanieRezerwacjamiStrategia {

	/**
	 * 
	 * @param idKlienta
	 * @param filtry
	 * @param sortowanie
	 */
	DaneRezerwacji[] przegladajRezerwacje(int idKlienta, Filtry filtry, Sortowanie sortowanie);

	/**
	 * 
	 * @param daneDoRezerwacji
	 */
	String[] dokonajRezerwacje(DaneDoRezerwacji daneDoRezerwacji);

	/**
	 * 
	 * @param idRezerwacji
	 */
	String usunRezerwacje(int idRezerwacji);

	/**
	 * 
	 * @param daneRezerwacji
	 */
	String[] modyfikujRezerwacje(DaneRezerwacji daneRezerwacji);

}