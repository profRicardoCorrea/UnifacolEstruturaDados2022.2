package pilha.vetor;

public class FilaVetor {
	  
	public static Integer[] fila=new Integer[5];
	 
	public static int front=4;
	public static int finalF=5;
	
	 
	public static void enfileirar(int numero) {		 
		fila[finalF]=numero;
		finalF++;
		 		 
	}
	
	public static int desenfileirar() {		
		return fila[front++];	
		 
	}	
	public static void reiniciar() {
		if(finalF==fila.length-1) {
			finalF=0;
			front=0;
			
		}
	}	
	
	
	 
	public static void main(String[]args) {	
		
		 	
		enfileirar(4); 
		System.out.println("finalF"+ finalF);
		System.out.println("front" +front);
		System.out.println( "fila[front]"+fila[front]);
		enfileirar(5); 
		System.out.println("finalF"+ finalF);
		System.out.println("front" +front);
		System.out.println( "fila[front]"+fila[front]);
		enfileirar(6); 
		System.out.println("finalF"+ finalF);
		System.out.println("front" +front);
		System.out.println( "fila[front]"+fila[front]);
		enfileirar(15); 
		System.out.println("finalF"+ finalF);
		System.out.println("front" +front);
		System.out.println( "fila[front]"+fila[front]);
		desenfileirar();
		System.out.println("finalF"+ finalF);
		System.out.println("front" +front);
		System.out.println( "fila[front]"+fila[front]);
		 
		
	}

}
