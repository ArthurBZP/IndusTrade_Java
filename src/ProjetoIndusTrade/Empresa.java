package ProjetoIndusTrade;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private String senha;
    private String razaoSocial;  
    private String email;
    private String telefone;
    private Endereco endereco;
    private List<Anuncio> anuncios;

    public Empresa(String cnpj, String senha, String razaoSocial, String email, String telefone, 
                   String cep, String logradouro, String numero, String bairro, String cidade, String uf) {
        this.cnpj = cnpj;
        this.senha = senha;
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.telefone = telefone;
        this.endereco = new Endereco(cep, logradouro, numero, bairro, cidade, uf);
        this.anuncios = new ArrayList<>();
    }

    public int getEnderecoId() {
        return this.endereco.getId();
    }

    public void adicionarAnuncio(Anuncio anuncio) {
        this.anuncios.add(anuncio);
    }

    public boolean isCnpjValido() {
        if (this.cnpj == null) return false;
        String apenasNumeros = this.cnpj.replaceAll("\\D", "");
        return apenasNumeros.length() == 14;
    }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }

    public Endereco getEndereco() { return endereco; }
    
    public String getSenha() { return senha; }
}