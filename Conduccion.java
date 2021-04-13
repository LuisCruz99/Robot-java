// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Joystick;


public class Conduccion extends Subsystem {
   //Motores
   Victor derecha = new Victor(RobotMap.derecha);
   Victor izquierda = new Victor(RobotMap.izquierda);

   //Conduccion
   public DifferentialDrive drive;
 
   //Uso de los joysticks
   public void driveJoystick(Joystick joystick,double speed){
       speed = 0.6;
       drive.arcadeDrive(joystick.getY()*speed,joystick.getX()*speed);
       if (joystick.getY() == 0 && joystick.getX() == 0){
           stop();
       }
   }
 
   public void drive(double speed,double RotationSpeed){
       drive.arcadeDrive(speed,RotationSpeed);
   }
 
   //funcion que apaga los motores
   public void stop(){
       drive.stopMotor();
   }
 
   @Override
   public void initDefaultCommand() {
     // Set the default command for a subsystem here.
     // setDefaultCommand(new MySpecialCommand());
   }
 }