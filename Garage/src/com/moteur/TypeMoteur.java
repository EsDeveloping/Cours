package com.moteur;

public enum TypeMoteur {
	DIESEL ("Moteur DIESEL"),
	ESSENCE ("Moteur ESSENCE"),
	HYBRIDE ("Moteur HYBRIDE"),
	ELECTRIQUE ("Moteur ELECTRIQUE");
	
	// Variable
	private String description = "";
	
	// Constructeur
	TypeMoteur(String description){
		this.description = description;
	}
	
	// Methode toString
	public String toString(){
		return this.description;
	}
}
