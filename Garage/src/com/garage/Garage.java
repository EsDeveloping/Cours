package com.garage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.voiture.Vehicule;

public class Garage implements Serializable{
	
	// Variables
	private List<Vehicule> voitures = new ArrayList<Vehicule>();
	
	
	// Constructeur: Recharge le garge si il y en à un de sauvegardé
	public Garage(){
		
		// Création d'un try with ressource pour une fermeture automatique des flux
		try (FileInputStream fis = new FileInputStream("garage.txt");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			// On recupère la sauvegarde dans un object Garage tempGarage
			Garage tempGarage = (Garage) ois.readObject();
			
			// On copie la liste des voitures depuis tempGarage vers ce garage
			this.voitures = tempGarage.voitures;
			
		} catch (FileNotFoundException e) {
			// si le fichier n'est pas trouvé alors on ne fait rien il sera créer a la premiere suvegarde
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// Methode toString
	public String toString(){
		
		// Si le garage est vide
		if(voitures.size() == 0) 
			// On afficher une erreur
			System.err.println("Aucune voiture sauvegardée !"); 
		
		// Création du variable de type String
		String message;
		
		// Ajout de l'entête OpenClassRoom
		message = "***************************\n"
			 + "*  Garage OpenClassrooms  *\n"
			 + "***************************\n";
		
		// on passe toute les voitures du garage en revu
		for(Vehicule v: voitures){ 
			// On stock les description de celle-ci dans la variable texte
			message += v.toString() + "\n"; 
		}
		
		// On retourne la variable message
		return message;
	}
	
	// Methode addVoiture: on ajoute une voiture au garage puis on sauvegarde celui-ci
	public void addVoiture(Vehicule voiture){
		
		// Ajoute de la voiture
		this.voitures.add(voiture);
		
		
		// Appel de la fonction de vauvegarde
		saveGarage();
	}
	
	// Methode saveGarage: pour sauvegarder
	private void saveGarage(){
		
		// création d'un try with ressource pour une fermeture automatique des flux
		try (FileOutputStream fos = new FileOutputStream("garage.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			// Ecriture du garage dans un fichier
			oos.writeObject(this);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
