package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.WindowsButton;
import org.example.checkboxes.Checkbox;
import org.example.checkboxes.WindowsCheckbox;

/**
 * 每个混凝土工厂扩展基本工厂并负责创建
 * 单一品种的产品。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午5:46
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
