package model;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {

	private PImage Bart, Homero;
	
	
	
	
	private PApplet app;
	
	private ArrayList<Character1> character1;

	public Logic(PApplet app){
		
		this.app=app;
	}
	
	public void imageLoader(){
	
	
		
		Bart = app.loadImage("data/bart_simpson.png");
		Homero = app.loadImage("data/homero_simpson.png");
	
		
		
}
	
	public void start () {
		
		
		
		
	}
	
public void createCharacter(){
		
		for(int i=0; i<10;i++){
			
		
			//character1 = new Character1(50+(i*50),50,Bart, app);
		}

	
}}
