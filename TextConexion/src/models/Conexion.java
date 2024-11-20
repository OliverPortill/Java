package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private Connection conn;
	String connector = "com.mysql.cj.jdbc.Driver";
	String user = "root";
	String pass = "root";
	String url = "jdbc:mysql://localhost:3306/cursojava2_bd";
	
	public Conexion() throws ClassNotFoundException, SQLException{
		Class.forName(connector);
		conn =  DriverManager.getConnection(url, user, pass);
	}
	
	public Connection getConexion() {
		return conn;
	}
	
	public void closeConexion() throws SQLException {
		conn.close();
	}
	
}