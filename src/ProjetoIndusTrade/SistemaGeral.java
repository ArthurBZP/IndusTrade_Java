package ProjetoIndusTrade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class SistemaGeral {
	private Scanner ler; 
	private ArrayList<AnuncioMaquinario> listaAnuncioMaquinario;
	private ArrayList<AnuncioRecurso> listaAnuncioRecurso;
	private ArrayList<Empresa> listaEmpresas;
	private ArrayList<Endereco> listaEnderecos;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	public SistemaGeral() {
		listaAnuncioMaquinario = new ArrayList<AnuncioMaquinario>();
		listaAnuncioRecurso = new ArrayList<AnuncioRecurso>();
		listaEmpresas = new ArrayList<Empresa>();
		listaEnderecos = new ArrayList<Endereco>();
		ler = new Scanner(System.in);
	}
	
	public void exibirMenuInicial() {
		System.out.println("1 - Login de Empresa");
		System.out.println("2 - Cadastrar sua Empresa");
		System.out.println("Informe uma opção:");
	}
	
public void cadastrarEmpresa() {
		
		System.out.println("Sistema de Cadastro de Usuario");
		System.out.println("Informe o CNPJ:");
		String cnpj = ler.next();
		System.out.println("Informe a Razão Social da Empresa:");
		String razaoSocial = ler.next();
		System.out.println("Informe a Senha:");
		String senha = ler.next();
		System.out.println("Informe o E-Mail:");
		String email = ler.next();
		System.out.println("Informe o Telefone da Empresa:");
		String telefone = ler.next();
		System.out.println("-------------------------------");
		System.out.println("Informe o CEP da Empresa:");
		String cep = ler.next();
		System.out.println("Logradouro:");
		String logradouro = ler.next();
		System.out.println("Número:");
		String numero = ler.next();
		System.out.println("Bairro:");
		String bairro = ler.next();
		System.out.println("Cidade:");
		String cidade = ler.next();
		System.out.println("UF:");
		String uf = ler.next();
		
		Empresa empresa = new Empresa(cnpj, senha, razaoSocial, email, telefone, 
                cep, logradouro, numero, bairro, cidade, uf);
		this.listaEmpresas.add(empresa);
		System.out.println("Usuário cadastrado com sucesso!");
	}

	public Empresa realizarLogin() {
		System.out.println("CNPJ:");
		int cnpj = ler.nextInt();
		System.out.println("Senha:");
		String senha = ler.next();
		
		Empresa empresa = this.listaEmpresas.get(cnpj-1);
		if(empresa != null) {
			if(empresa.getSenha().equals(senha)) {
				System.out.println("Login realizado com sucesso!");
				return empresa;
			}else {
				System.out.println("Usuario ou senha incorretos!");
				return null;
			}
		}else {
			System.out.println("Usuario ou senha incorretos!");
			return null;
		}
	}
		public void cadastrarAnuncioMaquinario() {
			
			System.out.println("Informe o CNPJ da Empresa:");
	        String empresaCnpj = ler.next();

	        System.out.println("Informe o Título do Produto:");
	        String titulo = ler.next();

	        System.out.println("Informe a Descrição do Produto:");
	        String descricao = ler.next();

	        System.out.println("Informe o Valor do Produto:");
	        double valor = ler.nextDouble();

	        System.out.println("Informe a Data de Cadastro (dd-MM-yyyy):");
	        String dataInput = ler.next();
	        LocalDate data = LocalDate.parse(dataInput, formatter);

	        System.out.println("Informe a URL da Imagem:");
	        String urlImagem = ler.next();

	        System.out.println("É a Imagem Principal?");
	        boolean principal = ler.nextBoolean();

	        System.out.println("Informe o Nome do Produto:");
	        String nome = ler.next();

	        System.out.println("Informe o Estado de Conservação:");
	        String estadoConservacao = ler.next();

	        System.out.println("Informe a Marca do Produto:");
	        String marca = ler.next();

	        System.out.println("Informe o Modelo do Produto:");
	        String modelo = ler.next();

	        System.out.println("Informe o Ano de Fabricação:");
	        int anoFabricacao = ler.nextInt();

	        System.out.println("Informe o Peso do Produto:");
	        double peso = ler.nextDouble();

	        System.out.println("Informe a Dimensão do Produto:");
	        String dimensao = ler.next();

	        System.out.println("Informe a Voltagem do Produto:");
	        String voltagem = ler.next();

	        System.out.println("Informe o Tipo de Categoria:");
	        String tipoCategoria = ler.next();
			
			AnuncioMaquinario anuncio = new AnuncioMaquinario(empresaCnpj, titulo, descricao, valor,
					data, urlImagem, principal, nome, estadoConservacao,
					marca, modelo, anoFabricacao, peso, dimensao, voltagem,
					tipoCategoria);
			this.listaAnuncioMaquinario.add(anuncio);
			System.out.println("Usuário cadastrado com sucesso!");
		}
		
public void cadastrarAnuncioRecurso() {
			
	System.out.println("Informe o ID:");
    int id = ler.nextInt();

    System.out.println("Informe o CNPJ da Empresa:");
    String empresaCnpj = ler.next();

    System.out.println("Informe o Título:");
    String titulo = ler.next();

    System.out.println("Informe a Descrição:");
    String descricao = ler.next();

    System.out.println("Informe o Valor:");
    double valor = ler.nextDouble();

    System.out.println("Informe a Data (dd/MM/yyyy):");
    String dataInput = ler.next();
    LocalDate data = LocalDate.parse(dataInput, formatter);

    System.out.println("Informe a URL da Imagem Principal:");
    String urlImagemPrincipal = ler.next();

    System.out.println("Informe o Nome:");
    String nome = ler.next();

    System.out.println("Informe o Tipo de Material:");
    String tipoMaterial = ler.next();

    System.out.println("Informe a Quantidade:");
    double quantidade = ler.nextDouble();

    System.out.println("Informe a Unidade de Medida:");
    String unidadeMedida = ler.next();

    System.out.println("Informe o Peso:");
    double peso = ler.nextDouble();

    System.out.println("Informe a Categoria (Ferro ou Aço)");
    String tipoCategoria = ler.next();
			
			AnuncioRecurso anuncio = new AnuncioRecurso(id, empresaCnpj, titulo, descricao, valor, 
					data, urlImagemPrincipal, nome, tipoMaterial, quantidade, unidadeMedida, 
					peso, tipoCategoria);
			this.listaAnuncioRecurso.add(anuncio);
			System.out.println("Usuário cadastrado com sucesso!");
		}
}

