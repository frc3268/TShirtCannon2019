/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Sets the state of the shooter to the boolean value it is passed.
 */
public class SetShooterCommand extends Command {

	boolean status;
	boolean finished;

	public SetShooterCommand(boolean val) {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.pneumatics);
		Robot.pneumatics.SetCompressor(1);
		status = val;
		finished = false;
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.pneumatics.SetShooter(status);
		finished = true;
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		Robot.pneumatics.SetCompressor(0);
		return finished;
	}

}