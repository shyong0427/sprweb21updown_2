package pack.controller;

import java.io.File;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DownloadController {
	@RequestMapping("download")
	@ResponseBody
	public byte[] getDownload(HttpServletResponse response,
			@RequestParam("filename") String filename) throws Exception {
		System.out.println("filename : " + filename);
		
		File file = new File("c:/my/upload/" + filename);
		byte[] bytes = FileCopyUtils.copyToByteArray(file);
		String fn = new String(file.getName().getBytes(), "utf-8");  //"iso_8859_1"
		response.setHeader("Content-Disposition", "attachment;filename=\"" + fn + "\"");
		response.setContentLength(bytes.length);
		
		return bytes;
	}
}
