package pilha.vetor;

public class PilhaVetorBolinha {
	public static Bolinha[] pilha=new Bolinha[5];
	public static int topo=0;
	 
	public static void empilhar(Bolinha bola) {
		if(!cheia()) {
			pilha[topo]=bola;
			topo++;
		}else {
			System.out.println("PILHA CHEIA");
		}
	}
	
	public static void desempilhar() {	
		if(!empty())
			topo--;	
		else
			System.out.println("PILHA VAZIA");
	}	
	
	public static boolean  empty() {
		if(topo==0)
			return true;
		else
			return false;
	}
	
	public static Bolinha stackpop() {
		 
		if(!empty())
			return pilha[topo-1];
		else
			return null;
	}
	
	public static int size() {
		return topo;
	}
	
	public static boolean cheia() {
		if(topo>=pilha.length)
			return true;
		else 
			return false;
	}
	
	public static void main(String[]args) {	
		
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());		
		Bolinha b1=new Bolinha(2, "A");
		empilhar(b1);
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());	
		Bolinha b3=new Bolinha(5, "B");
		empilhar(b3);
		 
		
	}

}
