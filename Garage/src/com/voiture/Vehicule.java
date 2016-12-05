package com.voiture;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.moteur.Moteur;
import com.option.Option;

public class Vehicule implements Serializable{
	
	// Variables
	private double prix = 0.0d;
	protected String nom;
	private List<Option> options = new ArrayList<Option>();
	protected Marque nomMarque;
	private Moteur moteur;
	
	
	// Methode setMoteur: ajoute le moteur et modifie le prix du vehicule
	public void setMoteur(Moteur moteur){
		this.moteur = moteur;
		this.prix += moteur.getPrix();
	}
	
	// Methode toString
	public String toString(){
		
		// Créations d'une variable qui va stocker la description de chaque option.
		String descriptionDesOptions = "";
		
		// on passe toutes les options en revu
		for(int i = 0; i < options.size(); i++){
			
			// on ajoute la description de l'option dans la variable descriptionDesOptions
			descriptionDesOptions += options.get(i).toString(); 
			
			// si l'option n'est pas la derniere alors
			if (i < options.size() - 1)
				
				// on ajoute une virgule
				descriptionDesOptions += ", ";
			
		} // Fin de la boucle for
		
		
		return "+ Voiture " + this.nomMarque.toString() + " : " + this.nom + " " + this.moteur.toString() + " [" +
				descriptionDesOptions + "] d'une valeur total de " + this.getPrix() + " €";
	}
	
	// Methode addOption: ajoute l'option est modifie le prix du vehicule
	public void addOption(Option opt){
		options.add(opt);
		this.prix += opt.getPrix();
	}
	
	// Methode getMarque
	public Marque getMarque(){
		return this.nomMarque;
	}
	
	// Methode getOptions
	public List<Option> getOption(){
		return this.options;
	}
	
	// Methode getPrix: retourne le prix
	public double getPrix(){	
		return this.prix;
	}
	
	

}
