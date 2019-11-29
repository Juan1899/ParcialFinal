package model;

//import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;

public class Character2 extends Thread {
		
		private PApplet app;
		private PImage barts; 
		
		private int posX, posY; 
		
		public Character2 (int posX, int posY, PApplet app){
			this.posX = posX;
			this.posY = posY;
			this.barts = app.loadImage("data/bart_simpson.png"); 
			this.app = app;
			
			
		}
		
		
		public void show () {
			
		
			app.image(barts,50,50); 
			
		}
	
	
	
}
