package recursao.escada;

import java.util.concurrent.TimeUnit;

public class MainEscada {
	
	public static void subirEscada(Degrau subindo) throws InterruptedException {
		
		if(subindo!=null) {
			System.out.println("subindo ....");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("NOME:"+subindo.nome);
			System.out.println("POSICAO:"+subindo.posicao);
			
			subirEscada(subindo.subindo);
		}else {
			TimeUnit.SECONDS.sleep(2);
			System.out.println("fim da escada...");
		}
	}
	public static void descerEscada(Degrau descendo) throws InterruptedException {
			
			if(descendo!=null) {
				System.out.println("descendo ....");
				TimeUnit.SECONDS.sleep(2);
				System.out.println("NOME:"+descendo.nome);
				System.out.println("POSICAO:"+descendo.posicao);				
				descerEscada(descendo.descendo);
			}else {
				TimeUnit.SECONDS.sleep(2);
				System.out.println("inicio da escada...");
			}
		}
	
	public static void percorrerEscada(Degrau degrau, int sentido) throws InterruptedException {
		
		if(degrau!=null) {			 
			TimeUnit.SECONDS.sleep(2);
			System.out.println("NOME:"+degrau.nome);
			System.out.println("POSICAO:"+degrau.posicao);	
			switch (sentido) {
			case 0:
				System.out.println("SENTIDO: SUBINDO" );
				percorrerEscada(degrau.subindo,sentido);
				break;
			case 1:
				System.out.println("SENTIDO: DESCENDO" );
				percorrerEscada(degrau.descendo,sentido);
				break;
			default:
				break;
			}
			
			
		}else {
			TimeUnit.SECONDS.sleep(2);
			System.out.println("inicio da escada...");
		}
	}
	public static void main(String[]args) throws InterruptedException {		 
		//SUBIR
		 Degrau deg11=new Degrau("Rodolffo", null,null, 11);
		 Degrau deg10=new Degrau("Sarah", deg11,null, 10);
		 Degrau deg9=new Degrau("Kerline", deg10,null, 9);
		 Degrau deg8=new Degrau("Carla Diaz", deg9,null, 8);
		 Degrau deg7=new Degrau("Projota", deg8,null, 7);
		 Degrau deg6=new Degrau("Lumena", deg7,null, 6);
		 Degrau deg5=new Degrau("Karol Conká", deg6,null, 5);
		 Degrau deg4=new Degrau("Nego Di", deg5,null, 4);
		 Degrau deg3=new Degrau("Arcrebiano", deg4,null, 3);
		 Degrau deg2=new Degrau("Lucas", deg3,null, 2);
		 Degrau deg1=new Degrau("Kerline", deg2,null, 1);
		 //subirEscada(deg3);
		 System.out.println("================================");
		 //DESCER
		 deg11.descendo=deg10;
		 deg10.descendo=deg9;
		 deg9.descendo=deg8;
		 deg8.descendo=deg7;
		 deg7.descendo=deg6;
		 deg6.descendo=deg5;
		 deg5.descendo=deg4;
		 deg4.descendo=deg3;
		 deg3.descendo=deg2;
		 deg2.descendo=deg1;
		 deg1.descendo=null;
		 
		 
		 //percorrerEscada(deg11,0);
		 percorrerEscada(deg11,1);
		 
		
		
	}

}
