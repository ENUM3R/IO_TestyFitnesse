package org.example.prezenter;

import org.example.model.*;

public interface ZarzadzanieOfertami {

	/**
	 * 
	 * @param filtry
	 * @param sortowanie
	 */
	Oferta[] przegladajOferty(Filtry filtry, Sortowanie sortowanie);

	/**
	 * 
	 * @param oferta
	 */
	String aktualizujOferte(Oferta oferta);

	/**
	 * 
	 * @param oferta
	 */
	String dodajOferte(Oferta oferta);

	/**
	 * 
	 * @param idOferty
	 */
	boolean usunOferte(int idOferty);

}