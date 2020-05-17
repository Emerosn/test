package org.edu.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import org.hibernate.Session;

import control.HibernateUtil;

@ManagedBean
public class Principal {
	
	private Pessoa pessoa;
	private List<Pessoa> pessoas;
	
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public void inserir() {
		 Pessoa p = new Pessoa();
		 Session sess = HibernateUtil.getSession().getSessionFactory().openSession();
		 sess.beginTransaction();
		 sess.save(p);
		 sess.beginTransaction().commit();
		 sess.close();
		 }
	}
	


