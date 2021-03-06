// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3172.RalphTheWonderLlamaWPIOnly;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController cannonball2;
    public static SpeedController cannonball1;
    public static SpeedController driveChainleft1;
    public static SpeedController driveChainright1;
    public static RobotDrive driveChainRobotDrive21;
    public static Compressor pneumaticsCompressor1;
    public static DoubleSolenoid pneumaticsDoubleSolenoid1;
    public static DoubleSolenoid pneumaticsDoubleSolenoid2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        cannonball2 = new Talon(3);
        LiveWindow.addActuator("Cannon", "ball2", (Talon) cannonball2);
        
        cannonball1 = new Talon(2);
        LiveWindow.addActuator("Cannon", "ball1", (Talon) cannonball1);
        
        driveChainleft1 = new Victor(0);
        LiveWindow.addActuator("Drive Chain", "left1", (Victor) driveChainleft1);
        
        driveChainright1 = new Victor(1);
        LiveWindow.addActuator("Drive Chain", "right1", (Victor) driveChainright1);
        
        driveChainRobotDrive21 = new RobotDrive(driveChainleft1, driveChainright1);
        
        driveChainRobotDrive21.setSafetyEnabled(true);
        driveChainRobotDrive21.setExpiration(0.1);
        driveChainRobotDrive21.setSensitivity(0.5);
        driveChainRobotDrive21.setMaxOutput(1.0);

        pneumaticsCompressor1 = new Compressor();
        
        
        pneumaticsDoubleSolenoid1 = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("Pneumatics", "Double Solenoid 1", pneumaticsDoubleSolenoid1);
        
        pneumaticsDoubleSolenoid2 = new DoubleSolenoid(0, 2, 3);
        LiveWindow.addActuator("Pneumatics", "Double Solenoid 2", pneumaticsDoubleSolenoid2);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
}
