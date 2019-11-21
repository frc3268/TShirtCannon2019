/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsystems;

// import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The shooter and the motor that aim it.
 */
public class PneumaticsSubsystem extends Subsystem {

	Solenoid shooter;
	Compressor compressor;
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public PneumaticsSubsystem() {
		shooter = new Solenoid(1);
		compressor = new Compressor();
	}
	public void SetShooter(boolean value)
	{
		shooter.set(value);
	}
	public void SetCompressor(int type)
	{
		switch (type)
		{
			case 0:
				compressor.start();
				break;
			case 1:
				compressor.stop();
				break;
		}
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
}