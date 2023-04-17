package ksnu.a1901128.study;

public class Student {
		String name;
		String phone;
		int id;
		Subject score;
		
		
		public Student(String name,int id,String phone)
		{
			this.name=name;
			this.id=id;
			this.phone=phone;
		}
		
		
		public void creatScore(int n)
		{
			score=new Subject(n,n);
		}
		
		public void inputName(String n,int c)
		{
			score.sname[c]=n;
		}
		
		public void inputScore(int s,int c)
		{
			score.num[c]=s;
		}
		
		
		public void get()
		{
			System.out.println("이름 : "+name);
			System.out.println("학번 : "+id);
			System.out.println("전화번호 : "+phone);
			System.out.println();
		}
		
		public void getScore()
		{
			System.out.print(name+"     ");
			score.all();
		}
		public void average()
		{
			score.totalSum();
		}
		
		public void getlist()
		{
			score.glist();
		}
		
}
