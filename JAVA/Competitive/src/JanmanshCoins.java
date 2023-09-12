import java.util.Scanner;

public class JanmanshCoins {

	public static void main(String[] args) {
		//https://www.codechef.com/problems/JCOINS
		//527

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt() * 10;
			int y = sc.nextInt() * 5;
			System.out.println(x+y);
		}
		
	}

}
