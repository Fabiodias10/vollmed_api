package med.voll.api.endereco;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;
public Endereco(){

}
    public Endereco(DadosEndereco dados) {
    this.logradouro = dados.logradouro();
    this.bairro = dados.bairro();
    this.uf = dados.uf();
    this.cep = dados.cep();
    this.complemento = dados.complemento();
    this.numero = dados.numero();
    this.cidade = dados.cidade();
    }
}
