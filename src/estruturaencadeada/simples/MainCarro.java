package estruturaencadeada.simples;

import java.util.concurrent.TimeUnit;

public class MainCarro {

	public static void main(String[] args) throws InterruptedException {

		CarroServico psev = new CarroServico();
		

		Carro c1 = new Carro();
		c1.modelo = "B";
		 
		psev.inicio=psev.add(psev.inicio, c1);

		 
		Carro p2 = new Carro();
		p2.modelo = "A";
		 
		psev.inicio=psev.add(psev.inicio, p2);
		
		Carro p3 = new Carro();
		p3.modelo = "C";
		 
		psev.inicio=psev.add(psev.inicio, p3);
		 
		psev.imprimirPai(psev.inicio);
		System.out.println("------------------------------");
		psev.inicio=psev.remover(psev.inicio, "A");
		psev.imprimirPai(psev.inicio);
		//System.out.println(">>>" + psev.inicio.informacao.nome);
		//.out.println(">>>" + psev.inicio.proximo.informacao.nome);

	}

}
