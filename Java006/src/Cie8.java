import java.util.Scanner;

public class Cie8 {

public static void main(String[] args) {
		
		FacturaRepository repo=new FacturaRepository();
		Scanner sc=new Scanner (System.in);
		System.out.println("¿Qué numero de factura quieres borrar?");
		int numero=sc.nextInt();
		Factura f= new Factura (numero);
		repo.delete(f);
		System.out.println("Elemento borrado de la base de datos");
		

	}

}
