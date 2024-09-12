package org.example.buttons;

/**
 * Windows按钮实现。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午3:52
 */
public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Windows Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("点击!按钮说 - 'Windows Button!'");
    }
}
