package br.com.senature.sc.dao;

import java.util.List;

import javax.ejb.Remote;

import br.com.senature.sc.entity.Locatario;

@Remote
public interface LocatarioDAO extends GenericDAO<Locatario, Integer>{
	
	public List<Locatario> buscarPorNome(String nome);
}
