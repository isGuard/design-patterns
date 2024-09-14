package org.example;

/**
 * 客户端代码
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/14 上午11:10
 */
public class MainSingleThread {
    public static void main(String... args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
