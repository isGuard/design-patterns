package org.example.app;

import org.example.buttons.Button;
import org.example.checkboxes.Checkbox;
import org.example.factories.GUIFactory;

/**
 * 工厂用户不关心他们使用的混凝土工厂，因为他们的工作
 * 通过抽象接口的工厂和产品。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午5:49
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
