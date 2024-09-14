package org.example;

import org.example.adapters.SquarePegAdapter;
import org.example.round.RoundHole;
import org.example.round.RoundPeg;
import org.example.square.SquarePeg;

/**
 * 客户端代码
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/14 下午4:16
 */
public class Main {

    public static void main(String... args) {
        // 圆形适合圆形，不足为奇。
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // 无法编译。

        // 适配器解决了这个问题。
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
