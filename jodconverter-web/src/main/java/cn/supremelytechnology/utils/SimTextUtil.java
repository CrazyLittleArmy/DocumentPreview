package cn.supremelytechnology.utils;

import cn.supremelytechnology.config.ConfigConstants;
import cn.supremelytechnology.model.FileAttribute;
import cn.supremelytechnology.model.ReturnResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *  读取类文本文件
 * @author yudian-it
 * @date 2017/12/13
 */
@Component
public class SimTextUtil {
    @Autowired
    private FileUtils fileUtils;
    @Autowired
    private DownloadUtils downloadUtils;

    public ReturnResponse<String> readSimText(String url, String fileName){
        FileAttribute fileAttribute = fileUtils.getFileAttribute(url);
        ReturnResponse<String> response = downloadUtils.downLoad(fileAttribute, fileName);
        return response;
    }
}
