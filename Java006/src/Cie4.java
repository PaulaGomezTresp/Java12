import java.util.Scanner;

public class Cie4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PersonaRepositoryVieja repo=new PersonaRepositoryVieja();
		System.out.println("¿Qué quieres hacer, borrar o añadir personas?");
		String respuesta=sc.next();
		if (respuesta.equals("añadir")) {
			System.out.println("Inserte nombre");
			String nombre=sc.next();
			System.out.println("Inserte apellido");
			String apellido=sc.next();
			System.out.println("Inserte edad");
			int edad=sc.nextInt();
			repo.insertar(nombre, apellido, edad);
			System.out.println("Insertado");
		}else if (respuesta.equals("borrar")){
			System.out.println("¿Qué nombre quieres borrar?");
			String nombre1=sc.next();
			repo.delete(nombre1);
			System.out.println("Borrado");
		}else {
			System.out.println("Método no válido, inserte borrar o añadir");
		}
	}
}
