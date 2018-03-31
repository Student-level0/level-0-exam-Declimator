import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	 Robot r = new Robot("mini");
    	 r.setSpeed(100);
   	 // 3. ask the user what color they would like the Robot to draw
String x = JOptionPane.showInputDialog(null, "What color do you want the robot to draw?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
if(x.equalsIgnoreCase("blue")) {
	r.setPenColor(0,0,255);
}
else if(x.equalsIgnoreCase("red")) {
	r.setPenColor(255,0,0);
}
else if(x.equalsIgnoreCase("green")) {
	r.setPenColor(0,255,0);
}
else if(x.equalsIgnoreCase("random")) {
	r.setRandomPenColor();
}
   	 // 2. set the pen width to 10
r.setPenWidth(10);
   	 // 1. make the Robot draw a shape
r.penDown();
    	 for(int i=0;i<5;i++) {
    		 
    	 
  r.move(100);
  r.turn(144);
    	 }
    }

	public static void main(String[] args) {
	    	 Robot r = new Robot("mini");
	    	 r.setSpeed(100);
	   	 // 3. ask the user what color they would like the Robot to draw
	String x = JOptionPane.showInputDialog(null, "What color do you want the robot to draw?");
	   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
	if(x.equalsIgnoreCase("blue")) {
		r.setPenColor(0,0,255);
	}
	else if(x.equalsIgnoreCase("red")) {
		r.setPenColor(255,0,0);
	}
	else if(x.equalsIgnoreCase("green")) {
		r.setPenColor(0,255,0);
	}
	else if(x.equalsIgnoreCase("random")) {
		r.setRandomPenColor();
	}
	   	 // 2. set the pen width to 10
	r.setPenWidth(10);
	   	 // 1. make the Robot draw a shape
	r.penDown();
	    	 for(int i=0;i<5;i++) {
	    		 
	    	 
	  r.move(100);
	  r.turn(144);
	    	 }
	    }

}
