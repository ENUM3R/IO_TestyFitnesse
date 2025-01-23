package org.example.model;

import java.util.Date;

public class Filtry {

	private int cenaOd;
	private int cenaDo;
	private Date terminOd;
	private Date terminDo;
	private int ileOs;

	public int getCenaOd() {
		return this.cenaOd;
	}

	public void setCenaOd(int cenaOd) {
		this.cenaOd = cenaOd;
	}

	public int getCenaDo() {
		return this.cenaDo;
	}

	public void setCenaDo(int cenaDo) {
		this.cenaDo = cenaDo;
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

	public int getIleOs() {
		return this.ileOs;
	}

	public void setIleOs(int ileOs) {
		this.ileOs = ileOs;
	}

}