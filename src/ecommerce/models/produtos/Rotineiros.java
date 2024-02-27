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
}
