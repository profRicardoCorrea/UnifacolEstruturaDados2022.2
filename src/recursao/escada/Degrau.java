package recursao.escada;

public class Degrau {
	String nome;
	Degrau subindo;
	Degrau descendo;
	int posicao;
	public Degrau(String nome, Degrau subindo,Degrau descendo, int posicao) {
		 
		this.nome = nome;
		this.subindo = subindo;
		this.descendo = descendo;
		this.posicao = posicao;
	}	

}
