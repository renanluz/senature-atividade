package br.com.senature.sc.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.com.senature.sc.entity.Vaga;

@Stateless
public class VagaDAOImpl extends GenericDAOImpl<Vaga, Integer> implements VagaDAO{

	public VagaDAOImpl() {
		super();
	}

	public List<Vaga> buscarPorNome(String nome) {
		return em.createQuery("from Vaga v where v.nome like :n", Vaga.class)
				.setParameter("n", "%" + nome + "%").getResultList();
	}
	
	public List<Vaga> buscarPorLocalizacao(String localizacao) {
		return em.createQuery("from Vaga v where v.localizacao = :l", Vaga.class)
				.setParameter("l", localizacao).getResultList();
	}

}
