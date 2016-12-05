package com.thread;

public class CompteEnBanque {
	private int solde = 100;
	
	public int getSolde(){
		if(this.solde < 0)
			System.out.println("Vous êtes à découvert !");
		return this.solde;
	}
	
	public synchronized void retraitArgent(int retrait, String name){
		solde = solde - retrait;
		System.out.println("Compte " + name + " = " + solde);
	}
}
