package org.firstinspires.ftc.teamcode.tasks;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.robotutil.IMU;

public class SlideTask extends TaskThread {

    public DcMotor tSlide, lSlide;
    public IMU imu;

    LinearOpMode opMode;

    public SlideTask( LinearOpMode opMode) {
        this.opMode = opMode;
        tSlide = opMode.hardwareMap.dcMotor.get("tSlide");

        lSlide = opMode.hardwareMap.dcMotor.get("lSlide");



        tSlide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        lSlide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        tSlide.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lSlide.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void run(){
        while (opMode.opModeIsActive()) {
            if (opMode.gamepad1.dpad_down) {
                tSlide.setPower(.8);
                lSlide.setPower(-.8);
                opMode.telemetry.addData("up", .8);
            } else if (opMode.gamepad1.dpad_up) {
                tSlide.setPower(-.8);
                lSlide.setPower(.8);
                opMode.telemetry.addData("down", .8);
            } else {
                tSlide.setPower(0);
                lSlide.setPower(0);
                opMode.telemetry.addData("stop", 0);
            }


        }
    }

    public void initialize(){

    }
}
