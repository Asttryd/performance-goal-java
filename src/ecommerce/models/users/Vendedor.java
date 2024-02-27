package ecommerce.models.users;

import ecommerce.models.produtos.Produtos;
import ecommerce.repository.produtos.EcommerceProdutos;

public class Vendedor extends User implements EcommerceProdutos {

	private String segmento;
	
	public Vendedor(int id, String nomeUsuario, int senha, String segmento, int funcao) {
		super(id, nomeUsuario, senha, 2);
		this.setSegmento(segmento);
	}
	
	public String getSegmento() {
		return segmento;
	}
	
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	@Override
	public void criarProduto(Produtos produto) {
		System.out.println("\nO produto " + produto.getNome() + " foi adicionado!");
		
	}

	@Override
	public void atualizarProduto(Produtos produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarProduto(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarProdutos() {
		// TODO Auto-generated method stub
		
	}


}
