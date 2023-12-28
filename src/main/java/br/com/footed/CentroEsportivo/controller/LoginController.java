package br.com.footed.CentroEsportivo.controller;

import br.com.footed.CentroEsportivo.infra.security.JwtUtils;
import br.com.footed.CentroEsportivo.model.login.DadosLoginUsuario;
import br.com.footed.CentroEsportivo.model.usuario.Usuario;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@AllArgsConstructor
public class LoginController {

    private final AuthenticationManager authentication;
    private final JwtUtils jwt;

    @PostMapping
    public String logar(@RequestBody @Valid DadosLoginUsuario dadosLogin) {
        var userToken = new UsernamePasswordAuthenticationToken(dadosLogin.cpf(),dadosLogin.senha());
        var auth = authentication.authenticate(userToken);
        Usuario usuario = (Usuario) auth.getPrincipal();
        return jwt.getToken(usuario.getCpf());
    }
}
