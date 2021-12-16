//imports
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.CommandGroupBase;
import frc.robot.Robot;
import frc.robot.subsystems.Elevator;

public class elevatorDown extends CommandBase {
    public elevatorDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.m_elev);
    }

    private void requires(Elevator m_elev) {
    }

    // Called just before this Command runs the first time
      //sid - changed to public
      @Override
      public void initialize() {

      }
    
      // Called repeatedly when this Command is scheduled to run
      @Override
      public void execute() {
        Robot.m_elev.lower();
      }
    
      // Make this return true when this Command no longer needs to run execute()
      @Override
      public boolean isFinished() {
        return !Robot.m_oi.elevDownCheck();
      }
    
      // Called once after isFinished returns true
//@Override
      public void end() {
        Robot.m_elev.stop();
      }
    
      // Called when another command which requires one or more of the same
      // subsystems is scheduled to run
      
      // @Override
      public void interrupted() {
        end();
      }
}
