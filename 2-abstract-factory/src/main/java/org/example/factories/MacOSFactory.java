package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.MacOSButton;
import org.example.checkboxes.Checkbox;
import org.example.checkboxes.MacOSCheckbox;

/**
 * 每个混凝土工厂扩展基本工厂并负责创建
 * 单一品种的产品。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午5:45
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}