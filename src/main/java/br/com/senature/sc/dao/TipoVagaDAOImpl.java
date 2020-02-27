package br.com.senature.sc.dao;

import java.util.List;

import br.com.senature.sc.entity.TipoVaga;

public class TipoVagaDAOImpl extends GenericDAOImpl<TipoVaga, Integer> implements TipoVagaDAO{

	public TipoVagaDAOImpl() {
		super();
	}
	
	public List<TipoVaga> buscarPorNome(String nome) {
		return em.createQuery("from TipoVaga t where t.nome like :n", TipoVaga.class)
				.setParameter("n", "%" + nome + "%").getResultList();
	}
}
