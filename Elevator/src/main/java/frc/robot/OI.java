package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.*;

public class OI {
    private final Joystick logi = new Joystick(0);
    private final Button btnUp;
    private final Button btnDown;

    public OI() {
        btnUp = new JoystickButton(logi, 3);
        btnDown = new JoystickButton(logi, 4);
        btnUp.whileHeld((Command) new elevatorUp());
        btnDown.whileHeld((Command) new elevatorDown());
    }

    public boolean elevUpCheck() {
        return btnUp.get();
    }

    public boolean elevDownCheck() {
        return btnDown.get();
    }
}