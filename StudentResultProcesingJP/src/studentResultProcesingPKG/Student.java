package studentResultProcesingPKG;

public class Student {

	// Declared private variables
	private String name;
	private long phoneNum;
	private int rollNum;
	private String classDiv;
	
	// Declared and implemented setter methods
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPhoneNum(long phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	public void setRollNum(int rollNum)
	{
		this.rollNum = rollNum;
	}
	public void setClassDiv(String classDiv)
	{
		this.classDiv = classDiv;
	}
	
	// Declared and implemented getter methods
	
	public String getName()
	{
		return name;
	}
	public long getPhoneNum()
	{
		return phoneNum;
	}
	public int getRollNum()
	{
		return rollNum;
	}
	public String getclassDiv()
	{
		return classDiv;
	}
	
	// Declared and implemented result class to return result of a student
	
	public String result(int rollNum, int marks1, int marks2, int marks3)
	{
		if (((marks1+marks2+marks3)/3) > 45)
		{
		   return "PASS";
		}
		else
		{
			return "FAIL";
		}
	}
	
}
