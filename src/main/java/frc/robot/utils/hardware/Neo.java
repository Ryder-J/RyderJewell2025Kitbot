package frc.robot.utils.hardware;

import com.revrobotics.spark.ClosedLoopSlot;
import com.revrobotics.spark.SparkClosedLoopController.ArbFFUnits;
import com.revrobotics.spark.SparkMax;


public class Neo extends SparkMax {

    public Neo(int id) {
        super(id, MotorType.kBrushless);
    }

    public void setReference(double reference, ControlType controlType, ClosedLoopSlot slot, double ff) {
        getClosedLoopController().setReference(reference, controlType, slot, ff, ArbFFUnits.kPercentOut);
    }

    public void setReference(double reference, ControlType controlType) {
        getClosedLoopController().setReference(reference, controlType);
    }

    public void setReference(double reference) {
        setReference(reference, ControlType.kPosition);
    }

}