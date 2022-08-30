package listasencadeadas.operacoes;

public class ListaSimplesPessoa extends ListaSimples<ListaSimplesPessoa,Pessoa> {
	Pessoa informacao;
	@Override
	public ListaSimplesPessoa insert(ListaSimplesPessoa lista,ListaSimplesPessoa listaDepois, ListaSimplesPessoa novaLista) {
		if (listaDepois == null) {
			System.out.println("if");
			lista=novaLista;
			 

		} else if (lista == listaDepois) {
			System.out.println("else if");
			novaLista.proximo = lista.proximo;
			lista.proximo = novaLista;
			 
		} else {
			System.out.println("else");
			lista.proximo=insert(lista.proximo, listaDepois, novaLista);
		}
		return lista;

	}

	@Override
	public ListaSimplesPessoa add(ListaSimplesPessoa lista, ListaSimplesPessoa novaLista) {
		if (lista == null) {
			return novaLista;
		} else {
			lista.proximo=add(lista.proximo, novaLista);
			return lista;
		}
	}

	@Override
	public ListaSimplesPessoa delete(ListaSimplesPessoa lista, Pessoa entidade) {
		if (lista.informacao != entidade) {
			 lista.proximo = delete(lista.proximo,  entidade);
			 return lista;
		} else {
			return lista.proximo;
		}

	}

	@Override
	public Pessoa info() {		 
		return  this.informacao;
	}

	@Override
	public ListaSimplesPessoa next() {
		 
		return this.proximo;
	}
}
