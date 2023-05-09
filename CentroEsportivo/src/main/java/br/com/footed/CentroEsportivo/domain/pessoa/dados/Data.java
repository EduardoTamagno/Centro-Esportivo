package br.com.footed.CentroEsportivo.domain.pessoa.dados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

    private String data;
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public Data(String data) {
        this.data = data;
    }

    public Date getData() {
        try {
            return format.parse(data);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
