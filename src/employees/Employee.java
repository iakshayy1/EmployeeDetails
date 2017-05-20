/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author Akshay Reddy Vontari
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private String phoneNumber;
    private String address;
    
    /**
     * constructor Employee with args
     * @param firstName First name of the employee
     * @param lastName Last name of the employee
     * @param employeeID ID of the employee
     * @param phoneNumber Phone number of the employee
     * @param address Address of the employee
     */
    public Employee(String firstName, String lastName, int employeeID, String phoneNumber, String address)
    {
    this.firstName = firstName;
    this.lastName = lastName;
    this.employeeID = employeeID;
    this.phoneNumber = phoneNumber;
    this.address = address;
    }

    /**
     *no args constructor of Employee
     */
    public Employee()
    {
        this(null,null,0,null,null);
    }

    /**when we call getters in main method it gives return type 
     *
     * @return 
     * returns the first name of the employee 
     */
    public String getFirstName() 
    {
       return firstName;
    }

    /**when we call getters in main method it gives return type 
     *
     * @return the last name of the employee
     */
    public String getLastName() 
    {
       return lastName;
    }

    /**when we call getters in main method it gives return type 
     *
     * @return the ID number of the employee
     */
    public int getEmployeeID() 
    {
       return employeeID;
    }

    /**when we call getters in main method it gives return type 
     *
     * @return the phone number of the employee
     */
    public String getPhoneNumber() 
    {
       return phoneNumber;
    }

    /**when we call getters in main method it gives return type 
     *
     * @return the address of the employee
     */
    public String getAddress() 
    {
       return address;
    }

    /**When we call setters in the main method it sets the value.
     *
     * @param firstName sets the first name of the employee
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**When we call setters in the main method it sets the value.
     *
     * @param lastName sets the last name of the employee
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**When we call setters in the main method it sets the value.
     *
     * @param employeeID sets the ID number of the employee
     */
    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    /**When we call setters in the main method it sets the value.
     *
     * @param phoneNumber sets the phone number of the employee
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    /**When we call setters in the main method it sets the value.
     *
     * @param address sets the address of the employee
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    /** Returns the string representation of a variable or operation
     * 
     * @return  Returns the string temp when we call toString method in main method
     */
    @Override
    public String toString()
    {
        String temp=firstName+" "+lastName+" with  employeeID: "+employeeID+" , phone number: "+phoneNumber+" and address: "+address;
        return temp;
    } 
     
}

     
      
    

