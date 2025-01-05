package exercicios;

import java.util.Scanner;

public class programMatrizes2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("M: ");
		int m = sc.nextInt();
		System.out.print("N: ");
		int n = sc.nextInt();
		int[][] matriz = new int[m][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		char resp;
		
		do {

			System.out.println("\nQual valor deseja achar? ");
			mostrarMatriz(matriz);
			System.out.print(" >> ");
			int valor = sc.nextInt();

			boolean temValor = valorExiste(matriz, valor);
			while (!temValor) {
				System.out.println("\nValor nao existe!");
				System.out.print("Qual valor deseja achar? ");
				valor = sc.nextInt();
				temValor = valorExiste(matriz, valor);
			}

		
			

			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (matriz[i][j] == valor) {
						System.out.printf("\nPosicao %d, %d:\n", i, j);
						if (posicaoEsquerda(matriz, j))
							System.out.printf(" Esquerda: %d\n", matriz[i][j - 1]);
						if (posicaoDireita(matriz, j, i))
							System.out.printf(" Direita: %d\n", matriz[i][j + 1]);
						if (posicaoAbaixo(matriz, i))
							System.out.printf(" Abaixo: %d\n", matriz[i + 1][j]);
						if (posicaoAcima(matriz, i))
							System.out.printf(" Acima: %d\n", matriz[i - 1][j]);
					}
				}
			}

			System.out.print("\nDeseja fazer outra procura (s/n)?\n ");
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');

		System.out.println("\nFim do programa");

		sc.close();
	}

	static public boolean valorExiste(int[][] matriz, int valor) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == valor)
					return true;
			}
		}
		return false;
	}

	static public void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%d ", matriz[i][j]);
			}
			System.out.println();
		}
	}

	static public boolean posicaoEsquerda(int[][] matriz, int coluna) {
		return coluna == 0 ? false : true;
	}

	static public boolean posicaoDireita(int[][] matriz, int coluna, int tamanho) {
		return coluna == matriz[tamanho].length - 1 ? false : true;
	}

	static public boolean posicaoAcima(int[][] matriz, int linha) {
		return linha == 0 ? false : true;
	}

	static public boolean posicaoAbaixo(int[][] matriz, int linha) {
		return linha == matriz.length - 1? false : true;
	}
}
