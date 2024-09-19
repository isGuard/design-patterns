package org.example.some_complex_media_library;

/**
 * @author Z
 * @version V1.0
 * @date 2024/9/19 上午11:48
 */
public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: 读取文件...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: 写入文件...");
        return buffer;
    }
}
