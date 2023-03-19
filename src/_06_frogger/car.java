package _06_frogger;

import processing.core.PApplet;

public class car extends PApplet {
car(){
int carX;
int carY;
int carSize;
int carSpeed;
}
void display()
{
  fill(0,255,0);
  rect(carX , carY,  carSize, 50);
}
public void setup() {
	
}
public void draw() {
	display();
}
}
