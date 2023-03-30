package baekjoon;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class N_2178 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, m,index,x,y;
		String str;
		Queue<Integer> queueX=new LinkedList<>();
		Queue<Integer> queueY=new LinkedList<>();

		n = scan.nextInt();
		m = scan.nextInt();
		int arr[][][] = new int[2][n][m];
		

		for (int i = 0; i < n; i++) {
			str = scan.next();
			for (int j = 0; j < m; j++) {
				arr[0][i][j] = Integer.parseInt(str.substring(j, j + 1));
				arr[1][i][j]=0;
			}
		}
		
		
		
		queueX.add(0);
		queueY.add(0);
		
		while(queueX.isEmpty()==false)
		{
			
		}
		

		
		  scan.close();
		

	}
}
