package ecommerce.models.users;

public class Cliente extends User{

	public Cliente(int id, String nomeUsuario, int senha, int funcao) {
		super(id, nomeUsuario, senha, 1);
		
	}

}
