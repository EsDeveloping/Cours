package com.panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel{
	public Panel(){
		
	}
	
	public void paintComponent(Graphics g){
		try {
			//Image img = ImageIO.read(new FileInputStream(new File("robot.png")));
			Image img = ImageIO.read(new File("robot.png"));
			//g.drawImage(img, 0, 0, this);
			//g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),null , this);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), getForeground(), this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
