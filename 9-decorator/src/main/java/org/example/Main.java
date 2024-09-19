package org.example;

import org.example.decorators.*;

/**
 * 客户端代码
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/18 下午5:52
 */

public class Main {
    public static void main(String[] args) {
        String salaryRecords = "姓名，薪水 \n 约翰·史密斯，100000\n Steven Jobs，912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}