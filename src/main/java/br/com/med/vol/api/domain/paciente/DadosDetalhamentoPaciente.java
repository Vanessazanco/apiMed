package br.com.med.vol.api.domain.paciente;

import br.com.med.vol.api.domain.endereco.Endereco;


public record DadosDetalhamentoPaciente(

        String nome,

        String email,

        String telefone,

        String cpf,
        Endereco endereco
) {
    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(
                paciente.getNome(),
                paciente.getEmail(),
                paciente.getTelefone(),
                paciente.getCpf(),
                paciente.getEndereco()
        );
    }
}
