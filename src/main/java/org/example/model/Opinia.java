package org.example.model;

public class Opinia {

	private String nazwaUzytkownika;
	private String tresc;
	private int idOpinii;

	public void setNazwaUzytkownika(String nazwaUzytkownika) {
		this.nazwaUzytkownika = nazwaUzytkownika;
	}

	public String getTresc() {
		return this.tresc;
	}

	public String getNazwaUzytkownika() {
		return this.nazwaUzytkownika;
	}

	public int getIdOpinii() {
		return this.idOpinii;
	}

	public Opinia(String nazwaUzytkownika, int idOpinii, String tresc) {
		this.nazwaUzytkownika = nazwaUzytkownika;
		this.idOpinii = idOpinii;
		this.tresc = tresc;
	}

}