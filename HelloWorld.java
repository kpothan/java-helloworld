package Sample;

import java.util.Scanner;

import OOPS.Abstract.Car;
import OOPS.Abstract.Sedan;
import Sample.Arthmetic;
public class HelloWorld {
	
 public static void main(String[] args)
 {
	 System.out.println("Hello World");
	 Scanner sc=new Scanner(System.in);
	 Arthmetic arthmetic=new Arthmetic();
	 System.out.println("Enter A value");
	 arthmetic.a=sc.nextInt();
	 System.out.println("Enter B value");
	 arthmetic.b=sc.nextInt();
	 arthmetic.sum= arthmetic.sum();
	 System.out.println("The sum is "+arthmetic.sum);
	 //calling only default constructor
	 Student stu= new Student();
	 stu.print();
	 //Calling parameterized constructor
	 Student stu1= new Student("Keerthana","Potana",6000);
	 stu1.print();
	 int sal=stu1.getSalary();
	 System.out.println(sal);
	 
	 //taking values from keyboard and calling default constructor
	 Student stu2= new Student();
	 //Scanner sc = new Scanner(System.in);
	 System.out.println("Enter first Name : ");
	 stu2.firstName=sc.next();
	 System.out.println("Enter last Name : ");
	 stu2.lastName=sc.next();
	 System.out.println("Enter Salary: ");
	 stu2.sal=sc.nextInt();
	 stu2.print();
	 
	 stu2.sal=10000;
	 int newSalary= stu2.getSalary();
	 System.out.println("New  Salary: " + newSalary);
	 
	 //take values from keyboard and call parameterized constructor
	 
	 System.out.println("Enter first Name : ");
	 String fName=sc.next(); 
	 System.out.println("Enter last Name : ");
	 String lName=sc.next();
	 
	 Student stu3= new Student(fName,lName,1000);
	 stu3.print();
	 
 }
}
