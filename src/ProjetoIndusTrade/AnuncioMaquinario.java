package ProjetoIndusTrade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnuncioMaquinario extends Anuncio {
    private String nome;
    private String estadoConservacao;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double peso;
    private String dimensao;
    private String voltagem;
    private String categoria;
    

    private List<Imagem> imagensAdicionais = new ArrayList<>();


    public AnuncioMaquinario(String empresaCnpj, String titulo, String descricao, double valor, LocalDate data, String urlImagem, 
    		boolean principal, String nome, String estadoConservacao, String marca, String modelo,  int anoFabricacao, 
    		double peso, String dimensao, String voltagem, String tipoCategoria) {
        super(titulo, descricao, valor, data, urlImagem, principal);
        this.setEmpresaCnpj(empresaCnpj); 
        this.nome = nome;
        this.estadoConservacao = estadoConservacao;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.peso = peso;
        this.dimensao = dimensao;
        this.voltagem = voltagem;
        this.categoria = Categoria.classificarMaquinario(peso, voltagem);
    }

    public AnuncioMaquinario(int id, String titulo, String descricao, double valor, 
    						LocalDate data, String urlImagem, boolean principal, String empresaCnpj,
                              String nome, String estadoConservacao, String marca, String modelo, 
                              int anoFabricacao, double peso, String dimensao, String tipoCategoria) {
        
        super(titulo, descricao, valor, data, urlImagem, principal);
        this.setEmpresaCnpj(empresaCnpj);
        
        this.nome = nome;
        this.estadoConservacao = estadoConservacao;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.peso = peso;
        this.dimensao = dimensao;
        this.categoria = Categoria.classificarMaquinario(peso, voltagem);
        this.voltagem = "N/A"; 
    }
    
    public void publicar() {
        this.setStatus("publicado");
    }

    public void adicionarImagem(String url) {

        Imagem novaImagem = new Imagem(url, false);
        this.imagensAdicionais.add(novaImagem);
    }


}