package org.example.checkboxes;

/**
 * 所有产品系列都有相同的品种 (MacOS/Windows)。
 * <p>
 * 这是复选框的另一种变体。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午5:44
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("您已创建WindowsCheckbox.");
    }
}