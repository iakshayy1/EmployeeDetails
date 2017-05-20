/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;
import java.util.Scanner;

/**
 *
 * @author Akshay Reddy Vontari
 */
public class EmployeeDriver {
    

public static void main(String[] args){
    // created the employee object with 4 argument constructor
Employee empObject01 = new Employee("Lousie","Adams",34562,"6602240486", "9277 Fairway Drive, Apt#208, Des Plaines, IL");
System.out.println("Employee Details01");
System.out.println("Employee ID: "+empObject01.getEmployeeID());
System.out.println("Name: " + empObject01.getFirstName() +" "+ empObject01.getLastName());
System.out.println("Address: "+empObject01.getAddress());
System.out.println("Contact Number: "+empObject01.getPhoneNumber());
System.out.println("**************************************************\n");
// created the employee object with no-argument constructor
Employee empObject02 = new Employee();
System.out.println("Employee Details02");
System.out.println("Employee ID: "+empObject02.getEmployeeID());
System.out.println("Name: " + empObject02.getFirstName() +" "+ empObject02.getLastName());
System.out.println("Address: "+ empObject02.getAddress());
System.out.println("Contact Number: "+empObject02.getPhoneNumber());
System.out.println("**************************************************\n");
// now set the value of attributes for the empObject02
empObject02.setEmployeeID(12354);
empObject02.setFirstName("Jaden");
empObject02.setLastName("Smith");
empObject02.setPhoneNumber("9494949494");
empObject02.setAddress("1231 University Drive, Apt#60, Kansas, MO");        
System.out.println("Testing toString() method of Employee class:\n"+empObject02.toString());
System.out.println("**************************************************\n");

/*Answer for question no:8 is below:
/*In the Employee class I declared a constructor with no args with default value which is "null" for strings and "0" for all integers.so when we are using empObjects02 object which is with no args.So the program will print null for string and "0" for integer when we call the particular object.if we set the value using setters it will print the value which we have given */

Scanner sc = new Scanner(System.in);
// Created Scanner object to input the values
System.out.println("Testing the EmployeeSalary class:\n");
System.out.print("Enter the hourly pay rate of the Employee : $");
double hourlyRate = sc.nextDouble();
System.out.print("Enter the insurance rate of the Employee in percentage:");
double insuranceRate = sc.nextDouble();
System.out.print("Enter the tax rate of the Employee in percentage:");
double taxrate = sc.nextDouble();
System.out.print("Enter the bonus amount:$ ");
double bonus = sc.nextDouble();
System.out.println("**************************************************\n");
// created the EmployeeSalary object with no-argument constructor
EmployeeSalary EmployeeSalaryObj1 = new EmployeeSalary();
EmployeeSalaryObj1.sethourlyRate(hourlyRate);
EmployeeSalaryObj1.setinsuranceRate(insuranceRate);
EmployeeSalaryObj1.setBonus(bonus);
EmployeeSalaryObj1.settaxRate(taxrate);
System.out.println("Testing the tostring() method of EmployeeSalary class : \n"+EmployeeSalaryObj1.toString());
System.out.println("**************************************************\n");

// created the EmployeeSalary object with no-argument constructor
EmployeeSalary EmployeeSalaryObj2 = new EmployeeSalary();
System.out.println("The details of the EmployeeSalaryObj2 are as follows:\n" +
"Testing the toString() method of EmployeeSalary class :\n"+EmployeeSalaryObj2.toString());
System.out.println("**************************************************\n");
EmployeeSalaryObj2.sethourlyRate(56.72);
EmployeeSalaryObj2.setinsuranceRate(18.40);
EmployeeSalaryObj2.setBonus(8463.77);
EmployeeSalaryObj2.settaxRate(9.65);
System.out.println("Testing the toString() method of EmployeeSalary class : \n"+EmployeeSalaryObj2.toString());
System.out.println(EmployeeSalaryObj2);


 }
}