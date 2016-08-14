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
//		System.out.println("Código: " + id +
//											" Producto: " + producto +
//											" Precio: " + precio);
		
//		Leer de un fichero de String con Scanner
		try {
			Scanner s3 = new Scanner( new File("datosString.txt") );
			
			int lineNumber = 1; 
			while(s3.hasNextLine()){
				String line = s3.nextLine();
				
//				System.out.println("Line " + lineNumber +
//											": " + line);
				lineNumber++; 
			}
			s3.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
//		Leer fichero con Scanner, split y String[ ]
		String csvFile = "datos.txt"; 
		String csvSeparator = ";"; 
		String[] line = null;
		try {
			Scanner s4 = new Scanner(new File(csvFile));
			
			while (s4.hasNextLine()){
				line = s4.nextLine().split(";"); 
				
				System.out.println("Id: " +line[0] + " Producto: "+line[1]+ " Precio: "+line[2]);
			}
			s4.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}//fin class consola.App
