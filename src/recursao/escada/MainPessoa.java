package recursao.escada;

import java.util.concurrent.TimeUnit;

public class MainPessoa {

	public static Pessoa addFilho(Pessoa pai, Pessoa novofilho) {// p1,p4//p3,p4

		if (pai == null)
			return novofilho;
		else if (pai != null && pai.filho == null) {
			pai.filho = addFilho(pai.filho, novofilho);
			return pai;
		}

		else if (pai != null && pai.filho != null) {
			pai.filho.filho = addFilho(pai.filho.filho, novofilho);
			return pai;
		} else
			return pai;
		
	}

	public static void imprimirFilho(Pessoa pai) {
		if (pai != null && pai.filho != null) {
			System.out.println("PAI:" + pai.nome + " FILHO:" + pai.filho.nome);
			imprimirFilho(pai.filho);
		}

	}

	public static Pessoa buscarFilhoPorNome(Pessoa pai, String nomePai) {// p3,C
		if (pai != null && pai.filho != null) {
			System.out.println("##### PAI:" + pai.nome + " FILHO:" + pai.filho.nome);
			if (pai.nome == nomePai)
				return pai.filho;

			else
				return buscarFilhoPorNome(pai.filho, nomePai);

		}
		return null;
	}

	public static Pessoa removerPai(Pessoa pai, String nomePai) {//A,C
		if (pai != null) {
			if (pai.nome.equals(nomePai)) {
				Pessoa tmp = pai.filho;
				pai = null;
				return tmp;
			} else
				pai.filho= removerPai(pai.filho, nomePai);
		}
		return pai;

	}

	public static void main(String[] args) throws InterruptedException {
		Pessoa p1 = new Pessoa();
		p1.nome = "A";
		p1.idade = 5;

		Pessoa p2 = new Pessoa();
		p2.nome = "B";
		p2.idade = 4;

		Pessoa p3 = new Pessoa();
		p3.nome = "C";
		p3.idade = 3;

		Pessoa p4 = new Pessoa();
		p4.nome = "D";
		p4.idade = 2;
		// ENCADEAMENTO

		Pessoa primeiroPai = null;
		primeiroPai = addFilho(primeiroPai, p1);
		// System.out.println("NOME 1"+p1.nome);
		primeiroPai = addFilho(primeiroPai, p2);
		primeiroPai = addFilho(primeiroPai, p3);
		primeiroPai = addFilho(primeiroPai, p4);

		// imprimirFilho(primeiroPai);
		Pessoa objFilho = buscarFilhoPorNome(primeiroPai, "C");
		if (objFilho != null)
			System.out.println("FILHO ENCONTRADO:" + objFilho.nome);
		
		System.out.println("-------------------------");
		primeiroPai =removerPai(primeiroPai, "C");
		imprimirFilho(primeiroPai);
		/*
		 * System.out.println("NOME 2"+p1.filho.nome);
		 * System.out.println("NOME 3"+p1.filho.filho.nome);
		 * System.out.println("NOME 4"+p1.filho.filho.filho.nome);
		 */

		// System.out.println("NOME 3"+p3.nome);
		// System.out.println("NOME 4"+p3.filho.nome);
		// System.out.println("NOME 4"+p1.filho.filho.filho.nome);
	}

}
