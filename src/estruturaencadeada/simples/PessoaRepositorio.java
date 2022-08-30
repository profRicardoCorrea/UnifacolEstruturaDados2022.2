
package estruturaencadeada.simples;

public class PessoaRepositorio {// implements IEstrutura {
	public  EstruturaSimples<Pessoa> inicio = null;

	// @Override
	public EstruturaSimples<Pessoa> add(EstruturaSimples<Pessoa> referencia,  Pessoa novaPessoa) {

		if (referencia == null) {
			EstruturaSimples<Pessoa> novaEstrutura=new EstruturaSimples<Pessoa>();
			System.out.println(">>>null");
			novaEstrutura.informacao=novaPessoa;
			return novaEstrutura;
		}
		else if (referencia != null && referencia.proximo == null) {
			referencia.proximo = add(referencia.proximo, novaPessoa);
			return referencia;
		}

		else if (referencia != null && referencia.proximo != null) {
			referencia.proximo.proximo = add(referencia.proximo.proximo, novaPessoa);
			return referencia;
		} else
			return referencia;

	}

	public void imprimirFilho(EstruturaSimples<Pessoa> referencia) {
		if (referencia != null && referencia.proximo != null) {
			System.out.println("PAI:" + referencia.informacao.nome + " FILHO:" + referencia.proximo.informacao.nome);
			imprimirFilho(referencia.proximo);
		}

	}
	public void imprimirPai(EstruturaSimples<Pessoa> referencia) {
		if (referencia != null ) {
			System.out.println("PAI:" + referencia.informacao.nome );
			imprimirPai(referencia.proximo);
		}

	}

	// @Override
	public EstruturaSimples<Pessoa> buscar(EstruturaSimples<Pessoa> estrutura, String nomePai) {
		if (estrutura != null && estrutura.proximo != null) {
			System.out
					.println("##### PAI:" + estrutura.informacao.nome + " FILHO:" + estrutura.proximo.informacao.nome);
			if (estrutura.informacao.nome.equals(nomePai) )
				return estrutura.proximo;

			else
				return buscar(estrutura.proximo, nomePai);

		}
		return null;
	}

	// @Override
	public EstruturaSimples<Pessoa> remover(EstruturaSimples<Pessoa> estrutura, String nome) {
		if (estrutura != null) {
			if (estrutura.informacao.nome.equals(nome)) {
				EstruturaSimples<Pessoa> tmp = estrutura.proximo;
				estrutura = null;
				return tmp;
			} else
				estrutura.proximo = remover(estrutura.proximo, nome);
		}
		return estrutura;

	}

	// @Override
	public void alterar(EstruturaSimples<Pessoa> estrutura, String nome, Pessoa altPessoa) {
		if (estrutura != null && estrutura.proximo != null) {

			if (estrutura.informacao.nome.equals(nome)) {

				if (altPessoa != null) {
					if (altPessoa.nome != null)
						estrutura.informacao.nome = altPessoa.nome;
					if (altPessoa.idade > 0)
						estrutura.informacao.idade = altPessoa.idade;

				}
				 
 

			}
			buscar(estrutura.proximo, nome);

		}

	}

}
