package br.com.med.vol.api.domain.paciente;

import br.com.med.vol.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosaAtulizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String cpf,
        String telefone,
        DadosEndereco endereco

) {
}
