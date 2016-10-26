package com.enumeration;

/*
 *  Cours sur les enumerations
 *  
 *  From: https://openclassrooms.com/courses/apprenez-a-programmer-en-java/les-enumerations-1
 */


public enum Langage {
	JAVA ("Langage JAVA" ,"Eclipse"),
	C ("Langage C", "Code Block"),
	CPlus ("Langage C++", "Visual Studio"),
	PHP ("Langage PHP", "PS Pad");
	
	private String name = "";
	private String editor = "";
	
	Langage(String name, String editor){
		// Pas de déclaration de porté car le constructeur d'une enum 
		//	doit être privé pour que les valeur ne soit pas modifié.
		this.name = name;
		this.editor = editor;
	}
	
	public String getEditor(){
		return this.editor;
	}
	
	public String toString(){
		return name;
	}
}
