package com.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class TestLinkedList {
	
	public static void main(String[] args){
		List l = new LinkedList();
		l.add(10);
		l.add("toto");
		l.add(12.0f);
		
		for(int i =  0; i < l.size(); i++)
			System.out.println("Elément à l'index " + i + " = " + l.get(i));
		
		
		
		System.out.println("\n \tParcours avec un iterateur ");
		System.out.println("-----------------------------------");
		ListIterator li = l.listIterator();
		
		while(li.hasNext())
			System.out.println(li.next());
		
	}
}
