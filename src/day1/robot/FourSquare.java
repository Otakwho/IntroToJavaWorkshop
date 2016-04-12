package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot x = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
x.setSpeed(10);
		// 5. Set the pen width to 5
x.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random
x.setRandomPenColor();
			// 1. Call the drawSquare() method
drawSquare();
			// 8. Turn the robot 90 degrees to the right
x.turn(90);
}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
for (int i = 0; i < 4; i++) {
x.penDown();
x.move(100);
x.turn(90);
}

x.turn(-90);
x.move(400);


		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
