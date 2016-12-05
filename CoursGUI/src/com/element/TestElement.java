package com.element;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.MaskFormatter;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class TestElement extends JFrame {
	private JLabel label = new JLabel("Test");
	private String[] list = {"Toto", "Tata", "Bobo"};
	private JComboBox combo = new JComboBox(list);
	private JPanel conteneur = new JPanel();
	private JFormattedTextField ftext;
	private String num = "";
	
	public TestElement(){
		this.setSize(300,150);
		this.setTitle("Test element Swing");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new BorderLayout());
		
		this.getContentPane().add(combo, BorderLayout.NORTH);
		
		try {
			MaskFormatter tel = new MaskFormatter("##-##-##-##-##");
			ftext = new JFormattedTextField(tel);
		} catch (ParseException e) {} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conteneur.setLayout(new BoxLayout(conteneur, BoxLayout.PAGE_AXIS));
		conteneur.add(ftext);
		ftext.getDocument().addDocumentListener(new DocListener());
		this.getContentPane().add(conteneur, BorderLayout.CENTER);
		
		this.getContentPane().add(label, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	class DocListener implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			if(ftext.getText().charAt(13) != ' ' && ftext.hasFocus() && ftext.getText().compareTo(num) != 0){
				ImageIcon img = new ImageIcon("tel.png");
				//JOptionPane.showMessageDialog(null, ftext.getText(), "numéro", JOptionPane.INFORMATION_MESSAGE, img);
				JOptionPane jop = new JOptionPane();
				int rep = jop.showConfirmDialog(null, "Valider le numéro: " + ftext.getText(), "Confirmation du numéro", 
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, img);
				if(rep == JOptionPane.YES_OPTION){
					label.setText(ftext.getText());
					num = ftext.getText();
				}else{
					label.setText("Numéro no confirmé");
				}
					
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			System.out.println("Tick");
			
		}
		
	}

}
