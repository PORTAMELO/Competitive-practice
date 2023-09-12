import java.util.Scanner;

public class CricketMatch {

	public static void main(String[] args) {
		//https://www.codechef.com/problems/CRICMATCH
		//505
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if ((m*6*6) >= n) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		
	}

}
