package consola;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner s = new Scanner("Mi  casa es de color rojo");

		// while(s.hasNext())
		// System.out.println(s.next());

		s.close();

		// La clase Scanner tiene en cuenta la configuración regional del
		// usuario.
		Scanner s2 = new Scanner("1 Leche 2,00");

		int id = 0;
		if (s2.hasNextInt())
			id = s2.nextInt();

		String producto = s2.next();
		double precio = s2.nextDouble();

		s2.close();

		// No tiene en cuenta la configuración regional del usuario.
		// System.out.println("Código: " + id +
		// " Producto: " + producto +
		// " Precio: " + precio);

		// Leer de un fichero de String con Scanner
		try {
			Scanner s3 = new Scanner(new File("datos.txt"));
			s3.useDelimiter(";|\\r\\n"); 
			
			while(s3.hasNextInt()){
				int id2 = s3.nextInt();
				String producto2 = s3.next(); 
				double precio2 = s3.nextDouble(); 
				
				System.out.println(
						"Id:"+ id2 + 
						" Producto:" + producto2 +
						" Precio:" + precio2 ); 
			}
			s3.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		Leer desde el teclado
		Scanner teclado = new Scanner(System.in); 
		teclado.useLocale(new Locale("es","ES")); 
		boolean finalizar = false; 
		
		while(!finalizar && teclado.hasNext()){
//			idioma en minúscula y 
//			país en mayúsculas
			double cadena = teclado.nextDouble(); 

			finalizar = true;
//			System.out.println(cadena);
			System.out.printf("Valor: %.2f", cadena); 
		}
		teclado.close();
		
//		Definir un locale para la App
		Locale.setDefault(new Locale("en", "GB"));
	}
}// fin class consola.App
