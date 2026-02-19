package demos.springboot.exceptions;

import java.util.Date;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(value = NullPointerException.class)
	public ExceptionDetails handleNullPointerException(NullPointerException npe, WebRequest webReq) {

		
		ExceptionDetails ed = new ExceptionDetails();
		ed.setMessage(npe.getMessage());
		ed.setUrl(webReq.getDescription(false));
		ed.setDate(new Date());
		return ed;
	}
	
	
	@ExceptionHandler(value = ResourceNotFoundException.class)
	public ExceptionDetails handleResourceNotFoundException(ResourceNotFoundException rne, WebRequest request) {

		ExceptionDetails ed = new ExceptionDetails();
		ed.setMessage(rne.getMessage());
		ed.setUrl(request.getDescription(false));
		return ed;
		
	}
	
	
	@ExceptionHandler(value = Exception.class)
	public ExceptionDetails handleException(Exception e, WebRequest request) {

		ExceptionDetails ed = new ExceptionDetails();
		ed.setMessage(e.getMessage());
		ed.setUrl(request.getDescription(false));
		return ed;
		
	}


}
