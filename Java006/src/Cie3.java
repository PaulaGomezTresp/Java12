import java.util.Scanner;

public class Cie3 {

	public static void main(String[] args) {
		
		PersonaRepositoryVieja repo=new PersonaRepositoryVieja();
		Scanner sc=new Scanner (System.in);
		System.out.println("¿Qué nombre quieres borrar?");
		String nombre=sc.next();
		repo.delete(nombre);
	}
	Scanner close;
}
