package consola;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner s = new Scanner("Mi  casa es de color rojo");
		
//		while(s.hasNext())
//			System.out.println(s.next());
		
		s.close();
		
//		La clase Scanner tiene en cuenta la configuración regional del usuario. 
		Scanner s2 = new Scanner("1 Leche 2,00");
		
		int id = 0;
		if(s2.hasNextInt()) 
			id = s2.nextInt(); 
		
		String producto = s2.next(); 
		double precio = s2.nextDouble(); 
		
		s2.close(); 
		
//		No tiene en cuenta la configuración regional del usuario.
		System.out.println("Código: " + id +
											" Producto: " + producto +
											" Precio: " + precio);
		

	}
}//fin class consola.App
