package br.com.kalango.lab.controllers;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.kalango.lab.dao.LivroDAO;
import br.com.kalango.lab.models.Livro;

@ManagedBean
public class LivroMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7622242311578618762L;

	@EJB
	private LivroDAO dao;
	
	private Livro livro;
	
	@PostConstruct
	public void init(){
		livro = new Livro();
	}
	
	public void salvar(){
		dao.salvar(livro);
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
	
	
	
	

}