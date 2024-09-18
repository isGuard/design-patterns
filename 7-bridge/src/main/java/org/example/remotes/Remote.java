package org.example.remotes;

/**
 * 所有远程控制器的通用接口
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/18 下午2:50
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
