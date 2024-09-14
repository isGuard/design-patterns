package org.example.adapters;

import org.example.round.RoundPeg;
import org.example.square.SquarePeg;

/**
 * 方钉到圆孔的适配器
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/14 下午4:13
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // 计算一个最小圆半径，它可以适合这个钉子。
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}