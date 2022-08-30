package estruturaencadeada.simples;

 

public interface IEstrutura<Entidade> {
	public EstruturaSimples<Entidade> add(EstruturaSimples<Entidade> referencia,  Entidade novaEntidade);
	public void imprimir(EstruturaSimples<Entidade> referencia);	
	public EstruturaSimples<Entidade> buscar(EstruturaSimples<Entidade> estrutura, long id);
	public void alterar(EstruturaSimples<Entidade> estrutura);
	public EstruturaSimples<Entidade> remover(EstruturaSimples<Entidade> estrutura, long id) ;
	

}
