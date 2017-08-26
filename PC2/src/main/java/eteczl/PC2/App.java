package eteczl.PC2;


import java.util.List;

import javax.swing.JFrame;


import java.awt.Container;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.UsuarioSistema;
import persistencia.conexao;
import view.LoginPanel;

public class App 

{
	private static String versao = "v1.0";
	private List<UsuarioSistema> userCadastrados = new ArrayList<UsuarioSistema>();
	private List<UsuarioSistema> userLogados = new ArrayList<UsuarioSistema>();
	private UsuarioSistema usuarioLogado;
	
	public App(){
		this.userCadastrados.add(new UsuarioSistema("Administrador","admin","123456"));
		this.showPanelLogin();
	}
	
	public void showPanelLogin(){
		JFrame jFrame = new JFrame("Interface Principal");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jFrame.add(new LoginPanel(this));
		jFrame.pack();
		jFrame.setVisible(true);		
	}
	
	public List<UsuarioSistema> getUsuariosCadastrados(){
		return userCadastrados;
	}
	
	public UsuarioSistema getUsuarioLogado() {
		return usuarioLogado;
	}	
	
	public void setUserLogado(UsuarioSistema userLogado){
		this.userLogados = userLogados;
	}
	public List<UsuarioSistema> getUsuariosLogados() {
		return userLogados;
	}

	public void setUsuariosLogados(List<UsuarioSistema> usuariosLogados) {
		this.userLogados = userLogados;
	}
    public static void main( String[] args ) throws Exception{
    
 
  		Connection mysqlConnection = new conexao().getMysqlConnection();
  		System.out.println(mysqlConnection);
  		
  		Connection conn = new conexao().getMysqlConnection();
  		String sql = "insert into aluno (nome) values ('Matheus')";
  		PreparedStatement stn = conn.prepareStatement(sql);
  		stn.executeUpdate();
  		
  		
  		ResultSet rs = stn.executeQuery("Select * from aluno");
  		while (rs.next()){
  			System.out.println(rs.getString("nome"));
  		}
  		
    {
       
    	
    }
  }
    
}
