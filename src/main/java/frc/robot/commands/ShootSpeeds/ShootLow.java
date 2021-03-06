// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.ShootSpeeds;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShooterSubsystem;

public class ShootLow extends CommandBase {

  private final ShooterSubsystem m_shooterSubsystem;
  private final double lowShootSpeed = 0.85; // Speed should remain constant after determining

  /** Creates a new ShootLow. */
  public ShootLow(ShooterSubsystem shooterSubsystem) {
    m_shooterSubsystem = shooterSubsystem;

    addRequirements(m_shooterSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_shooterSubsystem.shoot(lowShootSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
