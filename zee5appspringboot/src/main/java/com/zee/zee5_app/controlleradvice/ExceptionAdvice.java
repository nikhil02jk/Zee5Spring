package com.zee.zee5_app.controlleradvice;

import java.util.HashMap;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.zee.zee5_app.exception.AlreadyExistsException;
import com.zee.zee5_app.exception.IdNotFoundException;
import com.zee.zee5_app.exception.apierror.ApiError;

@ControllerAdvice
public class ExceptionAdvice extends ResponseEntityExceptionHandler{
	//this class should be used when user-defined exception is called throughout all the controllers
	
	@ExceptionHandler(AlreadyExistsException.class)
	public ResponseEntity<?> alreadyRecordExistsExceptionHandler(AlreadyExistsException e){
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "record already exists"+" "+e.getMessage());
		return ResponseEntity.badRequest().body(map);
		
	}
	
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<?> exceptionHandler(Exception e){
//		HashMap<String, String> map = new HashMap<>();
//		map.put("message", "unknown exception"+" "+e.getMessage());
//		return ResponseEntity.badRequest().body(map);
//		
//	}
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<?> idNotFoundExceptionHandler(IdNotFoundException e){
		HashMap<String, String> map = new HashMap<>();
		map.put("message", e.getMessage());
		return ResponseEntity.badRequest().body(map);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		//return super.handleMethodArgumentNotValid(ex, headers, status, request);
		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
		apiError.setMessage("VAlidation Error");
		apiError.addValidationErrors(ex.getBindingResult().getFieldErrors());
		apiError.addValidationError(ex.getBindingResult().getGlobalErrors());
		return buildResponseEntity(apiError);
	}
	
	private ResponseEntity<Object> buildResponseEntity(ApiError apiError){
		 // to get the response entity object 
		return new ResponseEntity<>(apiError,apiError.getHttpStatus());
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	protected ResponseEntity<?> handleConstraintViolation(){
		return null;
	}

}