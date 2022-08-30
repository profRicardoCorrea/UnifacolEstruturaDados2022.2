package listasencadeadas.operacoes;

public abstract class ListaSimples<Lista, Informacao> {

	Lista proximo;

	public abstract Lista insert(Lista lista, Lista listaDepois, Lista novaLista);

	public abstract Lista add(Lista lista, Lista novaLista);

	public abstract Lista delete(Lista lista, Informacao informacao);

	public abstract Informacao info();

	public abstract Lista next();

}
