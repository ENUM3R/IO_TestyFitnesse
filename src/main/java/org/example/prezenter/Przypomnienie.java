package org.example.prezenter;

import java.util.Date;

public class Przypomnienie {

	private Date data;
	private int idRezerwacji;
	private int idKlienta;

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getIdRezerwacji() {
		return this.idRezerwacji;
	}

	public void setIdRezerwacji(int idRezerwacji) {
		this.idRezerwacji = idRezerwacji;
	}

	public int getIdKlienta() {
		return this.idKlienta;
	}

	public void setIdKlienta(int idKlienta) {
		this.idKlienta = idKlienta;
	}

}