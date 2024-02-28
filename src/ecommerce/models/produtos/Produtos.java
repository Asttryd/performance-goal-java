package ecommerce.models.produtos;

public abstract class Produtos {
	private int id;
	private String nomeProduto;
	private float preco;
	private int tipo;
	private String descricao;
	
	public Produtos(int id, String nomeProduto, float preco, int tipo, String descricao) {
		this.id = id;
		this.nomeProduto = nomeProduto;
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
		return nomeProduto;
	}

	public void setNome(String nome) {
		this.nomeProduto = nome;
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
	
	public void visualizar() {
		String tipoProduto = "";
		
		switch(this.tipo) {
		case 1:
			tipoProduto = "Alimento não Perecível";
			break;
		case 2:
			tipoProduto = "Alimento Perecível";
			break;
		case 3:
			tipoProduto = "Rotineiro";
			break;
		}
		
		System.out.println("******************************************************");
		System.out.println("Dados do Produto: ");
		System.out.println("******************************************************");
		System.out.println("Id do produto: " + this.id);
		System.out.println("Nome do produto: " + this.nomeProduto);
		System.out.println("Tipo do produto: " + tipoProduto);
		System.out.println("Preço: " + "R$" + this.preco);
		System.out.println("Descrição do produto: " + this.descricao + "\n\n");
	}
}
