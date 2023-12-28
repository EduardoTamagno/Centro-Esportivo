package br.com.footed.CentroEsportivo.infra.validation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Validacao {
    protected Validacao proxima;

    public abstract Boolean validar(Object objeto);
}
