package com.donatoordep.dslearn.exceptions;

import java.io.Serial;

public class ONBUsuarioNaoEncontradoException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 3278948151448419361L;
    private static final String ERROR = "Usuário não encontrado";

    public ONBUsuarioNaoEncontradoException() {
        super(ERROR);
    }
}