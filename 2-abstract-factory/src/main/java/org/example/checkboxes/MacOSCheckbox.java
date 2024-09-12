package org.example.checkboxes;

/**
 * 所有产品系列都有相同的品种 (MacOS/Windows)。
 * <p>
 * 这是一个复选框的变体。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午5:43
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("您已创建MacOSCheckbox.");
    }
}
