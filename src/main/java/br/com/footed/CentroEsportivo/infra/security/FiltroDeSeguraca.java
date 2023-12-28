package br.com.footed.CentroEsportivo.infra.security;

import br.com.footed.CentroEsportivo.model.usuario.Usuario;
import br.com.footed.CentroEsportivo.repository.UsuarioRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Service
@AllArgsConstructor
public class FiltroDeSeguraca extends OncePerRequestFilter {

    private JwtUtils jwtUtils;
    private UsuarioRepository usuarioRepository;

    @Override           //Filtro que valida se o Token é valido
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = request.getHeader("Authorization");
        if (token != null) {
            token = token.replace("Bearer ", "");
            String cpf = jwtUtils.validaToken(token);
            UserDetails usuario = usuarioRepository.findByCpf(cpf);
            var springToken = new UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(springToken);
        }
        filterChain.doFilter(request, response);   //passa para o proximo filtro da corrente
    }

}
