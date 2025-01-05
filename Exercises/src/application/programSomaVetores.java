package application;

import java.util.Scanner;

public class programSomaVetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vectA.length; i++) {
			int val = sc.nextInt();
			vectA[i] = val;
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vectB.length; i++) {
			int val = sc.nextInt();
			vectB[i] = val;
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}
}
