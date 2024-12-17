import java.util.Scanner;

public class Cie5 {

	public static void main(String[] args) {
		
		PersonaRepository repo=new PersonaRepository();
		Scanner sc=new Scanner (System.in);
		System.out.println("Inserte nombre");
		String nombre=sc.next();
		System.out.println("Inserte apellido");
		String apellido=sc.next();
		System.out.println("Inserte una edad");
		int edad=sc.nextInt();
		Persona p=new Persona(nombre, apellido, edad);
		repo.insertar(p);
		System.out.println("Insertado en la base de datos");

	}

}
