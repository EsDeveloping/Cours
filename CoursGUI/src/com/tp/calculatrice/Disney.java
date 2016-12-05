package com.tp.calculatrice;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

public class Disney extends Font{
	private Font font;
	public Disney(String name, int style, int size) {
		super(name, style, size);
		//float f = Float.intBitsToFloat(size);
		if(style == Font.PLAIN){
			try {
				font = Font.createFont(Font.TRUETYPE_FONT, new File("/opt/calculette/waltographUI.ttf"));
				font = font.deriveFont(24f);
			} catch (FontFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(style == Font.BOLD){
			try {
				font = Font.createFont(Font.TRUETYPE_FONT, new File("waltograph42.otf"));
				font = font.deriveFont(24f);
			} catch (FontFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Font getFont(){
		return font;
	}

}
