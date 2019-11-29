package model;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;
 

public class Character1 extends Thread {
		
		private PApplet app;
		private ArrayList<PImage> homers;
		private int posX, posY, age, luckNumber, speed;
		
		
		public Character1 (int x, int y, PImage img, PApplet app){
			
			
			
			this.posX=x;
			this.posY=y;
			//this.img=img;
			this.app=app;
			this.age= (int) app.random(30);
			this.luckNumber= (int) app.random(30);
			
		}
		
		public void show(){
			app.fill(0,0,255);
			app.ellipse(posX, posY,40,40);
		}

		public void mover(){
			
			posX+= speed;
			
			if(posX < 30 || posX > 470) {
				
				posX = -1;
			}
		}
		
		
		
	
	
	
}
