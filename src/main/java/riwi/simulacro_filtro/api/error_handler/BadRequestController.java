package riwi.simulacro_filtro.api.error_handler;

import java.util.ArrayList;
import java.util.List;

import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import riwi.simulacro_filtro.api.dto.error.BasicError;
import riwi.simulacro_filtro.api.dto.error.ErrorResp;

@RestControllerAdvice
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestController {
  
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public BasicError handleBadRequest(
    MethodArgumentNotValidException exception
  ){

    List<String> errors = new ArrayList<>();

    exception.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));

    return ErrorResp.builder()
      .errors(errors)
      .code(HttpStatus.BAD_REQUEST.value())
      .status(HttpStatus.BAD_REQUEST.name())
      .build();
  }

  @ExceptionHandler(BadRequestException.class)
  public BasicError badRequest(BadRequestException exception){
    List<String> errors = new ArrayList<>();

    errors.add(exception.getMessage());

    return ErrorResp.builder()
        .code(HttpStatus.BAD_REQUEST.value())
        .status(HttpStatus.BAD_REQUEST.name())
        .errors(errors)
        .build();
  }
}
