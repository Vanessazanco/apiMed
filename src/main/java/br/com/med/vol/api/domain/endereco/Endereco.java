package br.com.med.vol.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro=dados.logradouro();
        this.bairro=dados.bairro();
        this.cep=dados.cep();
        this.numero=dados.numero();
        this.complemento=dados.complemento();
        this.cidade=dados.cidade();
        this.uf=dados.uf();

    }

    public void atulizarEndereco(DadosEndereco dados) {

        this.logradouro=dados.logradouro() != null ? dados.logradouro(): this.logradouro;
        this.bairro=dados.bairro() != null ? dados.bairro():this.bairro;
        this.cep=dados.cep()!= null ? dados.cep():this.cep;
        this.numero=dados.numero()!= null ? dados.bairro():this.numero;
        this.complemento=dados.complemento()!= null ? dados.complemento():this.complemento;
        this.cidade=dados.cidade()!= null ? dados.cidade():this.cidade;
        this.uf=dados.uf()!= null ? dados.uf():this.uf;

    }


}
