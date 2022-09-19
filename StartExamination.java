package com.Project;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StartExamination {
	public int getStartExam(String StudentName,String Password) throws SQLException
	{
		int score=0;
		Scanner scanner=new Scanner(System.in);
		GradeTest gradeTest=new GradeTest();
		try {
			ArrayList<Integer> al=new ArrayList<Integer>();
			for(int i=1;i<=10;i++)
			{
				al.add(i);
			}
			Collections.shuffle(al);
			for(int i=0;i<10;i++)
			{
				int Answer=1;
				int StudentAnswer=scanner.nextInt();
				System.out.println("------------------------------");
				if(StudentAnswer==Answer)
				{
					score++;
				}
			}
		System.out.println("                      ");
		System.out.println("Congratulations,Your Exam is Completed");
		System.out.println("                                 ");
	}
	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return score;
	}
}
