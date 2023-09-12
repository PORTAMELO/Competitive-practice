import java.util.Scanner;

public class TheCoolerDilemma {

	public static void main(String[] args) {
		//https://www.codechef.com/problems/WATERCOOLER1
		//506
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int alquiler = sc.nextInt();
			int compra = sc.nextInt();
			int meses = sc.nextInt();
			
			if ((alquiler * meses) < compra) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}

	}

}
