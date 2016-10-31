package com.genericite;

// Version sans la genericité
// Voir Solo2 pour la genericité

class Solo2<T> {
	private T valeur;
	
	public T getValeur(){
		return this.valeur;
	}
	
	public void setValeur(T valeur){
		this.valeur = valeur;
	}
	
	public Solo2(){
		this.valeur = null;
	}
	
	public Solo2(T valeur){
		this.valeur = valeur;
	}
}
