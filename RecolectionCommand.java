// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import frc.robot.Robot;

public class RecolectionCommand extends Command {

  boolean direction;
  double speed;

  public RecolectionCommand(boolean direction,double speed) {
    this.direction = direction;
    this.speed = speed;
    
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.recolectionSubsystem.stop();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.recolectionSubsystem.recolector(direction,speed);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.recolectionSubsystem.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted(){
    end();
  }
}