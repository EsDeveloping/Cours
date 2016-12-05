package com.tp.calculatrice;

public class DivisionParZeroPointZeroException extends Exception{
	public DivisionParZeroPointZeroException(){
		System.err.println("Division par un nombre réel égal a 0.0 impossible");
	}
}
