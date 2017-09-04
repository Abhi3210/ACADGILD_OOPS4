import java.util.*;
class Student{
	private String name;
	private long phoneNo;
	private int rollNo;
	private String standard;
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public long getPhnoeNo(){
		return this.phoneNo;
	}
	public void setPhoneNo(long phoneNo){
		this.phoneNo=phoneNo;
	}
	public int getRollNo(){
		return this.rollNo;
	}
	public void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}
	public String getStandard(){
		return this.standard;
	}
	public void setStandard(String standard){
		this.standard=standard;
	}
	
	public void studentInfo(){
		System.out.println("Name of the Student is :"+getName());
		System.out.println("PhoneNo of the Student is :"+getPhnoeNo());
		System.out.println("RollNo of the Student is :"+getRollNo());
		System.out.println("Standard of the Student is :"+getStandard());
		
	}
	
	public String result(int a,int b,int c,int rollNo){
		int avg=(a+b+c)/3;
		String s="Fail";
		if(avg>=50){
			s="Pass";
			return s;
		}
		else
			return s;
	}
	
}
public class StudentResultProcessing extends Student {
          public static void main(String args[]){
            	  Scanner sc=new Scanner(System.in);
            	  System.out.println("Enter name of Student");
            	//  sc.nextLine();
            	  String name=sc.next();
            	  System.out.println("Enter Phone No of Student");
            	  long phoneNo=sc.nextLong();
            	  System.out.println("Enter RollNo of Student");
            	  int rollNo=sc.nextInt();
            	  System.out.println("Enter Standard of Student");
            	  sc.nextLine();
            	  String standard=sc.next();
            	  System.out.println("Enter the marks of Subjects a,b,c");
            	  int a=sc.nextInt();
            	  int b=sc.nextInt();
            	  int c=sc.nextInt();
          StudentResultProcessing sp=new StudentResultProcessing();  
            	sp.setName(name);  
            	sp.setPhoneNo(phoneNo);
            	sp.setRollNo(rollNo);
            	sp.setStandard(standard);
            	sp.studentInfo();
            	String result=sp.result(a, b, c, rollNo);
            	System.out.println(result);
              }
}
