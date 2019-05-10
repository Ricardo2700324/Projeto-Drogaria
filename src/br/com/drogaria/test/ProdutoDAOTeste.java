package br.com.drogaria.test;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.dao.ProdutoDAO;
import br.com.drogaria.domain.Fabricante;
import br.com.drogaria.domain.Produto;

public class ProdutoDAOTeste {
	@Test
	@org.junit.Ignore
	public void salvar()throws SQLException {
		Produto p = new Produto();
		p.setDescricao("Centrum");
		p.setPreco(50.00);
		p.setQuantidade(8L);
		
		Fabricante f = new Fabricante();
		f.setCodigo(16L);
		
		p.setFabricante(f);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.salvar(p);
	}
	@Test
	@Ignore
	public void listar() throws SQLException {
		ProdutoDAO dao = new ProdutoDAO();
		ArrayList<Produto> lista = dao.listar();
		
		for(Produto p : lista){
			System.out.println("Código Produto: " + p.getCodigo());
			System.out.println("Descricão Produto: " + p.getDescricao());
			System.out.println("Preço: " + p.getPreco());
			System.out.println("Quantidade: " + p.getQuantidade());
			System.out.println("Código Fabricante: " + p.getFabricante().getCodigo());
			System.out.println("Descricão Fabricante: " + p.getFabricante().getDescricao());
			System.out.println();
		}
	}
	@Test
	@Ignore
	public void excluir() throws SQLException {
		Produto p = new Produto();
		p.setCodigo(2L);
		
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.excluir(p);
	}
	@Test
	@Ignore
	public void eeditar() throws SQLException {
		Produto p = new Produto();
		p.setCodigo(1L);
		p.setDescricao("Cataflan com 20 Gramas");
		p.setPreco(15.99);
		p.setQuantidade(5L);
		
		Fabricante f = new Fabricante();
		f.setCodigo(9L);
		
		p.setFabricante(f);
		
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.editar(p);
	}
}
