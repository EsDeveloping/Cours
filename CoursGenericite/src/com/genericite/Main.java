package com.genericite;

public class Main {

	public static void main(String[] args) {
		/*Solo val = new Solo(12);
		int nbre = (int) val.getValeur();*/
		
		Solo2<Integer> val = new Solo2<Integer>(12);
		int nbre = val.getValeur();
		System.out.println("val = " + nbre + "\n  Programme términé");
	}

}
