package persistencia;
import java.sql.Connection;
public class AlunoDAO {
	
	Connection conn;
	
	public AlunoDAO(Connection conn){
		this.conn = conn;
	}
	public void inserir(AlunoDAO a ){
		String sql = "Insert INTO alunos (nome) values ('"+a.getLogin()+"')";
				System.out.println(sql);
	}
	private String getLogin() {
		
		return null;
	}
	
}
