package pilha.vetor;

public class FilaVetor20222 {
	public static int inicioFila=0;
	public static int fimFila=0;
	public static String [] filaNome= {};
	
	public static void enfileirar(String nome) {
		if(filaNome.length>fimFila) {
			filaNome[fimFila]=nome;
		 
			fimFila++;
		}
		else
			System.out.println("FILA CHEIA" );
		
		System.out.println(">>>"+ fimFila);
		
		
			
	}
	
	public static void imprimir() {
		System.out.println("*******************************************" );
		for (String nome : filaNome) {
			if(nome != null)
				System.out.println(">>>"+nome+ " |" + fimFila);
		}
		System.out.println("------------------------------------------" );
	}
	public static void main(String[]args) {
		filaNome=new String[5];
		enfileirar("A");
		imprimir();
		enfileirar("B");
		imprimir();
		enfileirar("C");
		imprimir();
		enfileirar("D");
		imprimir();
		enfileirar("E");
		imprimir();
		enfileirar("F");
		imprimir();
	}

}
