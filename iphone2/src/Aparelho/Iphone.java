package Aparelho;

import iphone.AparelhoIphone;

public class Iphone {
	public static void main(String[] args) {
		AparelhoIphone iphone = new AparelhoIphone();
		
		
		System.out.println("Música");
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
		
		
		System.out.println("Telefone");
		iphone.ligar();
		iphone.iniciarCorreioDeVoz();
		iphone.atender();
		
		
		System.out.println("Navegador");
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarNovaPagina();
		
	}
}
