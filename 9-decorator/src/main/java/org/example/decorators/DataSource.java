package org.example.decorators;

/**
 * 定义了读取和写入操作的通用数据接口
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/18 下午5:59
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}