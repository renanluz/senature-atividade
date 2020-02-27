package br.com.senature.sc.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.com.senature.sc.entity.Locatario;

@Stateless
public class LocatarioDAOImpl extends GenericDAOImpl<Locatario, Integer> implements LocatarioDAO {

	public LocatarioDAOImpl() {
		super();
	}
	
	public List<Locatario> buscarPorNome(String nome) {
		return em.createQuery("from Locatario l where l.nome like :n", Locatario.class)
				.setParameter("n", "%" + nome + "%").getResultList();
	}
}	
