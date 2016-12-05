package com.button;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Button extends JButton implements MouseListener{
	private String name;
	private Image img;
	
	public Button(String name){
		super(name);
		this.name = name;
		/*try {
			img = ImageIO.read(new File("th.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	/*public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics g2d = (Graphics2D)g;
		g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		g2d.drawString(this.name, this.getWidth() /2 - (this.getWidth() /2 /4), (this.getHeight()/2) +5);
	}*/

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
}
