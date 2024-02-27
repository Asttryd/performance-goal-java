package ecommerce.repository.produtos;

import ecommerce.models.produtos.Produtos;

public interface EcommerceProdutos {
	//CRUD produtos
	public void criarProduto(Produtos produto);
	public void listarProdutos(Produtos produto);
//	public void atualizarProduto(Produtos produto);
	public void deletarProduto();
}
