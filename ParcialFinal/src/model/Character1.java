package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Character1 extends Thread {
		
		private PApplet app;
		private PImage img;
		private int posX, posY, age, luckNumber;
		
		
		public Character1 (int x, int y, PImage img, PApplet app){
			
			this.posX=x;
			this.posY=y;
			this.img=img;
			this.app=app;
			this.age= (int) app.random(30);
			this.luckNumber= (int) app.random(30);
			
		}
		
		
		
	
	
	
}
