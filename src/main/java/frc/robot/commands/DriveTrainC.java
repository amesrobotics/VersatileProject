/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.lang.module.ModuleDescriptor.Requires;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrivetrainS;
import frc.robot.JoystUtil;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class DriveTrainC extends CommandBase {
  private final DrivetrainS m_drive;

  public DriveTrainC(DrivetrainS drive){
    m_drive = drive;
  }
  

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Robot.m_DrivetrainS.setRaw(Robot.m_JoystUtil.basicxAxis(), Robot.m_JoystUtil.basicyAxis());
    RobotContainer.configureJoyst(); // To be worked on later ...
    Robot.m_DrivetrainS.setRaw(Robot.m_JoystUtil.basicxAxis(), Robot.m_JoystUtil.basicyAxis());

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
