package com.enumeration;

/*
 * Exemple permétant d'afficher les valeur d'une enumeration
 * ou appel la méthode toString si elle est redéfini dans l'enum
 */


public class Main {
	public static void main(String[] args) {
		for(Langage langage : Langage.values()){
			System.out.println(langage + "\t Sont EDI est : "+ langage.getEditor());
		}

	}
}
