package revisao.interface_;

import java.util.ArrayList;

import revisao.dominio.Pedido;

public interface IPedidoCliente {
	public void cadastrar(Pedido pedido);	 
	public boolean confirmar(int codigo);	
}
	 
