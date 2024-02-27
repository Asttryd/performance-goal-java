package ecommerce.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.models.produtos.Produtos;
import ecommerce.models.users.User;
import ecommerce.repository.produtos.EcommerceProdutos;
import ecommerce.repository.users.EcommerceUsers;

public class EcommerceController implements EcommerceProdutos, EcommerceUsers {

	
	Scanner leia = new Scanner(System.in);
	int numero = 0;
	
	@Override
	public void criarProduto(Produtos produto) {
		System.out.println("\nO produto " + produto.getNome() + " foi criado com sucesso!");
	}

	@Override
	public void listarProdutos() {
		
		
	}

	//A IMPLEMENTAR NA TASK3
//	@Override
//	public void atualizarProduto(Produtos produto) {
//		
//		
//	}

	@Override
	public void deletarProduto() {
		
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}

	@Override
	public void criarConta(User usuario) {
		System.out.println("\nSeja bem-vindo(a/e) " + usuario.getNomeUsuario() + "!");
		
	}

	
	@Override
	public void deletarPerfil(User usuario) {
		System.out.println("Digite o Id da conta que deseja deletar: ");
		var buscaPerfil = usuario.getNomeUsuario();
		
		if (buscaPerfil != null) {
			System.out.println("\nO perfil " + usuario.getNomeUsuario() + " foi deletado com sucesso");
		} else {
			System.out.println("\nPerfil não encontrado.");
		}
		
	}
	
	//A IMPLEMENTAR NA TASK3
//	@Override
//	public void atualizarPerfil(String nomeUsuario) {
//		
//		if (nomeUsuario != null) {
//
//			System.out.println("\nA Conta: " + nomeUsuario + " foi atualizada com sucesso!");
//		} else {
//			System.out.println("\nA Conta: " + nomeUsuario + " não foi encontrada!");
//		}
//	}

	@Override
	public void listarProdutos(Produtos produto) {
		// TODO Auto-generated method stub
		
	}

	//A IMPLEMENTAR NA TASK3
//	public User buscarNaCollection(String nomeUsuario) {
//		int buscarPerfilId	= usuario.getId();
//		
//		if ( buscarPerfilId == id) {
//				return buscarPerfilId;
//			}
//		}
//		
//		return null;
//	}


}
