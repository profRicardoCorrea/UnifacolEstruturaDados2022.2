package arvorebinaria;

public final class ArvoreBinariaPessoa extends ArvoreBinaria<ArvoreBinariaPessoa, Pessoa> {
	public ArvoreBinariaPessoa(Pessoa pessoa) {
		this.informacao = pessoa;
	}

	public ArvoreBinariaPessoa() {

	}

	@Override
	public ArvoreBinariaPessoa insert(ArvoreBinariaPessoa arvore, ArvoreBinariaPessoa arvoreNova) {
		if (arvore == null || arvore.informacao == null) {
			return arvoreNova;
		} else if (arvoreNova.informacao.idade <= arvore.informacao.idade) {
			arvore.noEsquerdo = insert(arvore.noEsquerdo, arvoreNova);
		} else if (arvoreNova.informacao.idade > arvore.informacao.idade) {
			arvore.noDireito = insert(arvore.noDireito, arvoreNova);
		}
		return arvore;

	}

	@Override
	public void imprimir(ArvoreBinariaPessoa arvore) {
		if (arvore != null) {
			if (arvore.noEsquerdo != null) {
				imprimir(arvore.noEsquerdo);
			}
			if (arvore.noDireito != null) {
				imprimir(arvore.noDireito);
			}
			System.out.println(arvore.informacao.idade);
		}

	}
	public int profundidade(ArvoreBinariaPessoa arvore) {
	 
		if (arvore != null) {
			if (arvore.noEsquerdo != null) {
				return (1+profundidade(arvore.noEsquerdo));
			}
			if (arvore.noDireito != null) {
				return (1+profundidade(arvore.noDireito));
			}
			 
		}

		return 0;

	}
	
	public String imprimirA(ArvoreBinariaPessoa arvore) {
		String imp=arvore.informacao.idade+")\n";
		String noE="";
		String noD="";
		if (arvore != null) {
			if (arvore.noEsquerdo != null) {
				noE= imprimirA(arvore.noEsquerdo);
			}
			if (arvore.noDireito != null) {
				noD= imprimirA(arvore.noDireito);
			}
			 
		}

		return imp+noE+"\t\t"+noD;

	}

}
