package org.example.factory;

import org.example.buttons.Button;
import org.example.buttons.WindowsButton;

/**
 * Windows对话框将生成Windows按钮。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午3:57
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}