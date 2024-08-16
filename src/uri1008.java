import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    double valorHora, salario;

	    System.out.println("Digite o número do funcionário");
	    numero = sc.nextInt();
	    System.out.println("Digite o número de horas trabalhadas");
	    horas = sc.nextInt();
	    System.out.println("Digite o valor por hora trabalhada");
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
