package org.example.factory;

import org.example.buttons.Button;

/**
 * 基本工厂类。请注意，"工厂 "只是该类的一个角色。
 * 它应该有一些核心业务逻辑，需要创建不同的产品。
 * 创建。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午3:55
 */
public abstract class Dialog {

    public void renderWindow() {
        // ...其他代码...
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * 子类将重写此方法以创建特定的按钮
     * 对象。
     */
    public abstract Button createButton();
}
