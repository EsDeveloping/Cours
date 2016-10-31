package com.test;

import com.option.BarreDeToit;
import com.option.Climatisation;
import com.option.GPS;
import com.option.Option;
import com.option.SiegeChauffant;
import com.option.VitreElectrique;

public class Main {

	public static void main(String[] args) {
		Option m = new GPS();
		System.out.println(m.toString());
		m = new SiegeChauffant();
		System.out.println(m.toString());
		m = new VitreElectrique();
		System.out.println(m.toString());
		m = new Climatisation();
		System.out.println(m.toString());
		m = new BarreDeToit();
		System.out.println(m.toString());
	}

}
