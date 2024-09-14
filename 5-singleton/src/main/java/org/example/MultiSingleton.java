package org.example;

/**
 * 单例
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/14 上午11:14
 */
public final class MultiSingleton {
    private static MultiSingleton instance;
    public String value;

    private MultiSingleton(String value) {
        // 下面的代码模拟缓慢的初始化。
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static MultiSingleton getInstance(String value) {
        if (instance == null) {
            instance = new MultiSingleton(value);
        }
        return instance;
    }
}
