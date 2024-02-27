package ecommerce.controller.produto;

import ecommerce.repository.produtos.EcommerceProdutos;

public class EcommerceControllerProduto implements EcommerceProdutos {

	int numero = 0;
	
	@Override
	public void criarProduto() {
		
		
	}

	@Override
	public void listarProdutos() {
		
		
	}

	@Override
	public void atualizarProduto() {
		
		
	}

	@Override
	public void deletarProduto() {
		
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}

}
