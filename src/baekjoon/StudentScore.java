package ksnu.a1901128.study;

import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentScore {
    public void printMenu() {
        System.out.println("<성적처리 프로그램>");
        System.out.println("1.학생 정보 입력하기");
        System.out.println("2.학생 정보보기");
        System.out.println("3.과목 입력하기");
        System.out.println("4.성적 입력하기");
        System.out.println("5.성적 보기");
        System.out.println("6.성적 수정하기");
        System.out.println("7.평균 성적보기");
        System.out.println("0.메인메뉴 돌아가기");
    }
    
    public static void main(String []args)
    {
    	Scanner scan=new Scanner(System.in);
    	
    	String name,phone;
    	int id;
    	int s1,s2,s3;
    	int select;
    	int totalStudent=0;
    	int totalSubject=0;
    	StudentScore ss=new StudentScore();
    	Student stu[]=null;
    	
    	ss.printMenu();
    	
    	while(true)
    	{
    		try {
    		System.out.print("선택> ");
    		select=scan.nextInt();
    		}catch(InputMismatchException e)
    		{
    			scan.next();
    			select=-1;
    		}
    		
    		switch(select)
    		{
    		case 1:
    			System.out.print("몇 명의 학생 정보를 입력하시겠습니까> ");
    			totalStudent=scan.nextInt();
    			stu=new Student[totalStudent];
    			for(int i=0;i<totalStudent;i++)
    			{
    				System.out.print("이름> ");
    				name=scan.next();
    				System.out.print("학번 >");
    				id=scan.nextInt();
    				System.out.print("전화번호 >");
    				phone=scan.next();
    				stu[i]=new Student(name,id,phone);
    			}
    			break;
    		case 2:
    			System.out.println("학생 정보보기");
    			System.out.print("학생 선택(이름)>");
    			name=scan.next();
    			for(int i=0;i<totalStudent;i++)
    			{
    				if(stu[i].name.equals(name))
    				{
    					stu[i].get();
    					break;
    				}
    			}
    			break;
    		case 3:
    			System.out.println("과목 입력하기");
    			System.out.print("과목개수 > ");
    			totalSubject=scan.nextInt();
    			for(int i=0;i<totalStudent;i++)
    			{
    				stu[i].creatScore(totalSubject);
    			}
    			System.out.print("과목이름 > ");
    			
    			for(int i=0;i<totalSubject;i++)
    			{
    				name=scan.next();
    				for(int k=0;k<totalStudent;k++)
    				{
    					stu[k].inputName(name, i);
    				}
    			}
    			break;
    		case 4:
    			System.out.println("성적 입력");
    			System.out.print("학생 성적(이름)> ");
    			name=scan.next();
    			for(int i=0;i<totalStudent;i++)
    			{
    				if(stu[i].name.equals(name))
    				{
    					System.out.print("성적 입력: ");
    					for(int k=0;k<totalSubject;k++)
    					{
    						s1=scan.nextInt();
    						stu[i].inputScore(s1, k);
    					}
    				}
    			}
    			break;
    		case 5:
    			System.out.println("성적 보기");
    			System.out.print("index     ");
    			stu[0].getlist();
    			System.out.println();
    			for(int i=0;i<totalStudent;i++)
    			{
    				stu[i].getScore();
    			}
    			break;
    		case 6:
    			System.out.println("성적 수정하기");
    			System.out.print("학생 선택(이름)>");
    			name=scan.next();
    			for(int i=0;i<totalStudent;i++)
    			{
    				if(stu[i].name.equals(name))
    				{
    					System.out.print("현재 : ");
    					stu[i].getScore();
    					System.out.print("새로운 성적: ");
    					for(int k=0;k<totalSubject;k++)
    					{
    						s1=scan.nextInt();
    						stu[i].inputScore(s1, k);
    					}
    				}
    			}
    			break;
    		case 7:
    			System.out.println("평균 성적보기");
    			System.out.print("학생 선택(이름)>");
    			name=scan.next();
    			for(int i=0;i<totalStudent;i++)
    			{
    				if(stu[i].name.equals(name))
    				{
    					stu[i].average();
    				}
    			}
    			break;
    		case 0:
    			ss.printMenu();
    			break;
    		}
    		
    	
    			
    		
    	}
    }
    
}
