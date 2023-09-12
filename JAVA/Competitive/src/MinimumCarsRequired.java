import java.util.Scanner;

public class MinimumCarsRequired {

	public static void main(String[] args) {
		//https://www.codechef.com/problems/MINCARS
		//608

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int sal = (int) Math.ceil((float) n/4);
			System.out.println(sal);
		}
		
	}

}
