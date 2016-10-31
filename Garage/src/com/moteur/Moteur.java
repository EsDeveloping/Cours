package com.moteur;

public abstract class Moteur {
	// Variable
	protected TypeMoteur type;
	protected String cylindre;
	private double prix;
	
	// Contructeur avec deux parametre: la cylindre et le prix
	public Moteur(String cylindre, double prix){
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	// Methode toString, retourne la methode toString de TypeMoteur + la cylindre
	public String toString(){
		return type.toString() + " " + this.cylindre;
	}
	
	// Methode getPrix, retourne le prix
	public double getPrix(){
		return this.prix;
	}
}
