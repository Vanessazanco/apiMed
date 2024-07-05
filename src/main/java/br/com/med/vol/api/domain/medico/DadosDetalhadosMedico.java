package br.com.med.vol.api.domain.medico;


import br.com.med.vol.api.domain.endereco.Endereco;


public record DadosDetalhadosMedico(

        String nome,

        String email,

        String telefone,

        String crm,

        Especialidade especialidade,
        Endereco endereco

) {
    public DadosDetalhadosMedico(Medico medico){
        this(   medico.getNome(),
                medico.getEmail(),
                medico.getTelefone(),
                medico.getCrm(),
                medico.getEspecialidade(),
                medico.getEndereco()
        );
    }


}
