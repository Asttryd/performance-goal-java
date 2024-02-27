package ecommerce.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.models.produtos.Produtos;
import ecommerce.models.users.User;
import ecommerce.repository.produtos.EcommerceProdutos;
import ecommerce.repository.users.EcommerceUsers;

public class EcommerceController implements EcommerceProdutos {

	
	Scanner leia = new Scanner(System.in);
	
	private ArrayList<User> listaUsers = new ArrayList<User>();
	private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
	int numero = 0;
	
	@Override
	public void criarProduto(Produtos produto) {
//		System.out.println("\nO produto " + produto.getNome() + " foi criado com sucesso!");
	}


	@Override
	public void listarProdutos() {
		for (var produto : listaProdutos) {
				produto.visualizar();
		}
		
	}


	@Override
	public void atualizarProduto(Produtos produto) {
		var buscarProduto = buscarNaCollectionUser(produto.getId());
		
		if (buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
			System.out.println("\nO produto: " + produto.getId() + " foi atualizada com sucesso!");
		} else
			System.out.println("\nO produto: " + produto.getId() + " não foi encontrada!");
	}

	@Override
	public void deletarProduto(int id) {
		var produto = buscarNaCollectionProduto(id);
		
		if (produto != null) {
			if(listaProdutos.remove(produto) == true)
				System.out.println("\nA Conta numero: " + id + " foi deletada com sucesso!");
		}else
			System.out.println("\nA Conta numero: " + id + " não foi encontrada!");
	}
	
	
	public int gerarNumero() {
		return ++ numero;
	}

	
//	@Override
//	public void criarConta(User usuario) {
////		System.out.println("\nSeja bem-vindo(a/e) " + usuario.getNomeUsuario() + "!");
//		
//	}
//
//	@Override
//	public void atualizarPerfil(User usuario) {
//		var buscarPerfil = buscarNaCollectionUser(usuario.getId());
//		
//		if (buscarPerfil != null) {
//			listaUsers.set(listaUsers.indexOf(buscarPerfil), usuario);
//			System.out.println("\nA Conta: " + usuario.getId() + " foi atualizada com sucesso!");
//		} else
//			System.out.println("\nA Conta: " + usuario.getId() + " não foi encontrada!");
//	}
//	
//	@Override
//	public void deletarPerfil(int id) {
//		var perfil = buscarNaCollectionUser(id);
//		
//		if (perfil != null) {
//			if(listaUsers.remove(perfil) == true)
//				System.out.println("\nA Conta numero: " + id + " foi deletada com sucesso!");
//		}else
//			System.out.println("\nA Conta numero: " + id + " não foi encontrada!");
//	}
	
	


	//A IMPLEMENTAR NA TASK3
	public User buscarNaCollectionUser(int id) {
		for (var perfil : listaUsers) {
			if (perfil.getId() == id) {
				return perfil;
			}
		}
	
		return null;
	}
	
	public Produtos buscarNaCollectionProduto(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
	
		return null;
	}









}
