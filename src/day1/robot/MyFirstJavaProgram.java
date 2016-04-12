package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot ROBin = new Robot();
ROBin.setSpeed(10);
ROBin.setRandomPenColor();
ROBin.penDown();
ROBin.sparkle();
for (int i = 0; i < 4; i++) {
ROBin.move(100);
ROBin.turn(90);	
}
ROBin.penUp();
ROBin.turn(-90);
ROBin.move(200);
ROBin.turn(90);
ROBin.penDown();
for (int i = 0; i < 8; i++) {
ROBin.turn(45);
ROBin.move(50);	
}
ROBin.penUp();
ROBin.turn(-90);
ROBin.move(100);
ROBin.turn(90);
ROBin.unSparkle();

		
	}
}
