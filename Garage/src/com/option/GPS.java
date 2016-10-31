package com.option;

public class GPS implements Option{
	
	//Variables
	private float prix = 113.5f;
	
	// methode getPrix
	@Override
	public float getPrix() {
		return prix;
	}
	
	// Methode toStrng retourne le nom de l'otion et son prix sous forme de text
	public String toString(){
		return "GPS (" + this.getPrix() + "€)";
	}

}
