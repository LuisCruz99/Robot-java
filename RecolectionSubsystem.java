// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.PWM;

/** Add your docs here. */
public class RecolectionSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

 //Subsistema de los nuevos motores
  PWM motorRodillo = new PWM(RobotMap.motorRodillo);
  PWM motorRecolector = new PWM(RobotMap.motorRecolector);

  public void rodillo(boolean direction,double speed){
    if(direction){
      motorRodillo.setSpeed(speed);
    }
    else{
      motorRodillo.setSpeed(-speed);
    }
  }

  public void recolector(boolean direction,double speed){
    if(direction){
      motorRecolector.setSpeed(speed);
    }
    else{
      motorRecolector.setSpeed(-speed);
    }
  }

  public void stop(){
    motorRodillo.stopMotor();
    motorRecolector.stopMotor();
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
