package recursao.escada.abel;

public class Degrau {

	public Degrau() {}
	
	public String nome;
	public int numero;
	public Degrau degrau;
	
	
	
	public static void main(String[] args) {
		
		Degrau d1= new Degrau();
		
		d1.nome = "Ricardo";
		d1.numero = 0;
		d1.degrau = null;
		
		Degrau d2= new Degrau();
		d2.nome = "Ana";
		d2.numero = 1;
		d2.degrau = d1;
		
		Degrau d3= new Degrau();
		d3.nome = "Ana";
		d3.numero = 2;
		d3.degrau = d2;
		
		Degrau d4= new Degrau();
		d4.nome = "José";
		d4.numero = 3;
		
d4.degrau = d3;
		
		Degrau d5= new Degrau();
		d5.nome = "Hanna";
		d5.numero = 4;
		d5.degrau = d4;
		
		Degrau d6= new Degrau();
		d6.nome = "Gustavo";
		d6.numero = 5;
		d6.degrau = d5;
		
	}
}