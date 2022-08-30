
package estruturaencadeada.simples;

public class CarroServico {// implements IEstrutura {
	public  EstruturaSimples<Carro> inicio = null;

	// @Override
	public EstruturaSimples<Carro> add(EstruturaSimples<Carro> referencia,  Carro novaCarro) {

		if (referencia == null) {
			EstruturaSimples<Carro> novaEstrutura=new EstruturaSimples<Carro>();
			System.out.println(">>>null");
			novaEstrutura.informacao=novaCarro;
			return novaEstrutura;
		}
		else if (referencia != null && referencia.proximo == null) {
			referencia.proximo = add(referencia.proximo, novaCarro);
			return referencia;
		}

		else if (referencia != null && referencia.proximo != null) {
			referencia.proximo.proximo = add(referencia.proximo.proximo, novaCarro);
			return referencia;
		} else
			return referencia;

	}

	public void imprimirFilho(EstruturaSimples<Carro> referencia) {
		if (referencia != null && referencia.proximo != null) {
			System.out.println("PAI:" + referencia.informacao.modelo + " FILHO:" + referencia.proximo.informacao.modelo);
			imprimirFilho(referencia.proximo);
		}

	}
	public void imprimirPai(EstruturaSimples<Carro> referencia) {
		if (referencia != null ) {
			System.out.println("PAI:" + referencia.informacao.modelo );
			imprimirPai(referencia.proximo);
		}

	}

	// @Override
	public EstruturaSimples<Carro> buscar(EstruturaSimples<Carro> estrutura, String nomePai) {
		if (estrutura != null && estrutura.proximo != null) {
			System.out
					.println("##### PAI:" + estrutura.informacao.modelo + " FILHO:" + estrutura.proximo.informacao.modelo);
			if (estrutura.informacao.modelo.equals(nomePai) )
				return estrutura.proximo;

			else
				return buscar(estrutura.proximo, nomePai);

		}
		return null;
	}

	// @Override
	public EstruturaSimples<Carro> remover(EstruturaSimples<Carro> estrutura, String nome) {
		if (estrutura != null) {
			if (estrutura.informacao.modelo.equals(nome)) {
				EstruturaSimples<Carro> tmp = estrutura.proximo;
				estrutura = null;
				return tmp;
			} else
				estrutura.proximo = remover(estrutura.proximo, nome);
		}
		return estrutura;

	}

	// @Override
	public void alterar(EstruturaSimples<Carro> estrutura, String nome, Carro altCarro) {
		if (estrutura != null && estrutura.proximo != null) {

			if (estrutura.informacao.modelo.equals(nome)) {

				if (altCarro != null) {
					if (altCarro.modelo != null)
						estrutura.informacao.modelo = altCarro.modelo;
					 

				}
				 
 

			}
			buscar(estrutura.proximo, nome);

		}

	}

}
