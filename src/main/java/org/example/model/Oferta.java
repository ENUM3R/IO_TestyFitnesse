package org.example.model;

public class Oferta {

	private int idOferty;
	private String nrPokoju;
	private String opisPokoju;
	private Opinia[] opinie;
	private double cena;


	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}


	public int getIdOferty() {
		return this.idOferty;
	}


	public void setIdOferty(int idOferty) {
		this.idOferty = idOferty;
	}

	public String getNrPokoju() {
		return this.nrPokoju;
	}


	public void setNrPokoju(String nrPokoju) {
		this.nrPokoju = nrPokoju;
	}

	public String getOpisPokoju() {
		return this.opisPokoju;
	}


	public void setOpisPokoju(String opisPokoju) {
		this.opisPokoju = opisPokoju;
	}

	public Opinia[] getOpinie() {
		return this.opinie;
	}

	public void setOpinie(Opinia[] opinie) {
		this.opinie = opinie;
	}

}