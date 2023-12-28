package br.com.footed.CentroEsportivo.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@Component
public class JwtUtils {

    public String getToken (String cpf) { //Método para criação do token
        return JWT.create()
                .withIssuer("Footed")  //Empresa que esta gerando o token
                .withExpiresAt(Instant.now().plus(30L, ChronoUnit.MINUTES)) //Define que o token expira em 10 mim
                .withSubject(cpf) //Adiciona o cpf no token
                .sign(Algorithm.HMAC256("Complexo"));  // Palavra de segurança
    }

    public String validaToken(String token) {
        return JWT.require(Algorithm.HMAC256("Complexo")).withIssuer("Footed").build().verify(token).getSubject(); //valida palavra de segurança e empresa, depois retorna o cpf
    }
}
