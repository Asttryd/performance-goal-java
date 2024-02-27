package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Variáveis de entrada de dados
		int opcao, id, funcao, tipo, senha = 0;
		String nomeUsuario = "", descricao, segmento;
		float preco;
		boolean refrigeracao;
		
		while(true) {
			System.out.println("                                                     ");
			System.out.println("                 SUPERMERCADOS LUA                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Ver Produtos                         ");
			System.out.println("            2 - Criar sua conta                      ");
			System.out.println("            3 - Entrar na conta                      ");
			System.out.println("            4 - Encerrar programa                    ");
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

			if (opcao == 4) {
				System.out.println("\nOs supermercados Lua estarão sempre de braços abertos!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Produtos: ");
				System.out.println("\nNome: Chocolate Lindt");
				System.out.println("Preco: R$ 100.00");
				System.out.println("Tipo: Alimento Perecivel");
				System.out.println("Descricao: Um chocolate delicioso vindo da suíça");
				keyPress();
				break;
			case 2:
				//Criar conta
				System.out.println("Digite o nome do usuário: ");
				leia.skip("\\R?");
				nomeUsuario = leia.nextLine();
				
				while(true) {
					
					try {
						System.out.println("\nDigite a sua senha (apenas números): ");
						senha = leia.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("Senha inválida! Use somente números inteiros, por favor.");
						leia.nextLine();
						opcao = 0;
					}
				}
				
				while(true) {
					System.out.println("Escolha o tipo de conta que deseja criar ( 1- Cliente | 2- Vendedor ): ");
					funcao = leia.nextInt();
					
					if (funcao == 1) {
						System.out.println("Seja bem vindo(a/e) aos supermercados Lua, " + nomeUsuario + "!");
						break;
					} else if (funcao == 2) {
						System.out.println("Por favor, digite o seu segmento: ");
						segmento = leia.nextLine();
						System.out.println("Seja bem vindo(a/e) à nossa rede de vendas, " + nomeUsuario + "!");
						break;
					} else {
						System.out.println("\nNúmero inválido, favor, tente novamente.");
					}
				}
				break;
			case 3:
				System.out.println("Digite seu nome de usuário: ");
				
				while(true) {
					
					try {
						leia.skip("\\R?");
						String nomeLogin = leia.nextLine();
						
						while (true) {
							System.out.println("\nDigite a sua senha: ");
							int senhaLogin = leia.nextInt();
							if (senhaLogin != senha) {
								System.out.println("Senha Incorreta. Favor, tente novamente.");
							} else {
								System.out.println("Seja bem vindo(a/e) de volta, " + nomeUsuario + "!");
								break;
							}
						}
						break;
					} catch (InputMismatchException e) {
						System.out.println("Senha inválida! Use somente números inteiros, por favor.");
						leia.nextLine();
						opcao = 0;
					}
				break;
				}
				
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
