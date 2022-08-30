package listasencadeadas.operacoes;

public class ListaDuplamentePessoa extends ListaDuplamente<ListaDuplamentePessoa,Pessoa> {
	Pessoa informacao;
	@Override
	public ListaDuplamentePessoa insert(ListaDuplamentePessoa lista,Pessoa pessoaDepois, ListaDuplamentePessoa novaLista) {
		if (lista == null) {
			 
			lista=novaLista;
			 

		} else if (lista.informacao == pessoaDepois) {
			 
			novaLista.proximo = lista.proximo;
			novaLista.anterior = lista.proximo.anterior;
			
			lista.proximo.anterior=novaLista;
			lista.proximo = novaLista;
			 
		} else {
			System.out.println("else");
			lista.proximo=insert(lista.proximo, pessoaDepois, novaLista);
		}
		return lista;

	}

	@Override
	public ListaDuplamentePessoa add(ListaDuplamentePessoa lista, ListaDuplamentePessoa novaLista) {
		if (lista == null) {
			return novaLista;
		} else {
			novaLista.anterior=lista;
			lista.proximo=add(lista.proximo, novaLista);
			return lista;
		}
	}

	@Override
	public ListaDuplamentePessoa delete(ListaDuplamentePessoa lista, Pessoa entidade) {
		if (lista.informacao != entidade) {
			 lista.proximo = delete(lista.proximo,  entidade);
			 if(lista.proximo!=null)
				 lista.proximo.anterior=lista;
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
	public ListaDuplamentePessoa next() {
		 
		return this.proximo;
	}

	@Override
	public ListaDuplamentePessoa last() {
		// TODO Auto-generated method stub
		return this.anterior;
	}
}
