package org.example.buttons;

/**
 * HTML button实施。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午3:38
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>HTML Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("点击!按钮说 - 'HTML Button!'");
    }
}
