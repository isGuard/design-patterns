package org.example.buttons;

/**
 * 抽象工厂假设你有几个系列的产品，
 * 结构成单独的类层次结构 (按钮/复选框)。的所有产品
 * 同一个家庭有共同的接口。
 * <p>
 * 这是按钮家族的通用接口。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午5:41
 */
public interface Button {
    void paint();
}
