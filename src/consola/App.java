package consola;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner s = new Scanner("Mi  casa es de color rojo");
		
		while(s.hasNext())
			System.out.println(s.next());
		
		s.close();
	}
}//fin class consola.App
