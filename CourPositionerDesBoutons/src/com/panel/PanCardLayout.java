package com.panel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanCardLayout extends JPanel{
	CardLayout cl = new CardLayout();
	JPanel content = new JPanel();
	String[] listContent = {"CARD_1","CARD_2","CARD_3","CARD_4","CARD_5","CARD_6"};
	int indice = 1;
	
	public PanCardLayout(){
		JPanel card1 = new PanRobot();
		JPanel card2 = new PanRobot2();
		JPanel card3 = new PanRobot3();
		JPanel card4 = new PanRobot4();
		JPanel card5 = new PanRobot5();
		JPanel card6 = new PanelGridBagLayout();
		
		JPanel boutonPane = new JPanel();
		
		JButton boutonSuivant = new JButton("Suivant");	
		boutonSuivant.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl.next(content);
			}
		});
		
		
		JButton boutonPrecedent = new JButton("Precedent");
		boutonPrecedent.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(++indice >5)
					indice = 0;
				
				cl.show(content, listContent[indice]);
			}
		});
		
		boutonPane.add(boutonPrecedent);
		boutonPane.add(boutonSuivant);
		
		content.setLayout(cl);
		
		content.add(card1, listContent[0]);
		content.add(card2, listContent[1]);
		content.add(card3, listContent[2]);
		content.add(card4, listContent[3]);
		content.add(card5, listContent[4]);
		content.add(card6, listContent[5]);
		
		this.setLayout(new BorderLayout());
		
		this.add(boutonPane, BorderLayout.NORTH);
		this.add(content, BorderLayout.CENTER);
		
	}
}
