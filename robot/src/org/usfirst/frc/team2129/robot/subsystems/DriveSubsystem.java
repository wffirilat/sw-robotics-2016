package org.usfirst.frc.team2129.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	/**
	 * Drive the robot.
	 * 
	 * @param speed
	 *            How fast to drive. Negative is backwards; positive is forwards
	 */
	public void drive(float speed){
		//TODO method stub
	}

	/**
	 * Turn the robot.
	 * 
	 * @param speed
	 *            How fast to turn. Negative is left; positive is right.
	 */
	public void turn(float speed){
		//TODO method stub
	}

    @Override
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

