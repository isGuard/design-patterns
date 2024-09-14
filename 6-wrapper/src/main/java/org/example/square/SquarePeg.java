package org.example.square;

/**
 * 方钉
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/14 下午4:12
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
