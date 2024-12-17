import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PersonaRepository {

		static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
		static final String USER ="root";
		static final String PASS="";
		static final String QUERY="SELECT * from Personas";
		
		public void insertar(Persona persona) {
			try {
				Connection conexion=DriverManager.getConnection(DB_URL, USER, PASS);
				Statement sentencia=conexion.createStatement();
				sentencia.executeUpdate("insert into personas values "
						+"('"+persona.getNombre()+"','"+persona.getApellidos()+"','"+persona.getEdad()+"')");
				
				
			}catch (SQLException e) {
				e.printStackTrace();}
			}
			public void delete(Persona persona) {
				try {
					Connection conexion=DriverManager.getConnection(DB_URL, USER, PASS);
					Statement sentencia=conexion.createStatement();
					String consultaBorrar="delete from personas where nombre ='"+persona.getNombre()+"'";
					sentencia.executeUpdate(consultaBorrar);
					//sentencia.executeUpdate("delete from personas where nombre='"+nombre+"'");
					
					
				}catch (SQLException e) {
					e.printStackTrace();
				}

		}
	}
