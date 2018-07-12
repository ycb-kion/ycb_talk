package com.filecontroller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.po.User;

@Controller
public class UploadIconController {
	
	@PostMapping(value="upload.action")
	public String uploadIcon(HttpServletRequest request,@RequestParam("icon") MultipartFile icon,ModelMap map) throws Exception {
		
		 //文件不能为空
		if (!icon.isEmpty()) {
			//上传路径
			String path=request.getServletContext().getRealPath("/")+"img";
			//文件名
			String filename = icon.getOriginalFilename();
			File filepath = new File(path,filename);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件当中
            icon.transferTo(new File(path + File.separator + filename));
            map.addAttribute("filename", filename);
            map.addAttribute("result", "上传成功！");
            return "forward:/register.jsp";
        } else {
        	map.addAttribute("result", "上传失败！");
            return "forward:/register.jsp";
        }
	}
	
	
}
