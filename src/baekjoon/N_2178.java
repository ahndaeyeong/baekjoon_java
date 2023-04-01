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
			x=queueX.poll();
			y=queueY.poll();
			
			if(x>0&&arr[0][y][x-1]==1)
			{
				if(arr[1][y][x-1]==0)
				{
					arr[1][y][x-1]=arr[1][y][x]+1;
					queueY.add(y);
					queueX.add(x-1);
				}
			}
			
			if(x<m-1&&arr[0][y][x+1]==1)
			{
				if(arr[1][y][x+1]==0)
				{
					arr[1][y][x+1]=arr[1][y][x]+1;
					queueY.add(y);
					queueX.add(x+1);
				}
			}
			
			if(y>0&&arr[0][y-1][x]==1)
			{
				if(arr[1][y-1][x]==0)
				{
					arr[1][y-1][x]=arr[1][y][x]+1;
					queueY.add(y-1);
					queueX.add(x);
				}
			}
			
			if(y<n-1&&arr[0][y+1][x]==1)
			{
				if(arr[1][y+1][x]==0)
				{
					arr[1][y+1][x]=arr[1][y][x]+1;
					queueY.add(y+1);
					queueX.add(x);
				}
			}
		}
		

		System.out.println(arr[1][n-1][m-1]+1);
		  scan.close();
		

	}
}
