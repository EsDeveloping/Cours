package com.option;

public class SiegeChauffant implements Option{
	
	//Variables
	private float prix = 562.9f;
	
	// methode getPrix
	@Override
	public double getPrix() {
		return prix;
	}
	
	// Methode toStrng retourne le nom de l'otion et son prix sous forme de text
	public String toString(){
		return "Siège chauffant (" + this.getPrix() + "€)";
	}

}
