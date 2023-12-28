package br.com.footed.CentroEsportivo.infra.security;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class ConfiguracaoSecurity {

    private FiltroDeSeguraca filtroDeSeguraca;

    @Bean
    public AuthenticationManager autenticar(AuthenticationConfiguration configuration) throws Exception {   //Método que ensina o spring a injetar a classe AuthenticationManager
        return configuration.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.csrf(CsrfConfigurer::disable)  // Desabilita a config que faz a validação csrf, pois a utilização de token já previne esses ataques
                .sessionManagement(smc -> smc.sessionCreationPolicy(SessionCreationPolicy.STATELESS))  //Define a aplicação como stateless (Não guarda o tokem no banco)
                .authorizeHttpRequests(amrmr -> amrmr.requestMatchers(HttpMethod.POST, "/login", "/usuario").permitAll() //Permite requisições Post, para os endpoits Login e Usuario, funcionarem sem autenticação
                        .anyRequest().authenticated())
                .addFilterBefore(filtroDeSeguraca, UsernamePasswordAuthenticationFilter.class)   //Garante que o nosso filtro de seguraça seja executado antes dos filtros do spring
                .build();
    }

    @Bean
    public PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder(); //Método para encriptar
    }
}
