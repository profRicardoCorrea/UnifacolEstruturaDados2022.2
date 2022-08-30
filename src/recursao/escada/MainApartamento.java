package recursao.escada;

import java.util.concurrent.TimeUnit;

public class MainApartamento {

	public static Apartamento inserirApartamento(Apartamento predio, Apartamento apt, int posicaoAnt) {
		if (predio != null)
			System.out.println("AP:" + predio.numero);

		if (predio == null) {
			predio = apt;
			apt.posicao = posicaoAnt;

		} else if (predio != null && posicaoAnt == 1) {
			//C// ap1|ap2
			Apartamento temp = inserirApartamento(predio.vizDireita, apt, predio.posicao + 1);
			predio.vizDireita = temp;
			temp.vizEsquerda = predio;
			if (predio.vizBaixo != null) {
				temp.vizBaixo = predio.vizBaixo.vizDireita;
				predio.vizBaixo.vizDireita.vizCima = temp;
			}
		} else if (predio != null && posicaoAnt == 2) {
			Apartamento temp = inserirApartamento(predio.vizEsquerda.vizCima, apt, 1);
			predio.vizEsquerda.vizCima = temp;
			temp.vizBaixo = predio.vizEsquerda;
		}
		return predio;

	}

	public static void imprimirApartamento(Apartamento predio,String sep) {

		if (predio != null)
			System.out.print("|" + predio.numero+"|"+sep);
		if (predio != null && predio.posicao == 1) {

			imprimirApartamento(predio.vizDireita,"\n");

		} else if (predio != null && predio.posicao == 2) {
			imprimirApartamento(predio.vizEsquerda.vizCima,"");

		}

	}

	public static void main(String[] args) throws InterruptedException {
		Apartamento ap1 = new Apartamento();
		ap1.numero = "101";
		Apartamento ap2 = new Apartamento();
		ap2.numero = "102";
		Apartamento ap3 = new Apartamento();
		ap3.numero = "201";
		Apartamento ap4 = new Apartamento();
		ap4.numero = "202";
		Apartamento ap5 = new Apartamento();
		ap5.numero = "301";
		Apartamento ap6 = new Apartamento();
		ap6.numero = "302";

		// ap4|ap2
		// ap1|ap6
		/*
		 * ap1.vizDireita=ap6; ap6.vizEsquerda=ap1; ap1.vizCima=ap4; ap4.vizBaixo=ap1;
		 * ap4.vizDireita=ap2; ap2.vizEsquerda=ap4; ap4.vizCima=ap3; ap3.vizBaixo=ap4;
		 * ap3.vizDireita=ap5; ap5.vizEsquerda=ap3; ap5.vizBaixo=ap2;
		 */

		Apartamento predio = null;
		
		
		
		
		
		predio = inserirApartamento(predio, ap1, 1);// 1
		System.out.println("posicao ap1" + predio.numero);
		predio = inserirApartamento(predio, ap2, 1);// 2
		System.out.println("posicao ap2" + predio.vizDireita.numero);
		predio = inserirApartamento(predio, ap3, 1);
		System.out.println("posicao ap3" + predio.vizCima.numero);

		predio = inserirApartamento(predio, ap4, 1);
		System.out.println("posicao ap4" + predio.vizDireita.vizCima.numero);

		predio = inserirApartamento(predio, ap5, 1);
		System.out.println("posicao ap5" + predio.vizCima.vizCima.numero);

		System.out.println("posicao ap2 CIMA" + predio.vizDireita.vizCima.numero);
		System.out.println("posicao ap4 BAIXO" + predio.vizCima.vizDireita.vizBaixo.numero);
		predio = inserirApartamento(predio, ap6, 1);
		imprimirApartamento(predio,"");
	}

}
