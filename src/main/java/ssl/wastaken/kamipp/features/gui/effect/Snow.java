package ssl.wastaken.kamipp.features.gui.effect;

import ssl.wastaken.kamipp.util.RenderUtil;
import net.minecraft.client.gui.ScaledResolution;

import java.util.Random;

public class Snow
{
    private int _x;
    private int _y;
    private int _fallingSpeed;
    private int _size;

    public Snow(final int x, final int y, final int fallingSpeed, final int size) {
        this._x = x;
        this._y = y;
        this._fallingSpeed = fallingSpeed;
        this._size = size;
    }

    public int getX() {
        return this._x;
    }

    public void setX(final int x) {
        this._x = x;
    }

    public int getY() {
        return this._y;
    }

    public void setY(final int _y) {
        this._y = _y;
    }

    public void Update(final ScaledResolution res) {
        RenderUtil.drawRect((float)this.getX(), (float)this.getY(), (float)(this.getX() + this._size), (float)(this.getY() + this._size), -1714829883);
        this.setY(this.getY() + this._fallingSpeed);
        if (this.getY() > res.getScaledHeight() + 10 || this.getY() < -10) {
            this.setY(-10);
            final Random rand = new Random();
            this._fallingSpeed = rand.nextInt(5) + 1;
            this._size = rand.nextInt(4) + 1;
        }
    }
}
