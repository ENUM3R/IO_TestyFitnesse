package org.example.model;

public interface DAOInterfejs {

	static DAOInterfejs getInstance() {
		return null;
	}

	boolean dodajOpinie(String nazwaUzytkownika, String tresc, int nrMieszkania);


	boolean usunOpinie(int idOpinii);

	Oferta[] podajOferty(Filtry filtry, Sortowanie sortowanie);


	boolean dodajOferte(Oferta oferta);


	boolean usunOferte(int idOferty);


	boolean modyfikujOferte(Oferta oferta);


	boolean czyUzytkownikIstnieje(String nazwaUzytkownika);


	String zwrocIdUzytkownika(String nazwaUzytkownika, String haslo);


	boolean dodajUzytkownika(String nazwaUzytkownika, String haslo, Role rola);


	DaneRezerwacji[] podajRezerwacje(Filtry filtry, Sortowanie sortowanie);


	int dodajRezerwacje(DaneDoRezerwacji dane);


	boolean usunRezerwacje(int idRezerwacji);


	boolean modyfikujRezerwacje(DaneRezerwacji dane);

}