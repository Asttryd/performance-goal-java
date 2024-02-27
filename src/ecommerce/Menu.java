package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.EcommerceController;
import ecommerce.models.users.Cliente;
import ecommerce.models.users.Vendedor;
import ecommerce.models.produtos.AlimentosNaoPereciveis;
import ecommerce.models.produtos.AlimentosPereciveis;
import ecommerce.models.produtos.Rotineiros;


public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao, id, funcao, tipo = 0, senha = 0;
		String nomeUsuario = "", nomeProduto = "", descricao = "", ambienteDeUso = "", segmento;
		float preco;
		boolean refrigeracao;
		
		EcommerceController users = new EcommerceController();
		EcommerceController produtos = new EcommerceController();
		
		
//		Cliente user1 = new Cliente(users.gerarNumero(), "Asttryd Santos Pacheco", 123, 1);
//		users.criarConta(user1);
//		Vendedor user2 = new Vendedor(users.gerarNumero(), "Tatiana Santos Pacheco", 456, "HortiFrutti", 2);
//		users.criarConta(user2);
		
		
		AlimentosNaoPereciveis product1 = new AlimentosNaoPereciveis(produtos.gerarNumero(), "Feijão", 7.0f, 1, "1kg de feijão Camil", false);
		produtos.criarProduto(product1);
		AlimentosPereciveis product2 = new AlimentosPereciveis(produtos.gerarNumero(), "Chocolate Lindt", 120.0f, 2, "Um chocolate delicioso vindo da suíça", true);
		produtos.criarProduto(product2);
		Rotineiros product3 = new Rotineiros(produtos.gerarNumero(), "Toalha de Banho", 20.0f, 3, "Uma toalha branca super fofinha para seu corpo", "Banheiro");
		produtos.criarProduto(product3);
		
		produtos.listarProdutos();
		
		// Variáveis de entrada de dados
		while(true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                 SUPERMERCADOS LUA                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Ver todos os produtos                ");
			System.out.println("            2 - Criar uma conta                      ");
			System.out.println("            3 - Atualizar uma conta                  ");
			System.out.println("            4 - Deletar uma conta                    ");
			System.out.println("            5 - Criar um novo produto                ");
			System.out.println("            6 - Atualizar um produto                 ");
			System.out.println("            7 - Deletar um produto                   ");
			System.out.println("            8 - Encerrar o programa                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 8) {
				System.out.println("\nOs supermercados Lua estarão sempre de braços abertos!");
				System.out.println("Encerrando...");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
				case 1:
					//MÉTODO LISTAR TODOS OS PRODUTOS
					System.out.println("Lista dos produtos cadastrados na plataforma\n\n");
					produtos.listarProdutos();
//					produtos.listarProdutos();
					System.out.println();
					
					keyPress();
					break;
					
				case 2:
//					//MÉTODO CRIAR CONTA
//					System.out.println("Criar Conta\n\n");
//					System.out.println("Digite o nome do usuário: ");
//					leia.skip("\\R?");
//					nomeUsuario = leia.nextLine();
//				
//					while(true) {
//					
//						try {
//							System.out.println("\nDigite a sua senha (apenas números): ");
//							senha = leia.nextInt();
//							break;
//						} catch (InputMismatchException e) {
//							System.out.println("Senha inválida! Use somente números inteiros, por favor.");
//							leia.nextLine();
//							opcao = 0;
//						}
//					}
//					
//					System.out.println("Escolha o tipo de conta que deseja criar ( 1- Cliente | 2- Vendedor ): ");
//					leia.skip("\\R?");
//					funcao = leia.nextInt();
//					
//					while(funcao != 1 && funcao != 2) {
//						System.out.println("Número inválido, tente novamente!");
//					}
//					if (funcao == 1) {
//						users.criarConta(new Cliente(users.gerarNumero(), nomeUsuario, senha, funcao));
//						
//						keyPress();
//						break;
//					} else if (funcao == 2) {
//						System.out.println("Favor, digite o segmento: ");
//						segmento = leia.nextLine();
//						users.criarConta(new Vendedor(users.gerarNumero(), nomeUsuario, senha, segmento, funcao));
//						
//						keyPress();
//						break;
//					}
				
				case 3:
//					//MÉTODO ATUALIZAR CONTA
//					System.out.println("Atualizar dados da Conta\n\n");
//
//					System.out.println("Digite o número da conta: ");
//					id = leia.nextInt();
//
//					var buscarPerfil = users.buscarNaCollectionUser(id);
//
//					if (buscarPerfil != null) {
//
//						System.out.println("Digite o novo nome de usuário: ");
//						leia.skip("\\R?");
//						nomeUsuario = leia.nextLine();
//						System.out.println("Digite a nova senha: ");
//						senha = leia.nextInt();
//						
//						System.out.println("Digite o tipo da conta: ");
//						funcao = buscarPerfil.getFuncao();
//						
//						switch (funcao) {
//							case 1 -> {
//								users.atualizarPerfil(new Cliente(id, nomeUsuario, senha, funcao));
//								break;
//							
//							}
//							
//							case 2 -> {
//								System.out.println("Favor, digite o segmento: ");
//								segmento = leia.nextLine();
//								users.atualizarPerfil(new Vendedor(id, nomeUsuario, senha, segmento, funcao));
//								break;
//							
//							}
//						}
//						
//					} else
//						System.out.println("\nConta não encontrada!");
//
//					keyPress();
//					break;
//					
				case 4:
//					//MÉTODO DELETAR CONTA
//					System.out.println("Digite o id da conta: ");
//					id = leia.nextInt();
//
//					users.deletarPerfil(id);
//
//					keyPress();
//					break;
					
				case 5:
					//MÉTODO CRIAR PRODUTO

					System.out.println("Digite o nome do produto: ");
					leia.skip("\\R?");
					nomeProduto = leia.nextLine();
					
					System.out.println("Digite o preço do produto (00,0): ");
					preco = leia.nextFloat();
					
					System.out.println("Digite uma breve descrição do produto: ");
					leia.skip("\\R?");
					descricao = leia.nextLine();

					System.out.println("Digite o Tipo do produto (1- Alimento não Perecível | 2 - Alimento Perecível | 3 - Rotineiro): ");
					tipo = leia.nextInt();
					
					if (tipo != 1 && tipo != 2 && tipo != 3) {
						System.out.println("Tipo Inválido, tente novamente.");
					} else if (tipo == 1) {
						produtos.criarProduto(new AlimentosNaoPereciveis(produtos.gerarNumero(), nomeProduto, preco, tipo, descricao, false));
						
						keyPress();
						break;
						
					} else if (tipo == 2) {
						System.out.println("O alimento precisa de refrigeração? (true ou false) ");
						refrigeracao = leia.nextBoolean();
						produtos.criarProduto(new AlimentosPereciveis(produtos.gerarNumero(), nomeProduto, preco, tipo, descricao, refrigeracao));
						
						keyPress();
						break;
						
					} else {
						System.out.println("Digite em qual ambiente o produto pode ser utilizado: ");
						leia.skip("\\R?");
						ambienteDeUso = leia.nextLine();
						produtos.criarProduto(new Rotineiros(produtos.gerarNumero(), nomeProduto, preco, tipo, descricao, ambienteDeUso));
						
						keyPress();
						break;
					}

					System.out.println("Produto criado!");
					
				case 6:
					//MÉTODO ATUALIZAR UM PRODUTO
					System.out.println("Atualizar dados de um produto\n\n");

					System.out.println("Digite o Id do produto: ");
					id = leia.nextInt();

					var buscarProduto = users.buscarNaCollectionProduto(id);

					if (buscarProduto != null) {

						System.out.println("Digite o novo nome do produto: ");
						leia.skip("\\R?");
						nomeProduto = leia.nextLine();
						System.out.println("Digite o novo preço (00,0): ");
						preco = leia.nextFloat();
						
						System.out.println("Digite o tipo de produto: ");
						funcao = buscarProduto.getTipo();
						
						switch (funcao) {
							case 1 -> {
								produtos.atualizarProduto(new AlimentosNaoPereciveis(id, nomeProduto, preco, tipo, descricao, false));
							
							}
							
							case 2 -> {
								System.out.println("O alimento precisa de refrigeração? (true ou false) ");
								refrigeracao = leia.nextBoolean();
								produtos.atualizarProduto(new AlimentosPereciveis(id, nomeProduto, preco, tipo, descricao, refrigeracao));
							
							}
							
							case 3 -> {
								System.out.println("Favor, digite em qual ambiente o produto pode ser usado: ");
								ambienteDeUso = leia.nextLine();
								produtos.atualizarProduto(new Rotineiros(id, nomeProduto, preco, tipo, descricao, ambienteDeUso));
							
							}
						}
						
					} else
						System.out.println("\nConta não encontrada!");

					keyPress();
					break;
					
				case 7:
					//MÉTODO DELETAR UM PRODUTO
					System.out.println("Digite o id do produto: ");
					id = leia.nextInt();

					produtos.deletarProduto(id);

					keyPress();
					break;
					
				default:
					System.out.println("\nOpção Inválida!");
					keyPress();
					break;
			}
		}

	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Asttryd S. Pacheco");
		System.out.println("github.com/Asttryd");
		System.out.println("*********************************************************");
	}
	
	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
