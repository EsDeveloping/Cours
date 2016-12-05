package com.thread;

public class Test {

	public static void main(String[] args) {
		CompteEnBanque cb1 = new CompteEnBanque();
		//CompteEnBanque cb2 = new CompteEnBanque();
		
		Thread t1 = new Thread(new RunImpl(cb1 , "Cysboy"));
		Thread t2 = new Thread(new RunImpl(cb1 , "Zéro"));
		t1.start();
		t2.start();
	}

}
