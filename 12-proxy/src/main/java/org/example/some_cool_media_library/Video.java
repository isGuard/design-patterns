package org.example.some_cool_media_library;

/**
 * 视频文件
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/20 上午11:22
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}