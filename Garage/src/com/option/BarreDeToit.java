package com.option;

public class BarreDeToit implements Option{
	
	//Variables
	private float prix = 29.9f;
	
	// methode getPrix
	@Override
	public float getPrix() {
		return prix;
	}
	
	// Methode toStrng retourne le nom de l'otion et son prix sous forme de text
	public String toString(){
		return "Barre de toit (" + this.getPrix() + "€)";
	}

}
