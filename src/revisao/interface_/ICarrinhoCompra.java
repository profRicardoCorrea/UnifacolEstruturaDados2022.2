package revisao.interface_;

import java.util.ArrayList;

import revisao.dominio.CarrinhoCompra;

public interface ICarrinhoCompra {
	public void cadastrar(CarrinhoCompra carrinhoCompra);
	public boolean alterarQuantidadeItem(int codigoCarrinho,int codigoProduto, int quantidade );	 
	public void adicionarProduto(int condigoProduto, int quantidade);
	public  CarrinhoCompra listar(int codigo);	 
	public boolean limpar(int codigo);
	

}
