import java.util.Scanner;

public class Cie6 {

	public static void main(String[] args) {
		
		PersonaRepository repo=new PersonaRepository();
		Scanner sc=new Scanner (System.in);
		System.out.println("¿Qué nombre quieres borrar?");
		String nombre=sc.next();
		Persona p= new Persona (nombre);
		repo.delete(p);
		System.out.println("Elemento borrado de la base de datos");
		

	}

	}
