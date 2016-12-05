package com.tp.calculatrice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class Touche extends JButton{
	private Font police = new Font("Purisa",Font.BOLD,25);
	
	public Touche(String val){
		super(val);
		this.setOpaque(false);
		this.setContentAreaFilled(false);
		this.setFont(police);
		this.setForeground(Color.cyan);
		this.setPreferredSize(new Dimension(50,31));
	}
}
