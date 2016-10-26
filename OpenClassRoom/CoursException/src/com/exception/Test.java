package com.exception;

public class Test {

	public static void main(String[] args) {
		int j = 20, i =0;
		try {
			System.out.println(j/i);
		} catch (ArithmeticException e) {
			System.out.println("Division par zero! " + e.getMessage());
		} finally{
			System.out.println("Action faite systématiquement");
		}
		System.out.println("Programme terminé");
	}
	
	// Reste a refaire la classe ville présente dans le cours d'openclassroom
	// Puis créer les exception de ce meme cours pour servir d'exemple complet.
}
