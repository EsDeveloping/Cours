package com.dialog;

public class ZDialogInfo {
	private String nom, sexe, age, cheveux, taille;
	
	public ZDialogInfo(){}
	public ZDialogInfo(String nom, String sexe, String age, String cheveux, String taille){
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
		this.cheveux = cheveux;
		this.taille = taille;
	}
	
	public String toString(){
		String str = "";
		if(this.nom != null && this.nom.compareTo("") != 0 && this.sexe != null && this.age != null && this.cheveux != null && this.taille != null){
			str = "Description de l'objet InfoZDialog\n";
			str += "Nom : " + this.nom + "\n"
					+ "Sexe :" + this.sexe + "\n"
							+ "Age : " + this.age + "\n"
									+ "Cheveux : " + this.cheveux + "\n"
											+ "Taille : " + this.taille + "\n";	
		}else{
			str = "Aucune information";
		}
		return str;
	}
}
