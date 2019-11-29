package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {

	private PImage Bart, Homero;
	
	
	
	private PApplet app;
	
	public Logic(PApplet app){
		
		this.app=app;
	}
	
	public void imageLoader(){
		Bart = app.loadImage("data/bart_simpson.png");
		Homero = app.loadImage("data/homero_simpson.png");
		
}

	
}
