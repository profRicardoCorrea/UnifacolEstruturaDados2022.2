package pilha.vetor;

public class PilhaVetor {
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
	public static int desempilharInt() {	
		if(!empty()) 
			return pilha[--topo];	
		else {
			System.out.println("PILHA VAZIA");
			return -999999;}
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
		
		/*if(empty())
			System.out.println("ESTA VAZIA A PILHA");
		System.out.println("E.TOPO:"+stackpop());
		empilhar(234);
		if(empty())
			System.out.println("ESTA VAZIA A PILHA");
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TOPO:"+topo);
		*/
		
		System.out.println("TAMANHO DO VETOR:"+pilha.length);
		 System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());		
		
		empilhar(34);
		
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());		
		
		empilhar(55);
		System.out.println("TAMANHO DO VETOR:"+pilha.length);
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
		
		empilhar(-77777);
		System.out.println("TAMANHO DO VETOR:"+pilha.length);
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());
		
		empilhar(88888);
		
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());
		
		System.out.println("TOPO REMOVIDO:"+desempilharInt());
		
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size());
		
		empilhar(583);
		
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size()); 
		
		empilhar(004);
		
		System.out.println("E.TOPO:"+stackpop());
		System.out.println("TAMANHO:"+size()); 
		System.out.println("TAMANHO DO VETOR:"+pilha.length);
		
	}

}
