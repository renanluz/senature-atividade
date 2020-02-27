package br.com.senature.sc.dao;

import java.util.List;

import javax.ejb.Remote;

import br.com.senature.sc.entity.TipoVaga;

@Remote
public interface TipoVagaDAO extends GenericDAO<TipoVaga, Integer>{
	
	public List<TipoVaga> buscarPorNome(String nome); 
}
