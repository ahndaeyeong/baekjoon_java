package baekjoon;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class N1697 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Queue<Integer> que=new LinkedList();
		int N,K,a;
		int time[]=new int[100001];
		int check[]=new int[100001];
		N=scan.nextInt();
		K=scan.nextInt();
		
		que.add(N);
		
		while(que.isEmpty()==false)
		{
			a=que.poll();
			if(a==K) break;
			
			if(a-1>=0&&check[a-1]==0)
			{
				check[a-1]=1;
				time[a-1]=time[a]+1;
				que.add(a-1);
			}
			
			if(a+1<=100000&&check[a+1]==0)
			{
				check[a+1]=1;
				time[a+1]=time[a]+1;
				que.add(a+1);
			}
			
			if(a*2<=100000&&check[a*2]==0)
			{
				check[a*2]=1;
				time[a*2]=time[a]+1;
				que.add(a*2);
			}
				
		}
		
		System.out.println(time[K]);
		
		
		scan.close();
		
	}

}
