package org.example.shapes;

import java.awt.*;

/**
 * 通用形状接口
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/18 下午4:18
 */
public interface Shape {
    int getX();

    int getY();

    int getWidth();

    int getHeight();

    void move(int x, int y);

    boolean isInsideBounds(int x, int y);

    void select();

    void unSelect();

    boolean isSelected();

    void paint(Graphics graphics);
}
