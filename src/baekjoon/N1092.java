package baekjoon;
import java.util.Scanner;
import java.util.Arrays;
public class N1092 {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int c[]=new int[50];
		int w[]=new int[10000];
		int N,M,time,index,con;
		
		N=scan.nextInt();
		
		for(int i=0;i<N;i++)
		{
			c[i]=scan.nextInt();
		}
		
		M=scan.nextInt();
		
		for(int i=0;i<M;i++)
		{
			w[i]=scan.nextInt();
		}
		
		Arrays.sort(c,0,N);
		Arrays.sort(w,0,M);
		time=0;
		
		while(true)
		{
			if(c[N-1]<w[M-1]) break;
			con=0;
			for(int i=0;i<N;i++)
			{
				index=-1;
				for(int j=0;j<M;j++)
				{
					if(w[j]==-1) continue;
					
					if(c[i]>=w[j]) index=j;
					else break;
				}
				
				if(index!=-1) w[index]=-1;
			}
			time++;
			
			for(int i=0;i<M;i++)
			{
				if(w[i]!=-1) con=1;
			}
			
			if(con==0) break;
		}
		
		if(time==0) System.out.println("-1");
		else System.out.println(time);
		scan.close();
	}
}
