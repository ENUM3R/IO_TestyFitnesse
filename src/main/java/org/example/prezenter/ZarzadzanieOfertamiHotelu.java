package org.example.prezenter;

import org.example.model.*;

public class ZarzadzanieOfertamiHotelu implements ZarzadzanieOfertami {

	private DAOInterfejs dao;


	public Oferta[] przegladajOferty(Filtry filtry, Sortowanie sortowanie) {
		// TODO - implement ZarzadanieOfertamiHotelu.przegladajOferty
		throw new UnsupportedOperationException();
	}


	public String aktualizujOferte(Oferta oferta) {
		// TODO - implement ZarzadanieOfertamiHotelu.aktualizujOferte
		throw new UnsupportedOperationException();
	}

	protected String sprawdzPoprawnoscOferty(Oferta oferta) {
		if (oferta.getIdOferty() < 1) {
			return "Błąd: id oferty nie może być mniejsze od 1";
		}
		if (oferta.getNrPokoju() == null || !oferta.getNrPokoju().matches("^[a-zA-Z0-9]+$") ){
			return "Błąd: numer pokoju zawiera niedozwolone znaki";
		}
		if (oferta.getOpisPokoju().isEmpty()) {
			return "Błąd: opis pokoju nie może być pusty";
		}
		if (oferta.getCena() <= 0) {
			return "Błąd: cena nie może być mniejsza lub równa od 0";
		}
		return null;
	}

	public String dodajOferte(Oferta oferta) {
		// TODO - implement ZarzadanieOfertamiHotelu.dodajOferte
		throw new UnsupportedOperationException();
	}

	public boolean usunOferte(int idOferty) {
		// TODO - implement ZarzadanieOfertamiHotelu.usunOferte
		throw new UnsupportedOperationException();
	}

}