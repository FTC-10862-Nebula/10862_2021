package org.firstinspires.ftc.teamcode.subsystems;

import com.acmerobotics.dashboard.config.Config;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.motors.CRServo;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.util.Util;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Config
public class Intake extends SubsystemBase {
    public static double INTAKE_SPEED = .75;
    public static double OUTTAKE_SPEED = -.75;

    Telemetry telemetry;
    private MotorEx intakeMotor;

    public Intake(MotorEx intakeMotor, Telemetry tl) {
        this.intakeMotor = intakeMotor;
        this.telemetry = tl;
    }

    @Override
    public void periodic() {
        //Util.logger(this, telemetry, Level.INFO, "Current Intake Speed", intake.get());
    }

    private void set(double speed) {
        intakeMotor.set(speed);
    }

    public void intake() {
        set(INTAKE_SPEED);
    }

    public void outtake() {
        set(OUTTAKE_SPEED);
    }

    public void stop() {
        intakeMotor.stopMotor();
    }
}
