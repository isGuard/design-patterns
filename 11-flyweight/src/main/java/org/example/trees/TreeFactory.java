package org.example.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 封装创建享元的复杂机制
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/19 下午3:26
 */
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
