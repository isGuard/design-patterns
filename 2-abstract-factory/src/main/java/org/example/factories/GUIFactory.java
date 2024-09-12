package org.example.factories;

import org.example.buttons.Button;
import org.example.checkboxes.Checkbox;

/**
 * 抽象工厂知道所有 (抽象) 产品类型。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午5:44
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
