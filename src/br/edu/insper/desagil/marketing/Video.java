package br.edu.insper.desagil.marketing;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Video {
	private Map<Usuario, Integer> avaliacoes;
	private Integer id;
	private Produto produto;
	private Usuario usuario;
	
	public Video(Integer id, Produto produto, Usuario usuario ) {
		this.usuario = usuario;
		this.id = id;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
		
	}
	public void adicionaAvaliacao(Usuario usuario, Integer nota) {
		if(usuario.nome != this.usuario.nome) {
			if(0 < nota) {
				if (nota < 6) {
					this.avaliacoes.put(usuario, nota);
				}
				
			}
		}
	}
	
	public int mediaAvaliacoes() {
		Integer media = 0;
		Integer contador = 0;
		
		for(int nota : this.avaliacoes.values()) {
			media += nota;
			contador += 1;
		}
		if(contador == 0) {
			media = 0;
		}
		else {
			media = Math.round(media/contador);
		}
		return media;
	}
}
