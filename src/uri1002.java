import java.util.Locale;
import java.util.Scanner;

public class uri1002 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double R, A, pi = 3.14159;

		System.out.println("Digite o valor do raio em metros");
		R = sc.nextDouble();

		A = pi * R * R;

		
		System.out.printf("A area tem %.2f metros quadrados %n", A);

		sc.close();

	}

}
