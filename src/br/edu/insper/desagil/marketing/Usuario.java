package br.edu.insper.desagil.marketing;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	public String nome;
	private List<Video> videos;
	private Integer id;
	private Produto produto;
	private Usuario usuario;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<Video>();
	}
	
	public Video postaVideo(Integer id, Produto produto) {
		Video novoVid;
		
		novoVid = new Video(id, produto, this.usuario);
		this.videos.add(novoVid);
		
		return novoVid;
	}

}
