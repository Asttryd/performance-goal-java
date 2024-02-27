package ecommerce.models.users;

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
	public void criarProduto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarProdutos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarProduto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarProduto() {
		// TODO Auto-generated method stub
		
	}


}
