package br.com.senature.sc.dao;

import javax.persistence.EntityManager;

public class GenericDAO <T, K> {
	
	protected EntityManager em;
}
