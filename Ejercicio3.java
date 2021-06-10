import java.util.* ;
public class Ejercicio3{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero;
		int factorial = 1;
		
		System.out.println("");
		System.out.println("*********Ejercicio3************");
		System.out.println("");
        System.out.println("Ingrese un numero para sacarle el factorial");
		numero = scanner.nextInt();
		
		for (int i = 1; i <= numero; i++){
			factorial = factorial * i;
		}
		System.out.println("El factorial de " + numero + " es: " + factorial);
	}
}