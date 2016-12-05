package com.tp.calculatrice;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;



public class Main {

	public static void main(String[] args) {

		Fenetre fenetre = new Fenetre();
		try {
			fenetre.setIconImage(ImageIO.read(new File("/home/emerick/Documents/Logo_16-16.ico")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
