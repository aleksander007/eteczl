
package etec;

import java.sql.Connection;
import java.sql.SQLException;

import etec.model.Disciplina;
import etec.model.Pessoa;
import etec.persistence.ConexaoFactory;
import etec.persistence.DisciplinaDAO;
import etec.persistence.PessoaDAO;

public class Aplicacao {

	public static void main(String[] args) throws Exception {
		
		Connection mysqlConnection = new ConexaoFactory().getMysqlConnection();
		
		PessoaDAO pessoaDAO = new PessoaDAO(mysqlConnection);		
		Pessoa pessoa1 = new Pessoa("Aleksander");		
		
		Disciplina dPCII = new Disciplina();
		dPCII.setNome("PCII");
		
		DisciplinaDAO discDAO = new DisciplinaDAO(mysqlConnection);
		
		pessoaDAO.inserir(pessoa1);
		//discDAO.inserir(dPCII);		
	}
	
}
