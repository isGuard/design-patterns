package org.example.some_complex_media_library;

/**
 * @author Z
 * @version V1.0
 * @date 2024/9/19 上午11:47
 */
public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
}
