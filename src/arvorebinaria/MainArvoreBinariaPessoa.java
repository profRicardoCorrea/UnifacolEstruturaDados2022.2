package arvorebinaria;

public class MainArvoreBinariaPessoa {
	public static void main(String[] args) {
		ArvoreBinariaPessoa arvoreBinariaX=new ArvoreBinariaPessoa();
		//--------------------------------------------------
		//System.out.println(">>>raiz"+arvoreBinariaX.raiz);
		//System.out.println(">>>noEsquerda"+arvoreBinariaX.noEsquedo);
		//System.out.println(">>>noDireita"+arvoreBinariaX.noDireito);
		//--------------------------------------------------
		arvoreBinariaX=arvoreBinariaX.insert(arvoreBinariaX, new ArvoreBinariaPessoa(new Pessoa("A","A0001",50)));
		arvoreBinariaX=arvoreBinariaX.insert(arvoreBinariaX, new ArvoreBinariaPessoa(new Pessoa("B","B0001",45)));
		arvoreBinariaX=arvoreBinariaX.insert(arvoreBinariaX, new ArvoreBinariaPessoa(new Pessoa("C","C0001",60)));
		arvoreBinariaX=arvoreBinariaX.insert(arvoreBinariaX, new ArvoreBinariaPessoa(new Pessoa("D","D0001",30)));
		arvoreBinariaX=arvoreBinariaX.insert(arvoreBinariaX, new ArvoreBinariaPessoa(new Pessoa("E","E0001",46)));
		arvoreBinariaX=arvoreBinariaX.insert(arvoreBinariaX, new ArvoreBinariaPessoa(new Pessoa("F","F0001",56)));
		arvoreBinariaX=arvoreBinariaX.insert(arvoreBinariaX, new ArvoreBinariaPessoa(new Pessoa("G","G0001",62)));
 
		//--------------------------------------------------
		System.out.println(">>>raiz"+arvoreBinariaX.informacao.idade);
		System.out.println(">>>noEsquerda"+arvoreBinariaX.noEsquerdo.informacao.idade+"\t\t"+">>>noDireita"+arvoreBinariaX.noDireito.informacao.idade);
		System.out.println(">>>noEsquerda"+arvoreBinariaX.noEsquerdo.noEsquerdo.informacao.idade+"\t\t"+">>>noDireita"+arvoreBinariaX.noEsquerdo.noDireito.informacao.idade);
		System.out.println(">>>noEsquerda"+arvoreBinariaX.noDireito.noEsquerdo.informacao.idade+"\t\t"+">>>noDireita"+arvoreBinariaX.noDireito.noDireito.informacao.idade);
		
		System.out.println(">>>PFD"+arvoreBinariaX.profundidade(arvoreBinariaX));
		System.out.println(arvoreBinariaX.imprimirA(arvoreBinariaX));
		
	}
}
