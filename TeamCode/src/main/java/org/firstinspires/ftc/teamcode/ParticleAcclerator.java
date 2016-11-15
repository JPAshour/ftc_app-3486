package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Owner_2 on 11/5/2016.
 */

public class ParticleAcclerator {
    public DcMotor Acclerator = null;
    //public DcMotor Acc2 = null;

    private enum accleratorEnum {Run, Stop}
    private accleratorEnum AccleratorState =accleratorEnum.Stop;
    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    public ParticleAcclerator(String Acclerator, HardwareMap hardwareMap) {
        this.Acclerator = hardwareMap.dcMotor.get(Acclerator);
    }

    public void run() {
        Acclerator.setPower(-1.0);
        AccleratorState = accleratorEnum.Run;
    }

    public void stop() {
        Acclerator.setPower(0);
        AccleratorState = accleratorEnum.Stop;
    }

    @Override
    public String toString() {
        switch (AccleratorState){
            case Run:
                return "Running";

            case Stop:
                return "Stopped";

            default:
                return "Unknown";

        }


    }

    /*public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        Acc1 = hwMap.dcMotor.get("Acc 1");
        Acc2 = hwMap.dcMotor.get("Acc 2");

        Acc1.setDirection(DcMotor.Direction.FORWARD);
        Acc2.setDirection(DcMotor.Direction.FORWARD);

        Acc1.setPower(0);
        Acc2.setPower(0);
    }*/

    /*public void waitForTick(long periodMs) {

        long remaining = periodMs - (long) period.milliseconds();

        // sleep for the remaining portion of the regular cycle period.
        if (remaining > 0) {
            try {
                Thread.sleep(remaining);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Reset the cycle clock for the next pass.
        period.reset(); */
}
