package br.com.footed.CentroEsportivo.infra.validation;

public class Acertado extends Validacao{

    public Acertado() {
        super(null);
    }
    @Override
    public Boolean validar(Object objeto) {
        return true;
    }
}
