package ProjetoIndusTrade;
import java.time.LocalDate;

public class Anuncio {
	private static int proximoId = 1;
	
	private int id;
    private String empresaCnpj; 
    private String titulo;
    private String descricao;
    private double valor;
    private LocalDate dataPublicacao;
    private String status;
    private Imagem imagem; 

    public Anuncio(String titulo, String descricao, double valor, LocalDate data, String urlImagem, boolean ehPrincipal) {
    	this.id = proximoId++;
    	
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.dataPublicacao = data;
        this.status = "ativo"; 
        this.imagem = new Imagem(urlImagem, ehPrincipal);
    }

    public int getId() {
        return id;
    }

    public String getEmpresaCnpj() {
        return empresaCnpj;
    }
    
   protected void setEmpresaCnpj(String empresaCnpj) {
        this.empresaCnpj = empresaCnpj;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    protected void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    protected void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }
    
    protected void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }


    public String getStatus() {
        return status;
    }

    protected void setStatus(String status) {
        this.status = status;
    }

    public Imagem getImagem() {
        return imagem;
    }

    protected void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }
    
}