package com.dialog;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fenetre extends JFrame {
	private JButton bouton = new JButton("Appel à la ZDialog");
	
	public Fenetre(){
		this.setTitle("Ma frame");
		this.setSize(300,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(bouton);
		bouton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ZDialog zd = new ZDialog(null, "Coucou les ZérOs", false);
			}
		});
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Fenetre fenetre = new Fenetre();
	}

}
