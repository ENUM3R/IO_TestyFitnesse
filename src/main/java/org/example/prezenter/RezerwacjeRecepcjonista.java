package org.example.prezenter;

import org.example.model.*;
import org.example.widok.WysylaniePotwierdzen;


public class RezerwacjeRecepcjonista implements ZarzadzanieRezerwacjamiStrategia {

	private UstawieniePrzypomnieniaONadchodzacejRezerwacji przypomnienie;
	private WysylaniePotwierdzen powiadomienie;
	private DAOInterfejs dao;
	private String[] bledneDane;

	public RezerwacjeRecepcjonista() {
		// TODO - implement prezenter.RezerwacjeRecepjonista.prezenter.RezerwacjeRecepjonista
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idKlienta
	 * @param filtry
	 * @param sortowanie
	 */
	public DaneRezerwacji[] przegladajRezerwacje(int idKlienta, Filtry filtry, Sortowanie sortowanie) {
		// TODO - implement prezenter.RezerwacjeRecepjonista.przegladajRezerwacje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param daneDoRezerwacji
	 */
	public String[] dokonajRezerwacje(DaneDoRezerwacji daneDoRezerwacji) {
		// TODO - implement prezenter.RezerwacjeRecepjonista.dokonajRezerwacji
		throw new UnsupportedOperationException();
	}

	private String[] walidujDaneRezerwacji(DaneDoRezerwacji daneDoRezerwacji) {
		// TODO - implement prezenter.RezerwacjeRecepjonista.walidujDaneRezerwacji
		throw new UnsupportedOperationException();
	}

	public String usunRezerwacje(int idRezerwacji) {
		// TODO - implement prezenter.RezerwacjeRecepjonista.usunRezerwacje
		throw new UnsupportedOperationException();
	}

	public String[] modyfikujRezerwacje(DaneRezerwacji daneRezerwacji) {
		// TODO - implement prezenter.RezerwacjeRecepjonista.modyfikujRezerwacje
		throw new UnsupportedOperationException();
	}

	private boolean dokonajPlatnosc(String nrKarty, String dataWaznosciKarty, String kodCVV) {
		// TODO - implement prezenter.RezerwacjeRecepjonista.dokonajPlatnosc
		throw new UnsupportedOperationException();
	}

}