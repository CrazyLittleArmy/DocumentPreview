package cn.supremelytechnology.service;

import cn.supremelytechnology.model.FileAttribute;
import org.springframework.ui.Model;

/**
 * Created by kl on 2018/1/17.
 * Content :
 */
public interface FilePreview {
    String filePreviewHandle(String url, Model model, FileAttribute fileAttribute);
}
