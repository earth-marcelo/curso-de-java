import java.util.Locale;
import java.util.Scanner;

public class uri1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		//double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		//triangulo = A * C / 2.0;
		//circulo = 3.14159 * C * C;
		//trapezio = (A + B) / 2.0 * C;
		//quadrado = B * B;
		//retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.2f%n", A * C / 2.0);
		System.out.printf("CIRCULO: %.2f%n", 3.14159 * C * C);
		System.out.printf("TRAPEZIO: %.2f%n", (A + B) / 2.0 * C);
		System.out.printf("QUADRADO: %.2f%n", B * B);
		System.out.printf("RETANGULO: %.2f%n", A * B);
		
		sc.close();

	}

}
