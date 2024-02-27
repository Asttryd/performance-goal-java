package ecommerce.controller.user;

import ecommerce.repository.users.EcommerceUsers;

public class EcommerceControllerUser implements EcommerceUsers{

	int numero = 0;
	@Override
	public void criarConta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fazerLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPerfil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarPerfil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sair() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarProdutos() {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}

}
