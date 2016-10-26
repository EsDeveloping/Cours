package com.enumeration;

/*
 *   Class representant une manière de faire avant les énumerations
 *   
 *   From https://openclassrooms.com/courses/apprenez-a-programmer-en-java/les-enumerations-1
 
 *	Le problème de cette façon de faire est quel n'empèche pas de passer 
 *	des paramètres non geré par les méthode la classe exemple ligne 28
 *           Les ENUM corrige ce problème     */

public class AvantEnumeration {

	  public static final int PARAM1 = 1;
	  public static final int PARAM2 = 2;
	   
	  public void fait(int param){
	    if(param == PARAM1)
	      System.out.println("Fait à la façon N°1");
	    if(param == PARAM2)
	      System.out.println("Fait à la façon N°2");
	  }
	   
	  public static void main(String args[]){
	    AvantEnumeration ae = new AvantEnumeration();
	    ae.fait(AvantEnumeration.PARAM1);
	    ae.fait(AvantEnumeration.PARAM2);
	    ae.fait(4); // Cette ligne ne fait aucune action car le paramètre 4 n'est pas utilisé dans la méthode fait
	  }
	}