package exercicios;
import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int horas = sc.nextInt();
		double valHora = sc.nextDouble();
		
		System.out.printf("\nNUMBER = %d\n", num);
		System.out.printf("SALARY = U$ %.2f", horas * valHora);
		
		sc.close();
	}
}
