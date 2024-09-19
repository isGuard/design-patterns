package org.example.trees;

import java.awt.*;

/**
 * 包含每棵树的独特状态
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/19 下午3:25
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
