package recursao;

public class MainPessoa {
	
	public static void impPai(Pessoa p) {
		if(p!=null) {
			if(p.pai!=null)
				System.out.println("FILHO:"+p.nome+" PAI:"+p.pai.nome);
			else
				System.out.println("FILHO:"+p.nome);
			impPai( p.pai,3);
		}
		else
			System.out.println("NAO TEM PAI");		
	}
	public static void impPai(Pessoa p,int x) {
		if(p!=null) {
			if(p.pai!=null)
				System.out.println("FILHO:"+p.nome+" PAI:"+p.pai.nome);
			else
				System.out.println("FILHO:"+p.nome);
			impPai( p.pai);
		}
		else
			System.out.println("NAO TEM PAI");		
	}
	public static void main(String[]args) {
		Pessoa p7=new Pessoa();
		Pessoa p1=new Pessoa();
		p1.nome="Adao";
		p1.pai=p7;
		
		Pessoa p2=new Pessoa();
		p2.nome="Ciclano";
		p2.pai=p1;		
		
		Pessoa p3=new Pessoa();
		p3.nome="Beltrano";
		p3.pai=p2;
		
		Pessoa p4=new Pessoa();
		p4.nome="Beltrano1";
		p4.pai=p3;
		
		Pessoa p5=new Pessoa();
		p5.nome="Beltrano2";
		p5.pai=p4;
		
		
		Pessoa p6=new Pessoa();
		p6.nome="Beltrano 3";
		p6.pai=p5;
		
		
		 
		p7.nome="Beltrano 4";
		p7.pai=p6;
		
		impPai(p7);
		
		
	}

}
