package com.dialog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ZDialog extends JDialog {
	private ZDialogInfo zInfo = new ZDialogInfo();
	private boolean sendData;
	private JLabel nomLabel, sexeLabel, cheveuxLabel, ageLabel, tailleLabel, taille2Label, icon;
	private JRadioButton tranche1, tranche2, tranche3, tranche4;
	private JComboBox sexe, cheveux;
	private JTextField nom, taille;
	
	public ZDialog(JFrame parent, String title, boolean modal){
		// On appelle le constructeur de JDialog correspondant
		super(parent, title, modal);
		// On spécifie une taille
		this.setSize(550,270);
		// La location
		this.setLocationRelativeTo(null);
		// La boite ne devra pas être redimentionnable
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		initComponent();
	}
	
	public ZDialogInfo showZDialog(){
		this.sendData = false;
		this.setVisible(true);
		return this.zInfo;
	}
	
	private void initComponent(){
		//icône
		icon = new JLabel(new ImageIcon("image.jgp"));
		JPanel panIcon = new JPanel();
		panIcon.setBackground(Color.white);
		panIcon.setLayout(new BorderLayout());
		panIcon.add(icon);
		
		// Le nom
		JPanel panNom = new JPanel();
		panNom.setBackground(Color.WHITE);
		panNom.setPreferredSize(new Dimension(220,60));
		nom = new JTextField();
		nom.setPreferredSize(new Dimension(100,25));
		panNom.setBorder(BorderFactory.createTitledBorder("Nom du personnage"));
		nomLabel = new JLabel("Saisir nom :");
		panNom.add(nomLabel);
		panNom.add(nom);
		
		// Le Sexe
		JPanel panSexe = new JPanel();
		panSexe.setBackground(Color.WHITE);
		panSexe.setPreferredSize(new Dimension(220,60));
		panSexe.setBorder(BorderFactory.createTitledBorder("Sexe du personnage"));
		sexe = new JComboBox();
		sexe.addItem("Masculin");
		sexe.addItem("Feminin");
		sexe.addItem("Indéterminé");
		sexeLabel = new JLabel("Sexe : ");
		panSexe.add(sexeLabel);
		panSexe.add(sexe);
		
		// l'Age
		JPanel panAge = new JPanel();
		panAge.setBackground(Color.white);
		panAge.setBorder(BorderFactory.createTitledBorder("Age du personnage"));
		panAge.setPreferredSize(new Dimension(440,60));
		tranche1 = new JRadioButton("15 - 25 ans");
		tranche1.setSelected(true);
		tranche2 = new JRadioButton("26 - 35 ans");
		tranche3 = new JRadioButton("36 - 50 ans");
		tranche4 = new JRadioButton("+ de 50 ans");
		ButtonGroup bg = new ButtonGroup();
		bg.add(tranche1);
		bg.add(tranche2);
		bg.add(tranche3);
		bg.add(tranche4);
		panAge.add(tranche1);
		panAge.add(tranche2);
		panAge.add(tranche3);
		panAge.add(tranche4);
		
		// La taille
		JPanel panTaille = new JPanel();
		panTaille.setBackground(Color.white);
		panTaille.setPreferredSize(new Dimension(220,60));
		panTaille.setBorder(BorderFactory.createTitledBorder("Taille du personnage"));
		tailleLabel = new JLabel("Taille : ");
		taille2Label = new JLabel(" cm");
		taille = new JTextField("180");
		taille.setPreferredSize(new Dimension(90,25));
		panTaille.add(tailleLabel);
		panTaille.add(taille);
		panTaille.add(taille2Label);
		
		//La couleur de cheuveux
		JPanel panCheveux = new JPanel();
		panCheveux.setBackground(Color.WHITE);
		panCheveux.setPreferredSize(new Dimension(220,60));
		panCheveux.setBorder(BorderFactory.createTitledBorder("Couleur de cheveux du personnage"));
		cheveux = new JComboBox();
		cheveux.addItem("Blond");
		cheveux.addItem("Brun");
		cheveux.addItem("Roux");
		cheveux.addItem("Blanc");
		cheveuxLabel = new JLabel("Cheuveux");
		panCheveux.add(cheveuxLabel);
		panCheveux.add(cheveux);
		
		JPanel content = new JPanel();
		content.setBackground(Color.white);
		content.add(panNom);
		content.add(panSexe);
		content.add(panAge);
		content.add(panTaille);
		content.add(panCheveux);
		
		JPanel control = new JPanel();
		JButton okBouton = new JButton("OK");
		
		okBouton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Tick");
				zInfo = new ZDialogInfo(nom.getText(), (String)sexe.getSelectedItem(), getAge(), (String)cheveux.getSelectedItem(), getTaille());
				JOptionPane jop = new JOptionPane();
				jop.showMessageDialog(null, zInfo.toString(), "Description du personnage", JOptionPane.INFORMATION_MESSAGE);
				setVisible(false);
			}
			
			public String getAge(){
				return (tranche1.isSelected()) ? tranche1.getText() :
					   (tranche2.isSelected()) ? tranche2.getText() :
					   (tranche3.isSelected()) ? tranche3.getText() :
					   tranche4.getText();
			}
			
			public String getTaille(){
				return (taille.getText().equals("")) ? "180" : taille.getText();
			}
		});
		
		JButton cancelBouton = new JButton("Annuler");
		cancelBouton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setVisible(false);
			}
		});
		
		control.add(okBouton);
		control.add(cancelBouton);
		
		this.getContentPane().add(panIcon, BorderLayout.WEST);
		this.getContentPane().add(content, BorderLayout.CENTER);
		this.getContentPane().add(control, BorderLayout.SOUTH);
		
	}
	
}
