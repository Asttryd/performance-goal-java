package ecommerce.repository.users;

import ecommerce.models.users.User;

public interface EcommerceUsers {
	//CRUD do usuário
	public void criarConta(User usuario);
//	public void fazerLogin(User usuario);
//	public void atualizarPerfil(String nomeUsuario);
	public void deletarPerfil(User usuario);
	
	//CRUD de Produto para usuários
	public void listarProdutos();

	
}
