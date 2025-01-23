package org.example.prezenter;

import org.example.model.*;
import org.example.widok.WysylaniePotwierdzen;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class RezerwacjeKlient implements ZarzadzanieRezerwacjamiStrategia {

	private UstawieniePrzypomnieniaONadchodzacejRezerwacji przypomnienie;
	private WysylaniePotwierdzen powiadomienie;
	private DAOInterfejs dao;


	public DaneRezerwacji[] przegladajRezerwacje(int idKlienta, Filtry filtry, Sortowanie sortowanie) {
		// TODO - implement prezenter.RezerwacjeKlient.przegladajRezerwacje
		throw new UnsupportedOperationException();
	}

	public String[] dokonajRezerwacje(DaneDoRezerwacji daneDoRezerwacji) {
		String[] bledneDane = walidujDaneRezerwacji(daneDoRezerwacji);
		if (bledneDane != null) {
			return bledneDane;
		}

		boolean czyPotwierdzone = powiadomienie.wyslijPotwierdzenieRezerwacji(daneDoRezerwacji);
		if (!czyPotwierdzone) {
			return new String[]{"Nie można dokonać rezerwacji"};
		}

		boolean czyPobranoOplate = dokonajPlatnosc(daneDoRezerwacji.getNrKarty(),
						daneDoRezerwacji.getDataWaznosciKarty(),
						daneDoRezerwacji.getKodCVV());
		if(!czyPobranoOplate) {
			return new String[]{"Błąd płatności"};
		}

		int idRezerwacji = dao.dodajRezerwacje(daneDoRezerwacji);
		if (idRezerwacji == -1) {
			return new String[]{"Błąd wewnętrzny. Przepraszamy"};
		}
		else {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dataPrzypomnienia;
			try {
				dataPrzypomnienia = sdf.parse(daneDoRezerwacji.getDataPrzypomnienia());
			}
			catch (Exception e) {
				return new String[]{"Błąd wewnętrzny. Przepraszamy"};
			}
			przypomnienie.dodajPrzypomnienie(idRezerwacji,
					dataPrzypomnienia,
					daneDoRezerwacji.getIdKlienta());
			return null;
		}
	}


	protected String[] walidujDaneRezerwacji(DaneDoRezerwacji daneDoRezerwacji) {
		if (daneDoRezerwacji.getImie() == null || !daneDoRezerwacji.getImie().matches("[a-zA-Z]+")) {
			return new String[]{"Imię zawiera niedozwolone znaki"};
		}
		if (daneDoRezerwacji.getNazwisko() == null || !daneDoRezerwacji.getNazwisko().matches("[a-zA-Z]+")) {
			return new String[]{"Nazwisko zawiera niedozwolone znaki"};
		}
		if (daneDoRezerwacji.getMiasto() == null || !daneDoRezerwacji.getMiasto().matches("[a-zA-Z]+")) {
			return new String[]{"Miasto zawiera niedozwolone znaki"};
		}
		if (daneDoRezerwacji.getUlica() == null || !daneDoRezerwacji.getUlica().matches("[a-zA-Z]+")) { // TODO: czy dodać cyfry i spacje np ul. 3 Maja?
			return new String[]{"Ulica zawiera niedozwolone znaki"};
		}
		if (daneDoRezerwacji.getNrDomu() == null || !daneDoRezerwacji.getNrDomu().matches("[1-9]+[a-zA-Z]?")) {
			return new String[]{"Numer domu zawiera niedozwolone znaki"};
		}
		if (daneDoRezerwacji.getNrMieszkania() <= 0) {
			return new String[]{"Numer mieszkania nie może być ujemny"};
		}
		if (daneDoRezerwacji.getKodPocztowy() == null || !daneDoRezerwacji.getKodPocztowy().matches("[0-9]{2}-[0-9]{3}")) {
			return new String[]{"Kod pocztowy niepoprawny"};
		}
		if (daneDoRezerwacji.getNrKarty() == null || !daneDoRezerwacji.getNrKarty().matches("[0-9]{16}")) {
			return new String[]{"Numer karty niepoprawny"};
		}
		if (daneDoRezerwacji.getDataWaznosciKarty() == null || !daneDoRezerwacji.getDataWaznosciKarty().matches("(0[1-9]|1[0-2])/([0-9]{2})")) {
			return new String[]{"Data ważności karty niepoprawna"};
		}

		if (daneDoRezerwacji.getKodCVV() == null || !daneDoRezerwacji.getKodCVV().matches("[0-9]{3}")) {
			return new String[]{"Kod CVV niepoprawny"};
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date terminOd, terminDo;
		try {
			LocalDate parsedDate = LocalDate.parse(daneDoRezerwacji.getTerminOd(), formatter);
			terminOd = sdf.parse(daneDoRezerwacji.getTerminOd());
		}
		catch (Exception e) {
			return new String[]{"Data początkowa niepoprawna"};
		}

		try {
			LocalDate parsedDate = LocalDate.parse(daneDoRezerwacji.getTerminDo(), formatter);
			terminDo = sdf.parse(daneDoRezerwacji.getTerminDo());
		}
		catch (Exception e) {
			return new String[]{"Data końcowa niepoprawna"};
		}

		if (terminOd.after(terminDo)) {
			return new String[]{"Data początkowa nie może być po dacie końcowej"};
		}

		try {
			LocalDate parsedDate = LocalDate.parse(daneDoRezerwacji.getDataPrzypomnienia(), formatter);
			sdf.parse(daneDoRezerwacji.getDataPrzypomnienia());
		}
		catch (Exception e) {
			return new String[]{"Data przypomnienia niepoprawna"};
		}

		return null;
	}

	public String usunRezerwacje(int idRezerwacji) {
		// TODO - implement prezenter.RezerwacjeKlient.usunRezerwacje
		throw new UnsupportedOperationException();
	}

	public String[] modyfikujRezerwacje(DaneRezerwacji daneRezerwacji) {
		// TODO - implement prezenter.RezerwacjeKlient.modyfikujRezerwacje
		throw new UnsupportedOperationException();
	}

	protected boolean dokonajPlatnosc(String nrKarty, String dataWaznosciKarty, String kodCVV) {
		// TODO - implement prezenter.RezerwacjeKlient.dokonajPlatnosc
		throw new UnsupportedOperationException();
	}

}