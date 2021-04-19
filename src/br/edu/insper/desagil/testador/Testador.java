package br.edu.insper.desagil.testador;
import java.util.ArrayList;
import java.util.List;

import br.edu.insper.desagil.marketing.*;

public class Testador {
	private Integer resultEsperado;
	private Integer media;
	
	public boolean testeA() {
		resultEsperado = 0;
		Produto produto = new Produto("batom", 2.00);
		Usuario usuarioOg = new Usuario("ana");
		Usuario usuarioRand = new Usuario("rand");
		Usuario usuarioAnon = new Usuario("anon");
		Video video = new Video(1, produto, usuarioOg);
		video.adicionaAvaliacao(usuarioOg, 2);
		video.adicionaAvaliacao(usuarioRand, 0);
		video.adicionaAvaliacao(usuarioAnon, 6);
		
		media = video.mediaAvaliacoes();
		
		if (media == resultEsperado) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean testeB() {
		resultEsperado = 5;
		Produto produto = new Produto("batom", 2.00);
		Usuario usuarioOg = new Usuario("ana");
		Usuario usuarioRand = new Usuario("rand");
		Video video = new Video(1, produto, usuarioOg);
		video.adicionaAvaliacao(usuarioRand, 5);
		
		media = video.mediaAvaliacoes();
		
		if (media == resultEsperado) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean testeC() {
		resultEsperado = 1;
		Produto produto = new Produto("batom", 2.00);
		Usuario usuarioOg = new Usuario("ana");
		Usuario usuarioRand = new Usuario("rand");
		Usuario usuarioAnon = new Usuario("anon");
		Video video = new Video(1, produto, usuarioOg);
		video.adicionaAvaliacao(usuarioRand, 1);
		video.adicionaAvaliacao(usuarioAnon, 2);
		
		media = video.mediaAvaliacoes();
		
		if (media == resultEsperado) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean testeD() {
		resultEsperado = 1 ;
		Produto produto = new Produto("batom", 2.00);
		Usuario usuarioOg = new Usuario("ana");
		Usuario usuarioRand = new Usuario("rand");
		Usuario usuarioAnon = new Usuario("anon");
		Usuario usuarioAleat = new Usuario("aleat");
		Video video = new Video(1, produto, usuarioOg);
		video.adicionaAvaliacao(usuarioRand, 2);
		video.adicionaAvaliacao(usuarioAnon, 1);
		video.adicionaAvaliacao(usuarioAleat, 1);
		
		media = video.mediaAvaliacoes();
		
		if (media == resultEsperado) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean testeE() {
		Integer mediaVideo;
		Integer mediaVideoN;
		
		resultEsperado = 2 ;
		Produto produto = new Produto("batom", 2.00);
		Usuario usuarioOg = new Usuario("ana");
		Usuario usuarioRand = new Usuario("rand");
		Usuario usuarioAnon = new Usuario("anon");
		Usuario usuarioAleat = new Usuario("aleat");
		Video video = new Video(1, produto, usuarioOg);
		Video videoN = new Video(2, produto, usuarioOg);
		video.adicionaAvaliacao(usuarioRand, 2);
		video.adicionaAvaliacao(usuarioAnon, 1);
		videoN.adicionaAvaliacao(usuarioAleat, 1);
		
		mediaVideo = video.mediaAvaliacoes();
		mediaVideoN = videoN.mediaAvaliacoes();
		
		media = mediaVideo + mediaVideoN;
		
		if (media == resultEsperado) {
			return true;
		}
		else{
			return false;
		}
	}
}
