package views;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import models.Conexion;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Conexion c = new Conexion();
		if(c.getConexion() != null) {
			System.out.println("Conexion OK");
			PreparedStatement pr; // ejecutar codigo sql
			//INSERTAR UN NUEVO USUARIO
			Scanner sc = new Scanner(System.in);
			String insertar_usuario = "INSERT INTO USUARIO VALUES(?,?,?,?)";
			System.out.println("Alias: ");
			String usuario = sc.next();
			System.out.println("Nombre: ");
			String nombre = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Contraseña: ");
			String password = sc.next();
			sc.close();
			
			pr = c.getConexion().prepareStatement(insertar_usuario);
			pr.setString(1, usuario);
			pr.setString(2, nombre);
			pr.setString(3, email);
			pr.setString(4, password);
			pr.executeUpdate();//aqui recien ejecutamos
			pr.close();
			String sentencia = "SELECT ALIAS, NOMBRE, EMAIL  FROM USUARIO";
			pr = c.getConexion().prepareStatement(sentencia);
			ResultSet rs = pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ALIAS") +
						" | "+ rs.getString("NOMBRE") + 
						" | " +rs.getString("EMAIL"));
				System.out.println("------------------------------");
			}
			pr.close();
			c.closeConexion();
		}else {
			System.out.println("Error");
		}
		

	}

}