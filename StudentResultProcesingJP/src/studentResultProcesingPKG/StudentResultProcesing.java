package studentResultProcesingPKG;

import java.util.Scanner;

public class StudentResultProcesing extends Student{

	public static void main(String[] args) {

		// Declared variables for student1
		String sName1=null;
		long sPhoneNum1=0;
		int sRollNum1=0;
		String sClassDiv1=null;	
		String sResult1=null;
		
		// Declared variables for student2
		String sName2=null;
		long sPhoneNum2=0;
		int sRollNum2=0;
		String sClassDiv2=null;	
		String sResult2=null;
		
		// Declared variables for student3
		String sName3=null;
		long sPhoneNum3=0;
		int sRollNum3=0;
		String sClassDiv3=null;	
		String sResult3=null;
		
		Student s = new Student();                                    // Creating a object of a student class
		
		// Using Scanner to take dynamic/runtime values for parameters
		        
        Scanner input = new Scanner(System.in);   
        
		// for loop to handle/take multiple dynamic inputs - 3 Students in this code	
		for (int numOfStu=1; numOfStu <=3 ; numOfStu++)
		{
			if (numOfStu > 1)           // To avoid the skip to next line as it is a String input for the 2nd/3rd time of the loop
			{
				input.nextLine();
			}
			
			// Printing user action information
			if (numOfStu == 1)                
			{
				System.out.println();
				System.out.println("Enter First Student Below Information");
				System.out.println("-------------------------------------");
			}
			else if (numOfStu == 2)
			{
				System.out.println();
				System.out.println("Enter Second Student Below Information");
				System.out.println("--------------------------------------");
			}
			else
			{
				System.out.println();
				System.out.println("Enter Third Student Below Information");
				System.out.println("-------------------------------------");
			}
			
			// Taking dynmic inputs and passing to setter methods of a Student class
			
			System.out.println("Name : ");
			s.setName(input.nextLine());
				
			System.out.println("Phone Number");
			s.setPhoneNum(input.nextLong());
				
			System.out.println("Roll Number");
			int sRollNum = input.nextInt();
			s.setRollNum(sRollNum);
				
			System.out.println("Class/Division");
			input.nextLine();                                 // To avoid the skip to next line as it is a String input for the 2nd time
			s.setClassDiv(input.nextLine());
					
			System.out.println("1st Subject Marks:");
			int sMarks1 = input.nextInt();
				
			System.out.println("2nd Subject Marks");
			int sMarks2 = input.nextInt();
				
			System.out.println("3rd Subject Marks");
			int sMarks3 = input.nextInt();
			
			// Dynamically getting student information and assigning it to the respective variables
				if (numOfStu == 1)
				{
				// Student 1 information and result
				sName1 = s.getName();
				sPhoneNum1 = s.getPhoneNum();
				sRollNum1 = s.getRollNum();
				sClassDiv1 = s.getclassDiv();	
				sResult1 = s.result(sRollNum1, sMarks1, sMarks2, sMarks3);
				}
				else if (numOfStu == 2)
				{
				// Student 2 information and result
				sName2 = s.getName();
				sPhoneNum2 = s.getPhoneNum();
				sRollNum2 = s.getRollNum();
				sClassDiv2 = s.getclassDiv();	
				sResult2 = s.result(sRollNum2, sMarks1, sMarks2, sMarks3);
				}
				else 
				{
					// Student 3 information and result
				sName3 = s.getName();
				sPhoneNum3 = s.getPhoneNum();
				sRollNum3 = s.getRollNum();
				sClassDiv3 = s.getclassDiv();	
				sResult3 = s.result(sRollNum3, sMarks1, sMarks2, sMarks3);			
		        }
			}
			
		// Prinintng welcome note and required output
		System.out.println();
		System.out.println("***************************************************");
		System.out.println("* Welcome To The Student Board Exam Result Portal *");
		System.out.println("***************************************************");
		System.out.println();
			
	    System.out.println("Name: "+sName1+" Phone Number: "+sPhoneNum1+" Roll Number: "+sRollNum1+" Class/Division: "+sClassDiv1+" Result: "+sResult1);
		System.out.println("Name: "+sName2+" Phone Number: "+sPhoneNum2+" Roll Number: "+sRollNum2+" Class/Division: "+sClassDiv2+" Result: "+sResult2);
		System.out.println("Name: "+sName3+" Phone Number: "+sPhoneNum3+" Roll Number: "+sRollNum3+" Class/Division: "+sClassDiv3+" Result: "+sResult3);
		input.close();                    // Closing the scanner

	}

}
