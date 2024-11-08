package Views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import javax.swing.JTextField;

public class LoginView{ 
	JFrame Login;
	public LoginView() {
		//Creamos la ventana
		Login = new JFrame();
		Login.setTitle("Formulario de Login");
		Login.setBounds(100, 100, 500, 400);
		Login.setLayout(new GridLayout(4,2));
		
		//Crear una etiqueta
		JLabel titulo = new JLabel("Autenticación", JLabel.CENTER);
		Login.add(titulo);
		
		//Etiqueta y campo de usuario
		JLabel lUsuario = new JLabel("Usuario: ");
		Login.add(lUsuario);
		JTextField tUsuario = new JTextField(10);
		Login.add(tUsuario);
		
		//Etiqueta y campo de contaseña
		JLabel lContraseña = new JLabel("Contraseña: ");
		Login.add(lContraseña);
		JPasswordField tContraseña = new JPasswordField(10);
		Login.add(tContraseña);
		
		//Boton de acceder y cancelar
		JButton bAcceder = new JButton("Acceder");
		Login.add(bAcceder);
		bAcceder.addActionListener(new ActionListener(){
			@Override 
			public void actionPerformed(ActionEvent e) {
				String user = tUsuario.getText();
				String pass = String.valueOf(tContraseña.getPassword());
				validarDatos(user, pass);
			}
		});
		JButton bCancelar = new JButton("Cancelar");
		Login.add(bCancelar);
		
		Login.setVisible(true);
		
	}
	public static void main(String[] args) {
		new LoginView();
	}
	
	public void validarDatos(String u, String p) {
		String mensaje = "Usuario: " + u + "\n Contraseña: " + p;
		JOptionPane.showMessageDialog(Login, mensaje);
	}
}
