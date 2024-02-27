package ecommerce.models.produtos;

public abstract class Produtos {
	private int id;
	private String nome;
	private float preco;
	private int tipo;
	private String descricao;
	
	public Produtos(int id, String nome, float preco, int tipo, String descricao) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
