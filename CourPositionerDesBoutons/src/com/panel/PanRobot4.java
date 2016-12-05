package com.panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanRobot4 extends JPanel{
	public void paintComponent(Graphics g){
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		Image img;
		try {
			img = ImageIO.read(new File("robot3.png"));
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
