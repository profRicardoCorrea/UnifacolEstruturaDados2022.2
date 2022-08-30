package listasencadeadas.operacoes;

public class ListaSimplesCarro extends ListaSimples<ListaSimplesCarro,Carro> {
	Carro informacao;
	@Override
	public ListaSimplesCarro insert(ListaSimplesCarro lista,ListaSimplesCarro listaDepois, ListaSimplesCarro novaLista) {
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
	public ListaSimplesCarro add(ListaSimplesCarro lista, ListaSimplesCarro novaLista) {
		if (lista == null) {
			return novaLista;
		} else {
			lista.proximo=add(lista.proximo, novaLista);
			return lista;
		}
	}

	@Override
	public ListaSimplesCarro delete(ListaSimplesCarro lista, Carro entidade) {
		if (lista.informacao != entidade) {
			 lista.proximo = delete(lista.proximo,  entidade);
			 return lista;
		} else {
			return lista.proximo;
		}

	}

	@Override
	public Carro info() {		 
		return  this.informacao;
	}

	@Override
	public ListaSimplesCarro next() {
		 
		return this.proximo;
	}
}
