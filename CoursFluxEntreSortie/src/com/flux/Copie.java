package com.flux;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copie {

	public static void main(String[] args) {
		//Variables
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("dictionnaire.txt");
			fos = new FileOutputStream("copieDef.output");
			
			byte[] buf = new byte[8];
			
			int n = 0;
			
			long time = System.currentTimeMillis();
			
			while((n = fis.read(buf)) >= 0){
				
				fos.write(buf);
				
				/*for(byte bit : buf){
					System.out.print("\t " + bit + "(" + (char) bit + ")");
				}*/
				//System.out.println("");
				
				buf = new byte[8];
				
			}
			System.out.println("Temp d'execution: " + (System.currentTimeMillis() - time));
			System.out.println("Copie terminé !");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			try {
				if(fis != null)
					fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {
				if(fos != null)
					fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
