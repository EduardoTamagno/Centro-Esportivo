package br.com.footed.CentroEsportivo.model.usuario;

import br.com.footed.CentroEsportivo.model.pessoa.DadosCadastroPessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
public record DadosCadastroUsuario(
        @NotBlank (message = "Senha é uma informação obrigatória!")
        String senha,
        @NotBlank (message = "CPF é uma informação obrigatória!")
        @Pattern(regexp = "^\\d{3}.\\d{3}.\\d{3}-\\d{2}$" , message = "Formato invalido para CPF!")
        String cpf,
        @Valid
        DadosCadastroPessoa dadosPessoa
) {}