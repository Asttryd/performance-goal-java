package ecommerce.models.produtos;

public class Rotineiros extends Produtos{

	private String ambienteDeUso;
	public Rotineiros(int id, String nome, float preco, int tipo, String descricao, String ambienteDeUso) {
		super(id, nome, preco, 3, descricao);
		this.ambienteDeUso = ambienteDeUso;
	}
	public String getAmbienteDeUso() {
		return ambienteDeUso;
	}
	public void setAmbienteDeUso(String ambienteDeUso) {
		this.ambienteDeUso = ambienteDeUso;
	}
	
	@Override
	public void visualizar() {
		System.out.println("Estou listando produtos!");
//		String tipoProduto = "";
//		
//		switch(this.tipo) {
//		case 1:
//			tipoProduto = "Alimento não Perecível";
//			break;
//		case 2:
//			tipoProduto = "Alimento Perecível";
//			break;
//		case 3:
//			tipoProduto = "Rotineiro";
//			break;
//		}
		
		System.out.println("******************************************************");
		System.out.println("Dados do Produto: ");
		System.out.println("******************************************************");
		System.out.println("Id do produto: " + super.getId());
		System.out.println("Nome do produto: " + super.getNome());
		System.out.println("Tipo do produto: " + super.getTipo());
		System.out.println("Preço: " + "R$" + super.getPreco());
		System.out.println("Descrição do produto: " + super.getDescricao());
	}
}
