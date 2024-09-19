package org.example;

import org.example.facade.VideoConversionFacade;

import java.io.File;

/**
 * 客户端代码
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/19 上午11:44
 */
public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}