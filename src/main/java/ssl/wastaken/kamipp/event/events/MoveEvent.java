package ssl.wastaken.kamipp.event.events;

import ssl.wastaken.kamipp.event.EventStage;
import net.minecraft.entity.MoverType;
import net.minecraftforge.fml.common.eventhandler.Cancelable;

@Cancelable
public class MoveEvent
        extends EventStage {
    public MoverType type;
    public double x;
    public double y;
    public double z;


    public MoveEvent(int stage, MoverType type, double x, double y, double z) {
        super(stage);
        this.type = type;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean isCancelable() {
        return true;
    }

    public MoverType getType() {
        return this.type;
    }

    public void setType(MoverType type) {
        this.type = type;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }



}

