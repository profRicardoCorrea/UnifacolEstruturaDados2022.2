package pilha.vetor;

public class PilhaVetor_v2 {
	public static int[] pilha=new int[5];
	public static int topo=0;
	 
	public static void empilhar(int numero) {
		if(!cheia()) {
			pilha[topo]=numero;
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
	
	public static int stackpop() {
		if(!empty())
			return pilha[topo-1];
		else
			return -999999;
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
		empilhar(34);
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());		
		empilhar(55);
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());
		empilhar(11);
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());
		empilhar(23);
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());
		empilhar(67);
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());
		
		empilhar(77777);
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());
		empilhar(88888);
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());
		
		desempilhar();
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());
		empilhar(583);
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());
		
	}

}
