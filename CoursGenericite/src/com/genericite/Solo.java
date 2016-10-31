package com.genericite;

// Version sans la genericité
// Voir Solo2 pour la genericité

public class Solo {
	private Object valeur;
	
	public Object getValeur(){
		return this.valeur;
	}
	
	public void setValeur(Object valeur){
		this.valeur = valeur;
	}
	
	public Solo(){
		this.valeur = null;
	}
	
	public Solo(Object valeur){
		this.valeur = valeur;
	}
}
