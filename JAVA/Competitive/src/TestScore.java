import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		//https://www.codechef.com/problems/CHEFSCORE
		//610
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (n*x >= y && y % x == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
