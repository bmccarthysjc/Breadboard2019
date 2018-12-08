package org.usfirst.frc6544.PnuemTest.commands;

import org.usfirst.frc6544.PnuemTest.Robot;
import org.usfirst.frc6544.PnuemTest.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToggleSolenoid extends Command {

    public ToggleSolenoid() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(RobotMap.pnuemDoubleSolenoid1.equals(Value.kForward)) {
    		Robot.pnuem.close();
    	}
    	else {
    		Robot.pnuem.open();
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.pnuem.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
