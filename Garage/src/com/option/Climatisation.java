package com.option;

public class Climatisation implements Option{
	
	//Variables
	private float prix = 347.3f;
	
	// methode getPrix
	@Override
	public double getPrix() {
		return prix;
	}
	
	// Methode toStrng retourne le nom de l'otion et son prix sous forme de text
	public String toString(){
		return "Climatisation (" + this.getPrix() + "€)";
	}

}
