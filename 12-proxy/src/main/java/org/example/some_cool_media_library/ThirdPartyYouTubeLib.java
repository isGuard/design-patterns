package org.example.some_cool_media_library;

import java.util.HashMap;

/**
 * 远程服务接口
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/20 上午11:21
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
