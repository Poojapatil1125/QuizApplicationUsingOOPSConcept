package com.Project;
import java.sql.SQLException;
import java.util.Scanner;
public class RandomQuestions {
public static void main(String[] args) throws SQLException {
	System.out.println("**************WELCOME TO QUIZ COMPETITION****************");
	System.out.println("             ");
	Scanner scanner=new Scanner (System.in);
	System.out.println("Select the option \n1. Start Examination \n2. Search Result \n3. Show MeritList");
	//Show the function of Application
	System.out.println("        ");
	int Option=scanner.nextInt();
	//Start the exam
		if(Option==1)
		{
			System.out.println("Enter the UserName");
	         String Name=scanner.next();
	         System.out.println("Enter the Password");
	         String Password=scanner.next();
	         StartExamination startExamination=new StartExamination();
	    }
		else if(Option==2)
		{
			GetResult getResult=new GetResult();
			getResult.getResult();
		}
		else if(Option==3)
		{
			try
			{
				StartExamination startExamination=new StartExamination();
            }
			catch(Exception e)
			{
				e.printStackTrace();
			}
}
}
}
