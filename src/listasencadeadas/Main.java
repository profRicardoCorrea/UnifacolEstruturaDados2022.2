package listasencadeadas;

public class Main {
	public static void main(String[] args) {
		ListaSimples ls=new ListaSimples();
		
		Pessoa p=new Pessoa();
		p.nome="Fulano";
		ls.informacao=p;
		
		ListaSimples ls1=new ListaSimples();
		Pessoa p1=new Pessoa();
		p1.nome="Ciclano";
		ls1.informacao=p1;
		ls.proximo=ls1;

		System.out.println(ls.informacao.nome);
		System.out.println(ls.proximo.informacao.nome);
		
		}
}
