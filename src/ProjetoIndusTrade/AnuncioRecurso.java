package ProjetoIndusTrade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnuncioRecurso extends Anuncio {
    private String nome;
    private String tipoMaterial;
    private double quantidade;
    private String unidadeMedida;
    private double peso;
    private String categoria;

    private List<Imagem> imagens = new ArrayList<>();


    public AnuncioRecurso(int id, String empresaCnpj, String titulo, String descricao, double valor, 
    		LocalDate data, String urlImagemPrincipal,
                          String nome, String tipoMaterial, double quantidade, 
                          String unidadeMedida, double peso, String tipoCategoria) {
        

        super(titulo, descricao, valor, data, urlImagemPrincipal, true);
        this.setEmpresaCnpj(empresaCnpj);
        
        this.nome = nome;
        this.tipoMaterial = tipoMaterial;
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
        this.peso = peso;
        this.categoria = Categoria.classificarRecurso(tipoMaterial);
    }


    public void publicar() {
        this.setStatus("publicado");
    }


    public void adicionarImagem(String url) {
        Imagem novaImg = new Imagem(url, false);
        this.imagens.add(novaImg);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipoMaterial() { return tipoMaterial; }
    public void setTipoMaterial(String tipoMaterial) { this.tipoMaterial = tipoMaterial; }

    public double getQuantidade() { return quantidade; }
    public void setQuantidade(double quantidade) { this.quantidade = quantidade; }

    public String getUnidadeMedida() { return unidadeMedida; }
    public void setUnidadeMedida(String unidadeMedida) { this.unidadeMedida = unidadeMedida; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getCategoria() { return categoria; }
}