package org.example.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DAOImplementacja implements DAOInterfejs {

	private static DAOImplementacja singleton;
	private String id = String.valueOf(0);
	public static DAOImplementacja getInstance() {
		if (singleton == null) {
			singleton = new DAOImplementacja();
		}
		return singleton;
	}


	public boolean dodajOpinie(String nazwaUzytkownika, String tresc, int nrMieszkania) {
		// TODO - implement DAOImlepmentacja.dodajOpinie
		throw new UnsupportedOperationException();
	}


	public boolean usunOpinie(int idOpinii) {
		// TODO - implement DAOImlepmentacja.usunOpinie
		throw new UnsupportedOperationException();
	}


	public Oferta[] podajOferty(Filtry filtry, Sortowanie sortowanie) {
		// TODO - implement DAOImlepmentacja.podajOferty
		throw new UnsupportedOperationException();
	}


	public boolean modyfikujOferte(Oferta oferta) {
		// TODO - implement DAOImlepmentacja.modyfikujOferte
		throw new UnsupportedOperationException();
	}


	public boolean czyUzytkownikIstnieje(String nazwaUzytkownika) {
		// TODO - implement DAOImlepmentacja.czyUzytkownikIstnieje
		throw new UnsupportedOperationException();
	}


	public String zwrocIdUzytkownika(String nazwaUzytkownika, String haslo) {
		if (nazwaUzytkownika == null || !nazwaUzytkownika.matches("[1-9]+[a-zA-Z]?")){
			return "Bledna nazwa uzytkownika!";
		}
		if (haslo == null || !haslo.matches("[a-zA-Z0-9]*")){
			return "Bledne haslo uzytkownika!";
		}
		id = id + 1;
        return id;
	}

	public boolean dodajUzytkownika(String nazwaUzytkownika, String haslo, Role rola) {
		// TODO - implement DAOImlepmentacja.dodajUzytkownika
		throw new UnsupportedOperationException();
	}


	public DaneRezerwacji[] podajRezerwacje(Filtry filtry, Sortowanie sortowanie) {
		// TODO - implement DAOImlepmentacja.podajRezerwacje
		throw new UnsupportedOperationException();
	}

	public int dodajRezerwacje(DaneDoRezerwacji dane) {
		// TODO - implement DAOImlepmentacja.dodajRezerwacje
		throw new UnsupportedOperationException();
	}

	public boolean usunRezerwacje(int idRezerwacji) {
		// TODO - implement DAOImlepmentacja.usunRezerwacje
		throw new UnsupportedOperationException();
	}

	public boolean modyfikujRezerwacje(DaneRezerwacji dane) {
		// TODO - implement DAOImlepmentacja.modyfikujRezerwacje
		throw new UnsupportedOperationException();
	}

	public boolean usunOferte(int idOferty) {
		// TODO - implement DAOImlepmentacja.usunOferte
		throw new UnsupportedOperationException();
	}

	public boolean dodajOferte(Oferta oferta) {
		// TODO - implement DAOImlepmentacja.dodajOferte
		throw new UnsupportedOperationException();
	}

	float obliczCene(DaneDoRezerwacji dane, float cena) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataOd = LocalDate.parse(dane.getTerminOd(), formatter);
		LocalDate dataDo = LocalDate.parse(dane.getTerminDo(), formatter);

		long daysBetween = ChronoUnit.DAYS.between(dataOd, dataDo);
		return (float)daysBetween * cena;
	}
}