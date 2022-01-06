package org.firstinspires.ftc.teamcode.commands.CapArmCommands;

import com.arcrobotics.ftclib.command.ConditionalCommand;
import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.ScheduleCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;
import org.firstinspires.ftc.teamcode.commands.DriveCommands.DriveForwardCommand;
import org.firstinspires.ftc.teamcode.subsystems.CapServos;
import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;

import java.time.Instant;

public class CapArmMidCommand extends SequentialCommandGroup {
    private CapServos capServo;
    private Drivetrain drivetrain;

    public CapArmMidCommand(CapServos capServos, Drivetrain drivetrain) {

        addCommands(
                new InstantCommand(capServos::autoMid, capServos),
                new DriveForwardCommand(drivetrain, -3),
                new InstantCommand(capServos::clawOpen, capServos),
                new WaitCommand(100),
                new InstantCommand(capServos::clawOpen, capServos),
                new DriveForwardCommand(drivetrain, 3),
                new InstantCommand(capServos::capReset, capServos)
        );
    }}
