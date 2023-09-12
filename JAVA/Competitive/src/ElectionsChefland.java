import java.util.Scanner;

public class ElectionsChefland {

	public static void main(String[] args) {
		//https://www.codechef.com/problems/ELECTN
		//604
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int numPersonas = sc.nextInt();
			int edadMinima = sc.nextInt();
			int cont = 0;
			for (int j = 0; j < numPersonas; j++) {
				int aux = sc.nextInt();
				if (aux >= edadMinima) {
					cont++;
				}
			}
			System.out.println(cont);
		}

	}

}
