package org.example.remotes;

import org.example.devices.Device;

/**
 * 基础远程控制器
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/18 下午2:51
 */
public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("远程: 电源切换");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("远程: 降低音量");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("远程: 音量增大");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("远程: 通道关闭");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("远程: 通道向上");
        device.setChannel(device.getChannel() + 1);
    }
}