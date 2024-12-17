import java.util.Scanner;

public class Cie7 {

	public static void main(String[] args) {
		
		FacturaRepository repo=new FacturaRepository();
		Scanner sc=new Scanner (System.in);
		System.out.println("Inserte número de factura");
		int numero=sc.nextInt();
		System.out.println("Inserte concepto de factura");
		String concepto=sc.next();
		System.out.println("Inserte importe de factura");
		double importe=sc.nextDouble();
		repo.insertar(numero, concepto, importe);
		System.out.println("Factura incluida en base de datos");

	}

}
