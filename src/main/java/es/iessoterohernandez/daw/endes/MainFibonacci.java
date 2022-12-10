package es.iessoterohernandez.daw.endes;

import java.util.Scanner;



public class MainFibonacci{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		System.out.print("Entre la longitud de la serie: ");
		Fibonacci f = new Fibonacci(sc.nextInt());

		do{
			System.out.println("\nSucesión FIBONACCI");
			System.out.println("\n1 - Mostrar sucesión");
			System.out.println("2 - Cambiar longitud");
			System.out.println("3 - Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				f.mostrarSucesion();
				break;
			case 2:
				System.out.print("\nNueva longitud: ");
				f.setLongitud(sc.nextInt());
				break;
			case 3:
				System.out.println("\nFin de programa");
				break;
			default:
				System.out.println("\nOpción equivocada");
			}
			System.out.println("\n----------------------");
		 }while (opcion != 3);
		sc.close();
	}

}
