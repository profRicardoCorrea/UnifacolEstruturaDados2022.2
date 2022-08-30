package arvorebinaria;
public abstract class ArvoreBinaria<Arvore,Entidade> {
	Entidade informacao;
	public Arvore noEsquerdo;
	public Arvore noDireito;
	public abstract Arvore insert(Arvore arvore,  Arvore arvoreNova);
	public abstract void imprimir(Arvore arvore);
}
