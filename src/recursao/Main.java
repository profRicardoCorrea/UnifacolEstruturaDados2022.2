package recursao;

public class Main {
	
	public static int somatorio(int x) {
		int soma=0;		
		for (int i = 0; i <= x; i++) {
			soma=soma+i;
		} 		
		//System.out.println("SOmatorio:"+soma);
		return soma;
	}
	
	public static int somatorioR(int x) {
		 if(x>0)
			 return  somatorioR(x-1)+x;
		 else
			 return 0;		 
		 
	}
	 	public static void main(String[]args) {			
		int x=7;
		System.out.println(
				somatorio(5)
				);
		System.out.println(
				somatorioR(5)
				);
		
		 
								 
								
		
	}	
}
