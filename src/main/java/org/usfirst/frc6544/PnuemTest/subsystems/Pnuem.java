package org.usfirst.frc6544.PnuemTest.subsystems;

import org.usfirst.frc6544.PnuemTest.RobotMap;
import org.usfirst.frc6544.PnuemTest.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Pnuem extends Subsystem {

    //private final Compressor compressor1 = RobotMap.pnuemCompressor1;
    //private final DoubleSolenoid doubleSolenoid1 = RobotMap.pnuemDoubleSolenoid1;

    @Override
    public void initDefaultCommand() {

    RobotMap.pnuemCompressor1.start();
    }

    @Override
    public void periodic() {
    
    }

    public void open() {
    	RobotMap.pnuemDoubleSolenoid1.set(Value.kForward);
    }

    public void close() {
    	RobotMap.pnuemDoubleSolenoid1.set(Value.kReverse);
    }

    public void stop()	{
    	RobotMap.pnuemDoubleSolenoid1.set(Value.kOff);
    }  
}

