package org.firstinspires.ftc.teamcode.robotutil;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.hardware.bosch.BNO055IMU;


public class DriveTrain{

    public DcMotor rF, rB, lF, lB,rSlide,lSlide;
    public IMU imu;

    LinearOpMode opMode;

    public DriveTrain( LinearOpMode opMode) {
        this.opMode = opMode;
        lB = opMode.hardwareMap.dcMotor.get("lB");
       // rF = opMode.hardwareMap.dcMotor.get("rF");
        //lF = opMode.hardwareMap.dcMotor.get("lF");
        rB = opMode.hardwareMap.dcMotor.get("rB");
        rSlide = opMode.hardwareMap.dcMotor.get("rSlide");
        lSlide = opMode.hardwareMap.dcMotor.get("lSlide");
       // colorSensor = opMode.hardwareMap.colorSensor.get("colorSensor");
        BNO055IMU adaImu = opMode.hardwareMap.get(BNO055IMU.class, "imu");

        imu = new IMU(adaImu);
        lB.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lF.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rB.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rF.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rB.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        lB.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rF.setDirection(DcMotor.Direction.FORWARD);
        rB.setDirection(DcMotor.Direction.FORWARD);
        lB.setDirection(DcMotor.Direction.REVERSE);
        lF.setDirection(DcMotor.Direction.REVERSE);
        rSlide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        lSlide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rSlide.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lSlide.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

}
