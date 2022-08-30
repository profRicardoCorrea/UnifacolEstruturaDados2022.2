package listasencadeadas;

import listasencadeadas.operacoes.ListaSimples;

public interface IListaSimples<Entidade> {
	public ListaSimples<Entidade> insert(ListaSimples<Entidade> lista,ListaSimples<Entidade> listaDepois,ListaSimples<Entidade> novaLista);
	public ListaSimples<Entidade> add(ListaSimples<Entidade> lista, ListaSimples<Entidade> novaLista);
	public ListaSimples<Entidade> delete(ListaSimples<Entidade> lista,  Entidade entidade) ;
	public Entidade info(ListaSimples<Entidade> lista) ;
	public ListaSimples<Entidade> next(ListaSimples<Entidade> lista) ;

}
