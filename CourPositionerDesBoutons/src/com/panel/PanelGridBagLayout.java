package com.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class PanelGridBagLayout extends JPanel{
	public PanelGridBagLayout(){
		JPanel pan1 = new PanRobot();
		pan1.setPreferredSize(new Dimension(100,120));
		JPanel pan2 = new PanRobot2();
		pan2.setPreferredSize(new Dimension(100,120));
		JPanel pan3 = new PanRobot3();
		pan3.setPreferredSize(new Dimension(100,120));
		JPanel pan4 = new PanRobot4();
		pan4.setPreferredSize(new Dimension(100,120));
		JPanel pan5 = new PanRobot5();
		pan5.setPreferredSize(new Dimension(100,120));
		JPanel pan6 = new JPanel();
		pan6.setBackground(Color.blue);
		pan6.setPreferredSize(new Dimension(100,120));
		JPanel pan7 = new JPanel();
		pan7.setBackground(Color.WHITE);
		pan7.setPreferredSize(new Dimension(100,120));
		JPanel pan8 = new JPanel();
		pan8.setBackground(Color.RED);
		pan8.setPreferredSize(new Dimension(100,120));
		
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		// On definie la position
		gbc.gridx = 0;
		gbc.gridy = 0;
		// On definie la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(pan6, gbc);
		//----------------------
		gbc.gridx = 1;
		this.add(pan7, gbc);
		//----------------------
		gbc.gridx = 2;
		this.add(pan8, gbc);
		//----------------------
		//Celle-ci indique que la cellule se réplique de façon verticale
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridx = 3;
		this.add(pan4, gbc);
		//----------------------
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		//Celle-ci indique que la cellule se réplique de façon verticale
		gbc.fill = GridBagConstraints.VERTICAL;
		this.add(pan5, gbc);
		//---------------------
		gbc.gridx = 1;
		gbc.gridheight = 1;
		//Celle-ci indique que la cellule se réplique de façon horizontale
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		this.add(pan1, gbc);
		//---------------------
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		this.add(pan2, gbc);
		//---------------------
		gbc.gridx = 3;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		this.add(pan3, gbc);
	}
}
