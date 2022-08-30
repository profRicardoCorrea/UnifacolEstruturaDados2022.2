package revisao.servico;

import java.util.ArrayList;

import revisao.dominio.Pedido;
import revisao.interface_.IPedido;
import revisao.interface_.IPedidoCliente;

public class PedidoServico implements IPedido, IPedidoCliente {

	@Override
	public void cadastrar(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean confirmar(int codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterarQuantidadeItem(int codigoPedido, int codigoProduto, int quantidade) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Pedido> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido listarPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido listarPorCodigoProduto(int codigoProduto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelar(int codigo) {
		// TODO Auto-generated method stub
		return false;
	}

}
