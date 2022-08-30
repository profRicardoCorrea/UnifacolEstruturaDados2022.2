package pilha.vetor;

public class Pilhav1 {
	public static int top=0;
	
	public static boolean emptyVector(int[] pilha) {
		if(pilha.length==0)
			return true;
		else
			return false;
					
	}
	public static boolean emptyPilha() {
		if(top == 0)
			return true;
		else
			return false;
					
	}
	public static boolean emptyPilha(int topEspecifio) {
		if(topEspecifio == 0)
			return true;
		else
			return false;
					
	}
	
	public static void main(String[] args) {
		int topA=0;		
		int [] pilhaA = {};
		 
		int [] pilhaB = {23,18,9,12,5,5040,9,12,4,18,9,12,4,18,9,12,4,18,9,12,4,18,9,12,4,18,9,12,4};
		int topB=10;
		 
		 
		 
		
		System.out.println(emptyVector(pilhaA));
		System.out.println(emptyVector(pilhaB));
		System.out.println(emptyPilha(topA));
		System.out.println(emptyPilha(topB));
		 
		 
		if(!emptyPilha(topB)) {
			topB=topB-1;
			System.out.println(">>>"+topB+" - "+pilhaB[topB-1]);
		}
		if(!emptyPilha(topB)) {
			topB=topB-1;
			System.out.println(">>>"+topB+" - "+pilhaB[topB-1]);
		}
		if(!emptyPilha(topB)) {
			
			System.out.println(">>>"+topB+" - "+pilhaB[topB-1]);
			topB=topB-1;
		}
		if(!emptyPilha(topB)) {
			topB=topB-1;
			System.out.println(">>>"+topB+" - "+pilhaB[topB-1]);
		}
		if(!emptyPilha(topB)) {
			topB=topB-1;
			System.out.println(">>>"+topB+" - "+pilhaB[topB-1]);
		}
		if(!emptyPilha(topB)) {
			topB=topB-1;
			System.out.println(">>>"+topB+" - "+pilhaB[topB-1]);
		}
		if(!emptyPilha(topB)) {
			topB=topB-1;
			System.out.println(">>>"+topB+" - "+pilhaB[topB-1]);
		}
		if(!emptyPilha(topB)) {
			topB=topB-1;
			System.out.println(">>>"+topB+" - "+pilhaB[topB-1]);
		}
		if(!emptyPilha(topB)) {
			topB=topB-1;
			System.out.println(">>>"+topB+" - "+pilhaB[topB-1]);
		}
		if(!emptyPilha(topB)) {
			
			System.out.println(">>>"+topB+" - "+pilhaB[topB-1]);
			topB=topB-1;
		}
 
			
			System.out.println(">>>"+topB+" - "+pilhaB[topB]);
			 
		 
	}

}
