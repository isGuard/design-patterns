package org.example;

import org.example.devices.Device;
import org.example.devices.Radio;
import org.example.devices.Tv;
import org.example.remotes.AdvancedRemote;
import org.example.remotes.BasicRemote;

/**
 * 客户端代码
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/18 上午11:23
 */
public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("使用基本遥控器进行测试。");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("使用高级遥控器进行测试。");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}