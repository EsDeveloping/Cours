package com.tp.calculatrice;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	private JPanel panneau = new Panneau();
	
	public Fenetre(){
		this.setSize(new Dimension(300,300));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Calculatrice");
		
		
		this.setContentPane(panneau);
		((JComponent) this.getContentPane()).setBorder(BorderFactory.createLineBorder(Color.lightGray,10));
		
		this.getContentPane().setBackground(Color.white);
		this.setVisible(true);
	}
}
