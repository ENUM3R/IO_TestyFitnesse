package org.example.model;

import java.util.Date;

public class DaneRezerwacji {

	private String imie;
	private String nazwisko;
	private String miasto;
	private String ulica;
	private String nrDomu;
	private int nrMieszkania;
	private String kodPocztowy;
	private String nrKarty;
	private int idOferty;
	private int idKlienta;
	private int idRezerwacji;
	private Date terminOd;
	private Date terminDo;
	private Date dataPrzypomnienia;
	private float cena;

	public String getImie() {
		return this.imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getMiasto() {
		return this.miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public String getUlica() {
		return this.ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getNrDomu() {
		return this.nrDomu;
	}

	public void setNrDomu(String nrDomu) {
		this.nrDomu = nrDomu;
	}

	public int getNrMieszkania() {
		return this.nrMieszkania;
	}

	public void setNrMieszkania(int nrMieszkania) {
		this.nrMieszkania = nrMieszkania;
	}

	public String getKodPocztowy() {
		return this.kodPocztowy;
	}

	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}

	public String getNrKarty() {
		return this.nrKarty;
	}

	public void setNrKarty(String nrKarty) {
		this.nrKarty = nrKarty;
	}

	public int getIdOferty() {
		return this.idOferty;
	}

	public int getIdKlienta() {
		return this.idKlienta;
	}

	public int getIdRezerwacji() {
		return this.idRezerwacji;
	}

	public Date getTerminOd() {
		return this.terminOd;
	}

	public void setTerminOd(Date terminOd) {
		this.terminOd = terminOd;
	}

	public Date getTerminDo() {
		return this.terminDo;
	}

	public void setTerminDo(Date terminDo) {
		this.terminDo = terminDo;
	}

	public Date getDataPrzypomnienia() {
		return this.dataPrzypomnienia;
	}

	public void setDataPrzypomnienia(Date dataPrzypomnienia) {
		this.dataPrzypomnienia = dataPrzypomnienia;
	}

	public float getCena() {
		return this.cena;
	}

}