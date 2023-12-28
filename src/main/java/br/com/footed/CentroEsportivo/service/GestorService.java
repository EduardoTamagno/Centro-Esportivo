package br.com.footed.CentroEsportivo.service;

import br.com.footed.CentroEsportivo.model.gestor.DadosCadastroGestor;
import br.com.footed.CentroEsportivo.model.gestor.DadosDetalhamentoGestor;
import br.com.footed.CentroEsportivo.model.gestor.Gestor;
import br.com.footed.CentroEsportivo.repository.GestorRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GestorService {

    private final GestorRepository gestorReository;
    private final PasswordEncoder passwordEncoder;

    public DadosDetalhamentoGestor cadastrar(DadosCadastroGestor dadosCadastro){
        Gestor gestor = new Gestor(dadosCadastro.cnpj(), passwordEncoder.encode(dadosCadastro.senha()), dadosCadastro.complexo(), dadosCadastro.pessoa());
        gestorReository.save(gestor);
        return new DadosDetalhamentoGestor(gestor);
    }
}
