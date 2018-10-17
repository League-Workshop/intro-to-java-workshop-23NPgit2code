package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot bob  = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right

	}

	
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		bob.penDown();
		int amt = 200;
		for (int i = 0; i < 100; i++) {
			bob.setSpeed(12);
			bob.turn(90);
			bob.move(amt);
			amt-=20;
	
	
			
		}
		}
	

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



