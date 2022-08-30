package recursao;

public class Fatorial {
	public static int fatorial(int n) {
		if(n>1)
			return n*fatorial(n-1);
		else
			return 1;
	}
	
	public static void main(String [] args) {
		int x=1;
		System.out.printf("Fatorial de %d é %d",x,fatorial(x));
	 
	}
}
