import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Cie0 {

	public static void main(String[] args) {
	
		Path ruta=Paths.get("fichero.txt");
		try {
			List<String> lineas= Files.readAllLines(ruta);
			for (String linea: lineas) {
				System.out.println(linea);
				}
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}