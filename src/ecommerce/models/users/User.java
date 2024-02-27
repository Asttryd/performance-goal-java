package ecommerce.models.users;

public abstract class User {
	private int id;
	private String nomeUsuario;
	private int senha;
	private int funcao;
	public User(int id, String nomeUsuario, int senha, int funcao) {
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.setFuncao(funcao);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getSenha() {
		return senha;
	}
	public int setSenha(int senha) {
		return this.senha = senha;
	}
	public int getFuncao() {
		return funcao;
	}
	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}
	
	public void visualizar() {
		String tipoConta = "";
		
		switch(this.funcao) {
		case 1:
			tipoConta = "Cliente";
			break;
		case 2:
			tipoConta = "Vendedor";
			break;
		}
		
		System.out.println("******************************************************");
		System.out.println("Dados da Conta: ");
		System.out.println("******************************************************");
		System.out.println("Id da conta: " + this.id);
		System.out.println("Nome do usuário: " + this.nomeUsuario);
		System.out.println("Tipo da conta: " + tipoConta);
		System.out.println("Senha: " + this.senha);
	}
	
}
