package iphone;


import aplicativos.Musica;
import aplicativos.Safari;
import aplicativos.Telefone;

public class IPhone implements  Musica, Safari, Telefone {


public static void main(String[] args) {
	
	
	
	Telefone.ligar();
	Telefone.atender();
	Telefone.iniciarCorreioVoz();
	
	Musica.tocar();
	Musica.pausar();
	Musica.selecionarMusica();
	
	Safari.exibirPagina();
	Safari.adicionarNovaAba();
	Safari.atualizarPagina();
}
}