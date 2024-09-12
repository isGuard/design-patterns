package org.example.factory;

import org.example.buttons.Button;
import org.example.buttons.HtmlButton;

/**
 * HTML对话框将产生HTML按钮。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午3:57
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
