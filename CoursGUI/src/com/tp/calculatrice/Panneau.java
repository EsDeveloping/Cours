package com.tp.calculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Panneau extends JPanel{
	private double val = 0d;
	private String operateur ="";
	private boolean operateurDemande = false;
	private JPanel container = new JPanel();
	private JPanel panFonction = new JPanel();
	private Image img;
	private JTextField resultat;
	private String[] tab = {"1","2","3","4","5","6","7","8","9","0",".","=","C","+","-","*","/"};
	private JButton[] touche = new JButton[tab.length];
	private Font police;
	
	public Panneau(){
		this.setLayout(new BorderLayout(10,10));
		container.setLayout(new GridLayout(4,3,10,10));
		panFonction.setLayout(new GridLayout(5,1,10,10));
		container.setPreferredSize(new Dimension(165,222));
		police = new Disney("t", Font.PLAIN, 24).getFont();

		
		resultat = new JTextField();
		resultat.setOpaque(true);
		resultat.setBackground(Color.WHITE);
		resultat.setHorizontalAlignment(JTextField.RIGHT);
		resultat.setFont(police);
		resultat.setPreferredSize(new Dimension(100,40));
		this.add(resultat, BorderLayout.NORTH);
		this.setBackground(Color.WHITE);
		
		container.setOpaque(false);
		panFonction.setOpaque(false);
		
		
		for(int i = 0; i <= 16; i++){
			touche[i] = new Touche(tab[i]);
			touche[i].setFont(police);
			if(i<=11){
				container.add(touche[i]);
			}else{
				panFonction.add(touche[i]);
			}
			
			if(i<=10){
				touche[i].addActionListener(new BoutonNumListener());
			}else{
				touche[i].addActionListener(new ButonActionListener());
			}
		}
		
		touche[12].setForeground(Color.RED);
		
		this.add(container, BorderLayout.CENTER);
		this.add(panFonction, BorderLayout.EAST);
		
		try {
			img = ImageIO.read(new File("/opt/calculette/mickey.jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	class BoutonNumListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(operateurDemande)
				resultat.setText("");
			resultat.setText(resultat.getText()+ e.getActionCommand());
			operateurDemande = false;
		}
	}
	
	class ButonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(e.getActionCommand().compareTo("C") == 0){
				val = 0.0d;
				resultat.setText("");
				operateurDemande = false;
			}else if(e.getActionCommand().compareTo("=") == 0){
				try {
					calcul(Double.valueOf(resultat.getText()).doubleValue());
				} catch (NumberFormatException | DivisionParZeroPointZeroException e1) {
				}
				operateurDemande = false;
				operateur = "";
			}else{
				if(operateur.compareTo("") != 0){
					try {
						calcul(Double.valueOf(resultat.getText()).doubleValue());
					} catch (NumberFormatException | DivisionParZeroPointZeroException e1) {
					}
					operateurDemande = false;
				}
				operateur = e.getActionCommand();
				operateurDemande = true;
				val = Float.valueOf(resultat.getText());
			}
		}
	}
	
	public void calcul(double val2) throws DivisionParZeroPointZeroException{
		if(operateur.compareTo("+") == 0){
			val = val + val2;
			resultat.setText(String.valueOf(val));
		}else if(operateur.compareTo("-") == 0){
			val = val - val2;
			resultat.setText(String.valueOf(val));
		}else if(operateur.compareTo("*") == 0){
			val = val * val2;
			resultat.setText(String.valueOf(val));
		}else if(operateur.compareTo("/") == 0){
			if(val2 == 0.0d){
				operateur = "";
				val2 = 0.0f;
				resultat.setText(String.valueOf(val));
				throw new DivisionParZeroPointZeroException();
			}else{
				val = val / val2;
				resultat.setText(String.valueOf(val));
			}
		}
		operateurDemande = true;
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 50, this.getWidth(), this.getHeight() -50, this);		
 	}
}
