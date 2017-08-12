package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {

	public Connection getMysqlConnection() throws Excption {
	String stringconnection  = "jdbe:mysql://localhost:3306/escola";
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection(stringconnection,"root","");
	System.out.println(conn);
  }
}