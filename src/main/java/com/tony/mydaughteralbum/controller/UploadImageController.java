package com.tony.mydaughteralbum.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/upload")
public class UploadImageController {
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String getUploadForm(){
		return "FileUpload";
	}
	@RequestMapping(value="/ajaxupload", method=RequestMethod.POST)
	public ModelAndView upload(@RequestParam("fileupload") MultipartFile file) throws Exception{
		
		if(!file.isEmpty()){
			String fileName = file.getOriginalFilename();
			int index = fileName.lastIndexOf("\\");
			if(index>0){
				fileName = fileName.substring(index+1);
			}
		
			file.transferTo(new File("D:\\FileUpload\\"+fileName));
			
			/*FileOutputStream stream = new FileOutputStream("D:\\FileUpload\\"+fileName);
			stream.write(file.getBytes());
			stream.close();*/
		}
			
			
		return new ModelAndView("FileUploadSuccess");
	}
}
