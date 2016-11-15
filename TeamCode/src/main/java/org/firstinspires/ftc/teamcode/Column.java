package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Owner_2 on 11/13/2016.
 */

public class Column {
    public DcMotor Column = null;

    private enum columnEnum {Extend, Retract, Stop}
    private columnEnum ColumnState =columnEnum.Stop;
    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    public Column(String Column, HardwareMap hardwareMap) {
        this.Column = hardwareMap.dcMotor.get(Column);
    }

    public void extend(){
        Column.setPower(1.0);
    }

    public void retract(){
        Column.setPower(-1.0);
    }

    public void stop(){
        Column.setPower(0);
    }

    @Override
    public String toString() {
        switch (ColumnState){
            case Extend:
                return "Extending";

            case Retract:
                return "Retracting";

            case Stop:
                return "Stopped";

            default:
                return "Unknown";

        }


    }


}
