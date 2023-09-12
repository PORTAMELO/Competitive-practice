import java.util.Scanner;

public class OddSumPair {

	public static void main(String[] args) {
		//https://www.codechef.com/problems/ODDSUMPAIR
		//506
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if ((a+b) % 2 != 0 || (a+c) % 2 != 0 || (c+b) % 2 != 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
