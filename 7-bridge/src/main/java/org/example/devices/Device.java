package org.example.devices;

/**
 * 所有设备的通用接口
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/18 下午2:37
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}