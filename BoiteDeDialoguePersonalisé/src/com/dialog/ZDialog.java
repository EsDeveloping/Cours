package com.dialog;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class ZDialog extends JDialog {
	
	public ZDialog(JFrame parent, String title, boolean modal){
		// On appelle le constructeur de JDialog correspondant
		super(parent, title, modal);
		// On spécifie une taille
		this.setSize(200,80);
		// La location
		this.setLocationRelativeTo(null);
		// La boite ne devra pas être redimentionnable
		this.setResizable(false);
		// On affiche
		this.setVisible(true);
	}
	
	
}
