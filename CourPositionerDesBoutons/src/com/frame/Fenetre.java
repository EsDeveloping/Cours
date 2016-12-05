package com.frame;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	private JPanel panel;
	
	
	public Fenetre(JPanel panel){
		this.panel = panel;
		this.setTitle("Fenetre OpenClassRooms");
		this.setSize(405, 455);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(this.panel);
		
		/*JButton boutonNorth = new JButton("Bouton nort");
		JButton boutonSouth = new JButton("Bouton south");
		JButton boutonWest = new JButton("Bouton west");
		JButton boutonEast = new JButton("Bouton east");
		JButton boutonCenter = new JButton("Bouton center");
		
		BorderLayout bl = new BorderLayout();
		
		this.panel.setLayout(bl);
		bl.setHgap(10);
		bl.setVgap(20);
		
		
		this.panel.add(boutonNorth, BorderLayout.NORTH);
		this.panel.add(boutonSouth, BorderLayout.SOUTH);
		this.panel.add(boutonWest, BorderLayout.WEST);
		this.panel.add(boutonEast, BorderLayout.EAST);
		this.panel.add(boutonCenter, BorderLayout.CENTER);
		//this.getContentPane().add(bouton);*/
		this.setVisible(true);
	}
}
