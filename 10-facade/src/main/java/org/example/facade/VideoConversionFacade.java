package org.example.facade;

import org.example.some_complex_media_library.*;

import java.io.File;

/**
 * 外观提供了进行视频转换的简单接口
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/19 上午11:49
 */
public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: 转换已开始。");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if ("mp4".equals(format)) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: 转换已完成。");
        return result;
    }
}
