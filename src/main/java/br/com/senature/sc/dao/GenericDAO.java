package br.com.senature.sc.dao;

import java.util.List;

public interface GenericDAO <T, K>{
	
	public void cadastrar(T entidade);
	
	public void atualizar(T entidade);
	
	public T buscar(K codigo);

	public void excluir(K codigo) throws Exception;
	
	public List<T> listar();
	
}
