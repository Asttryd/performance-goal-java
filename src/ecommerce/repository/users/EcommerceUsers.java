package ecommerce.repository.users;


public interface EcommerceUsers {
	//CRUD do usuário
	public void criarConta();
	public void fazerLogin();
	public void atualizarPerfil();
	public void deletarPerfil();
	public void sair();
	
	public void listarProdutos();

	
}
