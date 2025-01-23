package org.example.prezenter;

import org.example.model.*;

public class LogowanieDoSystemu implements Logowanie {

	private final Role rolaUzytkownika;
	private DAOInterfejs dao;


	public LogowanieDoSystemu(Role rola) {
		this.rolaUzytkownika = rola;
	}


	public String zaloguj(String nazwaUzytkownika, String haslo) {
		String bledneDane = sprawdzDane(nazwaUzytkownika, haslo);
		if (bledneDane != null) {
			return bledneDane;
		}
		String idUzytkownika = dao.zwrocIdUzytkownika(nazwaUzytkownika, haslo);
		if (idUzytkownika.equals("-1")) {
			return "Niepoprawne dane logowania";
		}
		return idUzytkownika;
	}



	public String zarejestruj(String nazwaUzytkownika, String haslo, Role rola) {
		String dostep = sprawdzRole(rola);
		if (dostep != null) {
			return dostep;
		}

		String bledneDane = sprawdzDane(nazwaUzytkownika, haslo);
		if (bledneDane != null) {
			return bledneDane;
		}

		boolean czyNazwaZajeta = dao.czyUzytkownikIstnieje(nazwaUzytkownika);
		if (czyNazwaZajeta) {
			return "Nazwa użytkownika zajęta";
		}

		boolean czyZalozonoKonto = dao.dodajUzytkownika(nazwaUzytkownika, haslo, rola);
		if (!czyZalozonoKonto) {
			return "Błąd wewnętrzny. Przepraszamy";
		}

		return null;
	}

	protected String sprawdzRole(Role rola) {
		if (rola == null) {
			return "brak roli";
		}
		if ((rola == Role.recepcjonista || rola == Role.kierownik) && rolaUzytkownika != Role.kierownik) {
			return "Nie masz odpowiednich uprawnień";
		}
		return null;
	}

	protected String sprawdzDane(String email, String haslo) {
		if (email == null || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
			return "Niepoprawny adres email";
		}

		if (haslo == null || !haslo.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$")){
			return "Niepoprawne haslo";
		}
		return null;
	}

}