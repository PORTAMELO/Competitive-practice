import java.util.Scanner;

public class JanmanshAssignments {

	public static void main(String[] args) {
		//https://www.codechef.com/problems/JASSIGNMENTS
		//513
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			if (x <= 7) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}

}
