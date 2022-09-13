package ed20222;

public class MainListaEncadeada {
	
	public static void imprimir(ListaEncadeada lista) {
		if(lista!=null) {
			if(!lista.jaImprimiu) {
			System.out.println(lista.carro.ano);
			lista.jaImprimiu=true;
			}
			if(lista.proximoListaEncadeada!=null)
				imprimir(lista.proximoListaEncadeada);
		}
		System.out.println("-----------");
	}
	
	public static void main(String[]args) {
		ListaEncadeada p1=null;
		
		
		Carro c1=new Carro(1999);
		ListaEncadeada x=new ListaEncadeada(c1);
		//System.out.println(p1);
		p1=x;
		imprimir(p1); 
		//System.out.println(p1);
		p1.proximoListaEncadeada=new ListaEncadeada(new Carro(2000));
		imprimir(p1); 
		p1.proximoListaEncadeada.proximoListaEncadeada=new ListaEncadeada(new Carro(2001));
		imprimir(p1);
		p1.proximoListaEncadeada.proximoListaEncadeada.proximoListaEncadeada=new ListaEncadeada(new Carro(2002));
		imprimir(p1);
		p1.proximoListaEncadeada.proximoListaEncadeada.proximoListaEncadeada.proximoListaEncadeada=new ListaEncadeada(new Carro(2003));
		imprimir(p1);
		
	}

}
