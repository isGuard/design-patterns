package org.example.some_complex_media_library;

/**
 * @author Z
 * @version V1.0
 * @date 2024/9/19 上午11:48
 */
public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: 提取音频...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: 提取ogg音频...");
            return new OggCompressionCodec();
        }
    }
}
