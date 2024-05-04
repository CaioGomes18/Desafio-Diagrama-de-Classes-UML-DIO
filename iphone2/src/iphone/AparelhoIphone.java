package iphone;

import dominio.ReprodutorMusical;
import dominio.AparelhoTelefonico;
import dominio.NavegadorDeInternet;

public class AparelhoIphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet{

	
	//ipod
	@Override
	public void tocar() {
		System.out.println("Tocando musica");
		
	}
	@Override
	public void pausar() {
		System.out.println("pausando música");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionado música");
		
	}
	
	
	
	//Telefone
	@Override
	public void atender() {
		System.out.println("Atendendo");
		
	}
	@Override
	public void ligar() {
		System.out.println("ligando via iphone");		
	}
	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("iniciando correio de voz via iphone");
		
	}
	
	
	
	//Navegador
	@Override
	public void exibirPagina() {
		System.out.println("exibindo página");		
	}
	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		
	}
	@Override
	public void atualizarNovaPagina() {
		System.out.println("Atualizando página");
		
	}
	
}
