package ksnu.a1901128.study;

public class Subject {
	String sname[];
	int num[];
	int count;
	
	
	public Subject(int ncount,int scount)
	{
		sname=new String[ncount];
		num=new int[scount];
		count=ncount;
	}
	
	public void totalSum()
	{
		int sum=0;
		for(int i=0;i<count;i++)
		{
			sum+=num[i];
		}
		System.out.println("성적평균 "+(double)sum/count+"점");
	}
	
	public void all()
	{
		for(int i=0;i<count;i++)
		{
			System.out.print(num[i]+"   ");
		}
		System.out.println();
	}
	
	public void glist()
	{
		for(int i=0;i<count;i++)
		{
			System.out.print(sname[i]+"  ");
		}
	}
}
