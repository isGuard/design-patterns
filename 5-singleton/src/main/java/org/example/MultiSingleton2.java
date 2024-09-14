package org.example;

/**
 * 单例
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/14 上午11:17
 */
public class MultiSingleton2 {
    // 该字段必须声明为volatile，以便双重检查锁定可以工作
    // 正确。
    private static volatile MultiSingleton2 instance;

    public String value;

    private MultiSingleton2(String value) {
        this.value = value;
    }

    public static MultiSingleton2 getInstance(String value) {
        // 这里采取的方法称为双重检查锁定 (DCL)。它
        // 存在以防止多个线程之间的争用条件
        // 尝试同时获取单例实例，创建单独的
        // 实例作为结果。
        //
        // 似乎这里的 'result' 变量完全是
        // 毫无意义。然而，有一个非常重要的警告
        // 在Java中实现双重检查锁定，这由
        // 引入这个局部变量。
        //
        // 您可以在Java中阅读更多信息DCL问题:
        // https://refactoring.guru/java-dcl-issue
        MultiSingleton2 result = instance;
        if (result != null) {
            return result;
        }
        synchronized (MultiSingleton2.class) {
            if (instance == null) {
                instance = new MultiSingleton2(value);
            }
            return instance;
        }
    }
}
