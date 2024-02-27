package ecommerce.models.produtos;

public class AlimentosNaoPereciveis extends Produtos{
	
	private boolean refrigeracao = false;
	public AlimentosNaoPereciveis(int id, String nome, float preco, int tipo, String descricao, boolean refrigeracao) {
		super(id, nome, preco, 1, descricao);
		this.refrigeracao = refrigeracao;
	}
	public boolean isRefrigeracao() {
		return refrigeracao;
	}
	public void setRefrigeracao(boolean refrigeracao) {
		this.refrigeracao = refrigeracao;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Precisa de refrigeração? " + this.refrigeracao);
	}

}
