import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FacturaRepository {

	static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	static final String USER ="root";
	static final String PASS="";
	static final String QUERY="SELECT * from Facturas";
	
	public void insertar(int numero, String concepto, double importe) {
		try {
			Connection conexion=DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia=conexion.createStatement();
			sentencia.executeUpdate("insert into personas values ('"+numero+"','"+concepto+"','"+importe+"')");
			
			
		}catch (SQLException e) {
			e.printStackTrace();}
		}
		
		public void delete(int numero) {
			try {
				Connection conexion=DriverManager.getConnection(DB_URL, USER, PASS);
				Statement sentencia=conexion.createStatement();
				String consultaBorrar="delete from facturas where numero = '"+numero+"'";
				sentencia.executeUpdate(consultaBorrar);
				
				
				
			}catch (SQLException e) {
				e.printStackTrace();
			}



}

}
