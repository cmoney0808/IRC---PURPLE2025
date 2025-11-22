package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase{
    //Declare motor controllers
    VictorSP cadenMotor; //left motor
    VictorSP marisaMotor; // right motor

    //Constructor
    public DriveTrain(){
        //parameter channel is the port on your RoboRIO the motor controller is pluggen in to
        cadenMotor = new VictorSP(0);
        marisaMotor = new VictorSP(1);
        //one moter hsa to spin in reverse for th erobot to go straight
        cadenMotor.setInverted(true);
    }

    public void drive(double kate , double jimmy){ //kate = leftmotorspeed , jimmy = rightmotorspeed
        cadenMotor.set(kate);
        marisaMotor.set(jimmy);
    }
    
    public void stop(){
        marisaMotor.stopMotor();
        cadenMotor.stopMotor();
    }


}

