// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

//Nuevos comandos
import frc.robot.commands.RodilloCommand;
import frc.robot.commands.RecolectionCommand;

public class OI {
  //Joysticks
  Joystick driverstick = new Joystick(0); //Control driver
  Joystick operatorstick = new Joystick(1); //Control operador

  //Botones
  JoystickButton rodilloNeg = new JoystickButton(driverstick, 1);
  JoystickButton rodilloPos = new JoystickButton(driverstick, 2);
  JoystickButton brazoNeg = new JoystickButton(driverstick, 3);
  JoystickButton brazoPos = new JoystickButton(driverstick, 4);

  public OI(){
    //Comandos
   rodilloPos.whileHeld(new RodilloCommand(true,0.3));
   rodilloNeg.whileHeld(new RodilloCommand(false,0.3));
   brazoPos.whileHeld(new RecolectionCommand(true,0.3));
   brazoNeg.whileHeld(new RecolectionCommand(false,0.3));
  }

  public Joystick getDriverStick(){
    return driverstick;
  }

  public Joystick getOperatorStick(){
    return operatorstick;
  }
}