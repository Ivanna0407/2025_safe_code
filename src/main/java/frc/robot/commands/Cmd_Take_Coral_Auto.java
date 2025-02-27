// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Sub_Elevador;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class Cmd_Take_Coral_Auto extends Command {
  /** Creates a new Cmd_Take_Coral_Auto. */
  private final Sub_Elevador elevador;
  public Cmd_Take_Coral_Auto(Sub_Elevador Elevador) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.elevador=Elevador;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(elevador.pieza==false){
      elevador.set_Coral(-.3);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if(elevador.pieza==true){
      return true;
    }
    else{return false;}
  }
}
