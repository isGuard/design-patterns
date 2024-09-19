package org.example.decorators;

/**
 * 抽象基础装饰
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/18 下午6:00
 */
public abstract class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
