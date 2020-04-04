package application;

import java.util.Scanner;

public class exmatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas e colunas: ");
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		int[][] mat = new int[linha][coluna];
		
		System.out.println("Digite os números da matriz: ");
		for (int i=0 ; i<linha ; i++) {
			for (int j=0 ; j<coluna ; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite o número a ser localizado: ");
		int n = sc.nextInt();
		
		for (int i=0 ; i<linha ; i++) {
			for (int j=0 ; j<coluna ; j++) {
				if (n == mat[i][j]) {
					System.out.println("Position: " + i + "," + j);
					
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j < coluna - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (i < linha - 1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
