package br.com.med.vol.api.domain.paciente;

import br.com.med.vol.api.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;//não obrigatório
    private String cpf;
    @Embedded
    private Endereco endereco;//não obrigatório - complemento
    private Boolean ativo;

    public Paciente (DadosCadastroPaciente dados){
        this.ativo = true;
        this.nome= dados.nome();
        this.email= dados.email();
        this.telefone= dados.telefone();
        this.cpf= dados.cpf();
        this.endereco=new Endereco(dados.endereco());
    }

    public void atulizarInformacoes(DadosaAtulizacaoPaciente dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.endereco() != null) {
            this.endereco.atulizarEndereco(dados.endereco());
        }
        if (dados.cpf() != null && !dados.cpf().equals(this.cpf)) {
            System.out.println("Não é possível alterar o CPF.");
        }
    }

    public void inativar() {
        this.ativo = false;

    }
}
