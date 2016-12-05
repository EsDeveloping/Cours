package com.panel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{
	private int x = 0 , y = 0;
	public String form = "ROND";
	public Panel(){
		
	}
	
	public void paintComponent(Graphics g){

		//System.out.println(this.getWidth() + "  " + this.getHeight());
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth()/2 +26,this.getHeight()/2 +26);//this.getWidth(), this.getHeight());
		g.setColor(Color.blue);
		if(form.compareTo("ROND") == 0){
			g.fillOval(x, y, 50, 50);
		}else if(form.compareTo("CARRE") == 0){
			g.fillRect(x, y, 50, 50);
		}else if(form.compareTo("LOSANGE") == 0){
			g.fillOval(x, y, 50, 40);
		}
	}

	public void setBallPosition(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}
