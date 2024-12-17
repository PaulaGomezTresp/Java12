import java.util.Scanner;

public class Cie2 {

	public static void main(String[] args) {
		
		PersonaRepositoryVieja repo=new PersonaRepositoryVieja();
		Scanner sc=new Scanner (System.in);
		System.out.println("Inserte nombre");
		String nombre=sc.next();
		System.out.println("Inserte apellido");
		String apellido=sc.next();
		System.out.println("Inserte edad");
		int edad=sc.nextInt();
		repo.insertar(nombre,apellido, edad);
	

	}

}
