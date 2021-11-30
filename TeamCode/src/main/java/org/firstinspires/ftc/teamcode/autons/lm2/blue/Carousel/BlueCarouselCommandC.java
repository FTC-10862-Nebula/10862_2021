package org.firstinspires.ftc.teamcode.autons.lm2.blue.Carousel;

import com.arcrobotics.ftclib.command.SequentialCommandGroup;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.commands.drive.DriveForwardCommand;
import org.firstinspires.ftc.teamcode.commands.drive.TurnToCommand;
import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;

public class BlueCarouselCommandC extends SequentialCommandGroup {
    public BlueCarouselCommandC(Drivetrain drivetrain, Telemetry telemetry) {
        //declare variables here


        addCommands(
                //distance is in inches
                new DriveForwardCommand(drivetrain, -24),
                new TurnToCommand(drivetrain, 45, true),
                //arm
                new DriveForwardCommand(drivetrain, -24),
                //servo deposit
                new DriveForwardCommand(drivetrain, 24),
                new TurnToCommand(drivetrain, 0),
                new DriveForwardCommand(drivetrain, 24.5),
                new TurnToCommand(drivetrain, 170),
                new DriveForwardCommand(drivetrain, 24),
                //carousel
                new TurnToCommand(drivetrain, 180),
                new DriveForwardCommand(drivetrain, 24)

                //distance is in inches
                //The weird makes the robot go opposite direction
        );
    }
}