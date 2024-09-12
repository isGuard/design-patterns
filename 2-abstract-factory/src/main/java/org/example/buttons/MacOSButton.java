package org.example.buttons;

/**
 * 所有产品系列都有相同的品种 (MacOS/Windows)。
 * <p>
 * 这是一个按钮的MacOS变体。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午5:41
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("您已创建MacOSButton.");
    }
}