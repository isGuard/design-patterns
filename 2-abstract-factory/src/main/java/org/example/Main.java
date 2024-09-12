package org.example;

import org.example.app.Application;
import org.example.factories.GUIFactory;
import org.example.factories.MacOSFactory;
import org.example.factories.WindowsFactory;

/**
 * Main类。一切都聚集在这里。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/12 下午5:50
 */
public class Main {

    /**
     * 应用程序选择工厂类型并在运行时创建它 (通常在
     * 初始化阶段)，具体取决于配置或环境
     * 变量。
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String... args) {
        Application app = configureApplication();
        app.paint();
    }
}
