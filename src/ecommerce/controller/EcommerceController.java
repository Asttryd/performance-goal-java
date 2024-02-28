package ecommerce.controller;

import java.util.ArrayList;
import java.util.Scanner;

import ecommerce.models.produtos.Produtos;
import ecommerce.models.users.User;
import ecommerce.repository.produtos.EcommerceProdutos;
import ecommerce.repository.users.EcommerceUsers;

public class EcommerceController implements EcommerceProdutos, EcommerceUsers {

	
	Scanner leia = new Scanner(System.in);
	
	private ArrayList<User> listaUsers = new ArrayList<User>();
	private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
	int numero = 0;
	
	@Override
	public void criarProduto(Produtos produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto " + produto.getNome() + " foi criado com sucesso!");
	}


	@Override
	public void listarProdutos() {
		if (listaProdutos.isEmpty()) {
	        System.out.println("Nenhum produto cadastrado.");
	    } else {
	        for (var produto : listaProdutos) {
	            produto.visualizar();
	        }
	    }
		
	}


	@Override
	public void atualizarProduto(Produtos produto) {
		var buscaProduto = buscarNaCollectionProduto(produto.getId());
		
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto de Id: " + produto.getId() + " foi atualizads com sucesso!");
		} else {
			System.out.println("\nO produto de Id: " + produto.getId() + " não foi encontrado!");			
		}
		
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

	
	@Override
	public void criarConta(User usuario) {
		listaUsers.add(usuario);
		System.out.println("\nSeja bem-vindo(a/e) " + usuario.getNomeUsuario() + "!");
		
	}

	@Override
	public void atualizarPerfil(User usuario) {
		var buscarPerfil = buscarNaCollectionUser(usuario.getId());
		
		if (buscarPerfil != null) {
			listaUsers.set(listaUsers.indexOf(buscarPerfil), usuario);
			System.out.println("\nA Conta: " + usuario.getId() + " foi atualizada com sucesso!");
		} else
			System.out.println("\nA Conta: " + usuario.getId() + " não foi encontrada!");
	}
	
	@Override
	public void deletarPerfil(int id) {
		var perfil = buscarNaCollectionUser(id);
		
		if (perfil != null) {
			if(listaUsers.remove(perfil) == true)
				System.out.println("\nA Conta numero: " + id + " foi deletada com sucesso!");
		}else
			System.out.println("\nA Conta numero: " + id + " não foi encontrada!");
	}
	
	
	@Override
	public void listarPerfis() {
		if (listaUsers.isEmpty()) {
	        System.out.println("Nenhum usuário cadastrado.");
	    } else {
	        for (var usuario : listaUsers) {
	            usuario.visualizar();
	        }
	    }
		
	}


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
