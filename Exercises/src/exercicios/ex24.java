package exercicios;

import java.util.Scanner;

public class ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			for(int p = 0; p < 3; p++) {
				if(p == 0) System.out.print(i+" ");
				else if(p == 1) System.out.print((int)Math.pow(i, 2)+" "); 
				else System.out.print((int)Math.pow(i, 3)); 	
				}
			System.out.println();
			}
		
		sc.close();
	}
}
