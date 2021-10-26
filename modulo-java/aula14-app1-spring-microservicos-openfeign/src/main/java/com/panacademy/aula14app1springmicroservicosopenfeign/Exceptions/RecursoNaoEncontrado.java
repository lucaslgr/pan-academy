package com.panacademy.aula14app1springmicroservicosopenfeign.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Amigo..não achamos .")
public class RecursoNaoEncontrado extends RuntimeException{

    private static final long serialVersionUID = 1L;
}
