package br.com.senature.sc.dao;

import java.util.List;

import javax.ejb.Remote;

import br.com.senature.sc.entity.Vaga;

@Remote
public interface VagaDAO extends GenericDAO<Vaga, Integer>{
	
	public List<Vaga> buscarPorNome(String nome);
	
	public List<Vaga> buscarPorLocalizacao(String localizacao);
}
