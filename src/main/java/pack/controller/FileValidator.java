package pack.controller;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
public class FileValidator implements Validator{  //파일 유무 검사용
	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		UploadFile file = (UploadFile)target;
		
		if(file.getFile().getSize() == 0) {
			errors.rejectValue("file", "", "업로드할 파일을 선택하시오");
		}
	}
}
