package com.option;

public class VitreElectrique implements Option{
	
	//Variables
	private float prix = 212.35f;
	
	// methode getPrix
	@Override
	public float getPrix() {
		return prix;
	}
	
	// Methode toStrng retourne le nom de l'otion et son prix sous forme de text
	public String toString(){
		return "Vittre electrique (" + this.getPrix() + "€)";
	}

}
