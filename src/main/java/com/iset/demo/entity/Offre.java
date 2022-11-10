package com.iset.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Offre {
	@Id
	@GeneratedValue
	long code;
	String intitulé;
	String specialité;
	String société;
	int nbpostes;
	String pays;
	String logo;

	public Offre() {
	}

	public Offre(String intitulé, String specialité, String société, int nbpostes, String pays, String logo) {
		super();
		this.intitulé = intitulé;
		this.specialité = specialité;
		this.société = société;
		this.nbpostes = nbpostes;
		this.pays = pays;
		this.logo = logo;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getIntitulé() {
		return intitulé;
	}

	public void setIntitulé(String intitulé) {
		this.intitulé = intitulé;
	}

	public String getSpecialité() {
		return specialité;
	}

	public void setSpecialité(String specialité) {
		this.specialité = specialité;
	}

	public String getSociété() {
		return société;
	}

	public void setSociété(String société) {
		this.société = société;
	}

	public int getNbpostes() {
		return nbpostes;
	}

	public void setNbpostes(int nbpostes) {
		this.nbpostes = nbpostes;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Offre [code=" + code + ", intitulé=" + intitulé + ", specialité=" + specialité + ", société=" + société
				+ ", nbpostes=" + nbpostes + ", pays=" + pays + "]";
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}