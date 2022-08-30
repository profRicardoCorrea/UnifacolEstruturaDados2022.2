package listasencadeadas.operacoes;

public abstract class ListaDuplamente<Lista, Informacao> {
	Lista proximo;
	Lista anterior;

	public abstract Lista insert(Lista lista,  Informacao informacaoDepois, Lista novaLista);

	public abstract Lista add(Lista lista, Lista novaLista);

	public abstract Lista delete(Lista lista, Informacao informacao);

	public abstract Informacao info();

	public abstract Lista next();
	
	public abstract Lista last();
}
