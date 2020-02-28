package br.com.senature.sc.controllers;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.senature.sc.dao.VagaDAO;
import br.com.senature.sc.entity.Vaga;

@WebServlet("/vaga")
public class VagaServlet extends HttpServlet{
	
	private static final long serialVersionUID = -5791609000573773318L;
	
	@EJB
	private VagaDAO dao;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		List<Vaga> lista = dao.buscarPorNome(nome);
		
		req.setAttribute("resultado", lista);
		req.getRequestDispatcher("busca.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
/*	private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String descricaoVaga = request.getParameter("descricao");
			String localizacaoVaga = request.getParameter("localizacao");
			float valoDiaria = Float.parseFloat(request.getParameter("valor"));
			
			String nomeLocatario = request.getParameter("nomeLocatario");			
			Locatario locatario = new Locatario(0, nomeLocatario);
			
			String tipo = request.getParameter("tipo");			
			TipoVaga tipoVaga = new TipoVaga(0, tipo);
			
			Vaga vaga = new Vaga(0, descricaoVaga, valoDiaria, localizacaoVaga, tipoVaga, locatario);
			dao.cadastrar(vaga);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
}
