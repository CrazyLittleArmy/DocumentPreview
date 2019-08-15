package cn.supremelytechnology.service;

import cn.supremelytechnology.model.FileAttribute;
import cn.supremelytechnology.model.FileType;
import cn.supremelytechnology.utils.FileUtils;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by kl on 2018/1/17.
 * Content :
 */
@Service
public class FilePreviewFactory {

    @Autowired
    FileUtils fileUtils;

    @Autowired
    ApplicationContext context;

    public FilePreview get(FileAttribute fileAttribute) {
        Map<String, FilePreview> filePreviewMap = context.getBeansOfType(FilePreview.class);
        String filePreviewKey="";
        if (listTXTTypes().contains(fileAttribute.getSuffix().toLowerCase())) {
            filePreviewKey = FileType.simText.getInstanceName();
        }else{
            filePreviewKey = fileAttribute.getType().getInstanceName();
        }
        return filePreviewMap.get(filePreviewKey);
    }
    public List<String> listTXTTypes(){
        List<String> list = Lists.newArrayList();
        list.add("properties");
        list.add("md");
        list.add("js");
        list.add("css");
        list.add("sql");
        return list;
    }
}
