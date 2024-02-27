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
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getFuncao() {
		return funcao;
	}
	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}
	
}
