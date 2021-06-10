import java.util.*;
public class Ejercicio8{
	public static void main(String[] args) {
		String salir = "N";
		Scanner scan = new Scanner(System.in);
		do {
			Random ale = new Random();
			int numrandom = ale.nextInt(101);
			numrandom = numrandom*5;
			System.out.println(numrandom);
			System.out.println("Si desea salir pulse (s), si no pulse cualquier letra");
			salir = scan.nextLine();
		} while (!salir.equals("s"));
		System.out.println("Hasta pronto");
	}
}