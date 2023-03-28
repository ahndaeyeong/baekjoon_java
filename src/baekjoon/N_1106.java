package baekjoon;
import java.util.Scanner;

public class N_1106 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int human, city, min;
		int money[] = new int[20];
		int people[] = new int[20];
		human = scan.nextInt();
		city = scan.nextInt();
		int cost[] = new int[human + 100];

		for (int i = 0; i < city; i++) {
			money[i] = scan.nextInt();
			people[i] = scan.nextInt();
		}

		for(int i=0;i<city;i++)
		{
			for(int j=1;j<human+100;j++)
			{
				if(j-people[i]<0)
				{
					if(cost[j]==0)
					{
						cost[j]=money[i];
					}
					else
					{
						cost[j]=cost[j]>money[i]?money[i]:cost[j];
					}
				}
				else
				{
					if(cost[j]==0)
					{
						cost[j]=cost[j-people[i]]+money[i];
					}
					else if(cost[j]>(cost[j-people[i]]+money[i]))
						cost[j]=cost[j-people[i]]+money[i];
				}
			}
		}

		min = cost[human];
		for (int i = human; i < human + 100; i++) {
			if (min > cost[i]&&cost[i]!=0)
				min = cost[i];
		}

		System.out.println(min);
		scan.close();
	}
}
