package _06_frogger;

import java.awt.CardLayout;

import processing.core.PApplet;

public class car extends PApplet {
	int carX;
	int carY;
	int carSize;
	int carSpeed;
car(int carX, int carY, int carSize, int carSpeed){
this.carX = carX;
this.carY = carY;
this.carSize = carSize;
this.carSpeed = carSpeed;
}
void display()
{
  fill(0,255,0);
 new Car(300,300,50,50);
}
public void setup() {
	
}
public void draw() {
	display();
}
}
