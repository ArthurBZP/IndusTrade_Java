package ProjetoIndusTrade;

class Endereco {
    private static int proximoId = 1;
	
	private int id;
    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(String cep, String logradouro, String numero, String bairro, String cidade, String uf) {
        this.id = proximoId++;
    	
    	this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public int getId() { return id; }
}