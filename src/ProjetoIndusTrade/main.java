package ProjetoIndusTrade;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		System.out.println("IndusTrade");
		System.out.println("--------------------------");
		
		Scanner ler = new Scanner(System.in); 
		
		SistemaGeral sistema = new SistemaGeral();
		sistema.exibirMenuInicial();
		int opcao;	
		opcao = ler.nextInt();
		while (true) {		
			
			if(opcao == 1) {
				Empresa empresa;
				empresa = sistema.realizarLogin();
				if(empresa != null) {
					int opcaoSistema = 0;
					while(opcaoSistema != 2) {
						System.out.println("1 - Anunciar Produto");
						System.out.println("2 - Sair");
						opcaoSistema = ler.nextInt();
						
						if(opcaoSistema == 1) {
							System.out.println("Qual o tipo de Anuncio?");
							int opcaoAnuncio = 0;
							while(opcaoAnuncio != 3) {
								System.out.println("1 - Maquinário");
								System.out.println("2 - Recurso");
								System.out.println("3 - Cancelar");
								opcaoSistema = ler.nextInt();
								
								if(opcaoSistema == 1) {
									sistema.cadastrarAnuncioMaquinario();
								}else if(opcaoSistema == 2) {
									sistema.cadastrarAnuncioRecurso();
								}else if(opcaoSistema == 3) {
									opcaoSistema = 0;
								}else {
									System.out.println("Opção inválida!");
								}
							}
						}else if(opcaoSistema == 2) {
							System.out.println("Encerrando Sistema!");
							break;
						}else {
							System.out.println("Opção inválida!");
						}
						
					}
				}
			}else if(opcao == 2) {
				sistema.cadastrarEmpresa();
				sistema.exibirMenuInicial();
				opcao = ler.nextInt();
			}
		}
	}
}
