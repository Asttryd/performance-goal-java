package ecommerce.repository.users;
import ecommerce.models.users.User;

public interface EcommerceUsers {
	//CRUD do usuário
	public void criarConta(User usuario);
	public void listarPerfis();
	public void atualizarPerfil(User usuario);
	public void deletarPerfil(int id);
	
	//CRUD de Produto para usuários
	public void listarProdutos();

	
}
