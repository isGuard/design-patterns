package org.example.round;

/**
 * 圆孔
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/14 下午4:11
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
