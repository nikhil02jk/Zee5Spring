//package com.zee.zee5_app.controlleradvice;
//
//import java.net.http.HttpHeaders;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import net.bytebuddy.description.modifier.MethodArguments;
//
//public class ErrorAdvice extends ResponseEntityExceptionHandler{
//	
//	
//	protected ResponseEntity<Object> handlerMethodArgumentNotValid(MethodArgumentNotValidException ex,
//  HttpHeaders headers,HttpStatus status,WebRequest request){
//           return ResponseEntity.ok(ex);
//		
//	}
//	
//}
