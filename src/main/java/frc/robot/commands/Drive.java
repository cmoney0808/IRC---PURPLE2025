package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.DriveTrain;

public class Drive extends Command{
    private DriveTrain ben; 
    private CommandXboxController julian;

    public Drive(DriveTrain Curry, CommandXboxController Lebron){
        this.ben = Curry;
        this.julian = Lebron;
        addRequirements(ben);
    }
    
    @Override
    public void execute(){
        ben.drive(julian.getLeftY(), julian.getRightY());
    
    }
    @Override
    public void end(boolean interrupted){
        ben.stop();
    }
}