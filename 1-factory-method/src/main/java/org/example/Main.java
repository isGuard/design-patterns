package org.example;

import org.example.factory.Dialog;
import org.example.factory.HtmlDialog;
import org.example.factory.WindowsDialog;

/**
 * Main类。一切都聚集在这里。
 * @author Z
 */
public class Main {
    private static Dialog dialog;

    public static void main(String... args) {
        configure();
        runBusinessLogic();
    }

    /**
     * 混凝土工厂通常根据配置或
     * 环境选项。
     */
    static void configure() {
        if ("Windows 10".equals(System.getProperty("os.name"))) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * 所有客户端代码都应通过以下方式与工厂和产品一起使用
     * 抽象接口。这种方式，它并不关心它的工作工厂
     * 以及它返回什么样的产品。
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}