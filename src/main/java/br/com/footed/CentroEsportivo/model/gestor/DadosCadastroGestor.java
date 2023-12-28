package br.com.footed.CentroEsportivo.model.gestor;

import br.com.footed.CentroEsportivo.model.complexo.Complexo;
import br.com.footed.CentroEsportivo.model.complexo.DadosCadastroComplexo;
import br.com.footed.CentroEsportivo.model.pessoa.DadosCadastroPessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroGestor(
        @NotBlank (message = "CNPJ é uma informação obrigatória!")
        @Pattern(regexp = "^\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}$" , message = "Formato invalido para o CNPJ!")
        String cnpj,
        @NotBlank (message = "Senha é uma informação obrigatória!")
        String senha,
        @NotNull
        @Valid
        DadosCadastroPessoa pessoa,
        @NotNull
        @Valid
        DadosCadastroComplexo complexo
) {
}
