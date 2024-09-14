package org.example;

/**
 * 单例
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/14 上午11:09
 */
public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // 下面的代码模拟缓慢的初始化。
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
