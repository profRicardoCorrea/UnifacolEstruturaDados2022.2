package estruturaencadeada.simples;

import java.util.concurrent.TimeUnit;

public class MainPessoa {

	public static void main(String[] args) throws InterruptedException {

		PessoaRepositorio prep = new PessoaRepositorio();
		

		for (int i = 0; i < 100; i++) {
			
		
			Pessoa p3 = new Pessoa();
			p3.nome = "C"+i;
			p3.idade=110;
			 
			prep.inicio=prep.add(prep.inicio, p3);
		}
		prep.imprimirPai(prep.inicio);
		System.out.println("------------------------------");
		prep.inicio=prep.remover(prep.inicio, "A");
		prep.imprimirPai(prep.inicio);
		//System.out.println(">>>" + psev.inicio.informacao.nome);
		//.out.println(">>>" + psev.inicio.proximo.informacao.nome);

	}

}
