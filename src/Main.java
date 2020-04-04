import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
				
		System.out.println("Digite os dados:");
		
		Scanner sc = new Scanner(System.in);
		
		int qtnotas = sc.nextInt();
		double media  = 0.0;
						
		for (int i = 0;i < qtnotas;i++) {
			
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			media  = (n1*2.0 + n2*3.0 + n3*5.0) / 10.0;
			
			System.out.printf("%.1f%n",media);
	
		}
				
		sc.close();
	}
}
 