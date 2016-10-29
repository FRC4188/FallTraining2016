package org.usfirst.frc.team4188.robot.subsystems;

import org.usfirst.frc.team4188.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Sensors extends Subsystem {
	
	Relay LightRelay = RobotMap.lightRelay;
	
	
	
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void init(){
		
	}
    



public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    
    public void LightOn(){
    	 LightRelay.set(Relay.Value.kOn);
    }
    
    public void LightOff(){
    	LightRelay.set(Relay.Value.kOff);
    	
    }
    
    }


