package etec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import etec.model.Pessoa;

public class PessoaDAO implements IDAO{
	
	Connection conn;
	
	public PessoaDAO(Connection conn) {
		this.conn = conn;
	}
	

	@Override
	public void inserir(Object o) throws Exception {
		String sql = "insert into pessoa (nome) values ('"+   ((Pessoa)o).getNome()    +"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.execute();		
	}

	@Override
	public List listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
