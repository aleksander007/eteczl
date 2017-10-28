package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import persistencia.ConectionFactory;
import persistencia.UsuarioDAO;

public class Login extends JFrame{
	ConectionFactory conecta = new ConectionFactory();
		
	private JLabel lblLogin = new JLabel("Login ");
	private JTextField txtLogin = new JTextField("");
	private JLabel lblSenha = new JLabel("Senha ");
	private JPasswordField txtSenha = new JPasswordField();
	private JButton btnEntrar = new JButton("Entrar");
	
	public Login() {
		conecta.conexao();
		this.setSize(300,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		lblLogin.setBounds(120,20,50,25);
		add(lblLogin);
		txtLogin.setBounds(45,45,200,25);
		add(txtLogin);
		
		lblSenha.setBounds(120,70,100,25);
		add(lblSenha);
		txtSenha.setBounds(45,90,200,25);
		add(txtSenha);

		btnEntrar.setBounds(90,145,100,25);
		add(btnEntrar);
		
		this.btnEntrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UsuarioDAO dao = new UsuarioDAO();
				
				try {
					if(dao.checkLogin(txtLogin.getText(), String.valueOf(txtSenha.getPassword()))) {
						
						JOptionPane.showMessageDialog(null,"Logado gay");
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao validar: "+e1);
				}		
			}
		});
	}
	
	public static void main(String[] args) {
		new Login();
	}
	
}