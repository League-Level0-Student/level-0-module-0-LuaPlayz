package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot meow=new Robot();
	meow.hide();
	meow.penDown();
	meow.setPenColor(2, 200, 250);
	meow.setAngle(250);
	meow.setSpeed(100);
	for(int i=0;i<230; i++) {
meow.move(1); 
meow.turn(1);
	}
	
}
}
