package com.voiture;

public enum Marque {
	RENO ("RENO"),
	PIGEOT ("PIGEOT"),
	TROEN ("TROEN");
	
	//Variable
	private String description = "";
	
	// Constructeur
	Marque(String description){
		this.description = description;
	}
	
	// Methode toString
	public String toString(){
		return this.description;
	}
}
