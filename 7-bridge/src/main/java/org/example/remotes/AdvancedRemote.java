package org.example.remotes;

import org.example.devices.Device;

/**
 * 高级远程控制器
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/18 下午2:52
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("遥控: 静音");
        device.setVolume(0);
    }
}