package frc.robot.utils.hardware;

import com.revrobotics.spark.ClosedLoopSlot;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkClosedLoopController.ArbFFUnits;

public class Vortex extends SparkFlex {

    public Vortex(int id) {
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