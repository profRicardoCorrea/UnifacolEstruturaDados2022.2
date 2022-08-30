package listasencadeadas.operacoes;

public class MainListaDuplamentePessoa {
	
	public static void imprimirFrente(ListaDuplamentePessoa lista) {
		System.out.println("----------------------------------------------------");
		while(lista!=null) {
			System.out.println("Nome:"+lista.informacao.nome);
			lista=lista.next();
		}
	}
	public static void imprimirTras(ListaDuplamentePessoa lista) {
		System.out.println("----------------------------------------------------");
		while(lista!=null) {
			System.out.println("Nome:"+lista.informacao.nome);
			lista=lista.last();
		}
	}
	public static ListaDuplamentePessoa pegarUltimo(ListaDuplamentePessoa lista) {
		 
		ListaDuplamentePessoa ultimo=null;
		while(lista!=null) {
			ultimo=lista;			 
			lista=lista.next();
		}
		return ultimo;
		
	}
	public static void main(String[] args) {
		ListaDuplamentePessoa lsp=new ListaDuplamentePessoa();
		lsp.informacao = new Pessoa("A","1");
		
		ListaDuplamentePessoa lsp1=new ListaDuplamentePessoa();
		lsp1.informacao = new Pessoa("B","2");
		
		ListaDuplamentePessoa lsp2=new ListaDuplamentePessoa();
		lsp2.informacao = new Pessoa("d","3");
		
		//ADD
		lsp.add(lsp, lsp1);
		lsp.add(lsp, lsp2);
		//NEXT
		imprimirFrente(lsp);
		ListaDuplamentePessoa lsp3=new ListaDuplamentePessoa();
		lsp3.informacao = new Pessoa("c","4");
		//INSERT
		lsp.insert(lsp, lsp1.informacao, lsp3);		
		imprimirFrente(lsp);
		//DELETE
		lsp.delete(lsp, lsp1.informacao);
		imprimirFrente(lsp);
		//INFO
		System.out.println("Nome:"+lsp.info().nome);
		imprimirTras(pegarUltimo(lsp));
	}

}
