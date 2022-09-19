package com.Project;

import java.sql.SQLException;
import java.util.Scanner;

public class GetResult {
	public void getResult() throws SQLException
	 {
		 try
		 {
			 Scanner scanner=new Scanner(System.in);
			 System.out.println("Enter the UserName");
			 String Name=scanner.next();
			 System.out.println("Enter the Password");
			 String Password=scanner.next();
			 StartExamination startExamination=new StartExamination();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
}
}