import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int numero=0;
		int resultado = 1;
		
		System.out.println("Introduce un número positivo : ");
		numero = teclado.nextInt();
		
		while (numero!=0) {
			
			resultado = resultado * numero;
			numero --;
			
			
		}
	
		System.out.println("El factorial es "+resultado);
	}

}
