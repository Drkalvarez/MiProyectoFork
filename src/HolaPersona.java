import java.util.Scanner;

public class HolaPersona {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		
		Scanner sc=new Scanner(System.in);
	
		String nombre;
		
		System.out.println("Dame tu nombre:");
		
		nombre=sc.next();
		
		System.out.println("Hola " + nombre);
		
		System.out.println("Bienvenido...");
		
		sc.close();

	}

}
