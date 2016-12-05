package com.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.button.Button;
import com.panel.Panel;

public class Fenetre extends JFrame{
	private Panel panel;
	private JLabel label = new JLabel("Choix de la forme");
	private Button boutonStart = new Button("Strat");
	private Button boutonStop = new Button("Stop");
	private JPanel container = new JPanel(),containerTop = new JPanel();
	private String[] liste = {"ROND" , "CARRE" , "LOSANGE"};
	private JComboBox comboBox = new JComboBox(liste);
	private boolean avancer = true, descendre = true;
	protected boolean animated = true;
	private Thread t;
	
	public Fenetre(Panel panel){
		this.panel = panel;
		this.setTitle("Fenetre OpenClassRooms");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		container.setBackground(Color.white);
		container.add(this.boutonStart);
		container.add(this.boutonStop);
		boutonStart.addActionListener(new BoutonStartListener());
		boutonStop.addActionListener(new BoutonStopListener());
		containerTop.setLayout(new FlowLayout());
		containerTop.add(label);
		containerTop.add(comboBox);
		comboBox.addActionListener(new ComboListener());
		//container.add(bouton, BorderLayout.SOUTH);
		//this.setContentPane(container);
		
		
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(containerTop, BorderLayout.NORTH);
		this.getContentPane().add(this.panel, BorderLayout.CENTER);
		this.getContentPane().add(container, BorderLayout.SOUTH);
		this.setVisible(true);
		go();
	}
	
	public void go(){
		int x = panel.getX(), y = panel.getY();
		while(this.animated){
			if(x < 0)
				avancer = true;
			
			if(y < 0)
				descendre = true;
			
			if(x < (panel.getWidth() -50) /2 && avancer == true){
				x++;
			}else{
				avancer = false;
				x--;
			}
			
			if(y < (panel.getHeight() -50) /2 && descendre == true){
				y++;
			}else{
				y--;
				descendre = false;
			}
			
			panel.setBallPosition(x, y);
			panel.repaint();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	class BoutonStartListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JOptionPane jop = new JOptionPane();
			int option = jop.showConfirmDialog(null, "Voulez vous redémarer le mouvement", "Accepter vous le mouvement", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (option == JOptionPane.YES_OPTION) {
				animated = true;
				boutonStart.setEnabled(false);
				boutonStop.setEnabled(true);
				t = new Thread(new PlayAnimation());
				t.start();
			}
		}
	}
	
	class BoutonStopListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			animated = false;
			boutonStart.setEnabled(true);
			boutonStop.setEnabled(false);
		}
	}
	
	class ComboListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			panel.form = comboBox.getSelectedItem().toString();
		}
	}
	
	class PlayAnimation implements Runnable{
		public void run(){
			go();
		}
	}
}
