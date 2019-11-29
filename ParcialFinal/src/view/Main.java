package view;

import model.Character1;
import model.Character2;
import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet{
	
	Character2 c2; 
	Logic logic;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	
	public void settings() {
		
		size(1000,700); 
	}
	
	public void setup() {
		
		logic = new Logic(this); 
		c2 = new Character2(50, 50, this);
		
	}
	
	public void draw() {
		
		background(255); 
		c2.show();
	}
	
	
	
	
	
	
	

}
