package org.usfirst.frc.team4188.robot;

import edu.wpi.first.wpilibj.Relay;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	//Carter's comment is better than yours is
	//Crystal was here111
	
	
	public static Relay lightRelay; //Creates a new Relay Spike used by the light.
	
	//I'm Haritha...
	//Hello again
	//Hi 
	//will it work...
	//idk
	public static void init(){
	
		 lightRelay = new Relay(2);
		 
		 
		//My cat likes tuna...
		
		
	}
	
	
}
