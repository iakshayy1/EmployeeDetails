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
public class EmployeeSalary {
    private double hourlyRate;
    private double Bonus;
    private double insuranceRate;
    private double taxRate;
    private static final int HOURS = 30;
    
    /**EmployeeSalary constructor with args(parameters)
     *
     * @param hourlyRate stores the value of Hourly pay rate of the employee
     * @param bonus stores the value of Bonus amount per annum of the employee
     * @param insuranceRate stores the value of Insurance percentage of the employee
     * @param taxRate stores the value of Tax percentage of the employee
     */
    public EmployeeSalary(double hourlyRate, double bonus, double insuranceRate, double taxRate)
    {
        this.hourlyRate = hourlyRate;
        this.Bonus = bonus;
        this.insuranceRate = insuranceRate;
        this.taxRate = taxRate;
    }
        
    /**
     *no-arg constructor of EmployeeSalary
     */
    public EmployeeSalary()
    {
        this(0.0d,0.0d,0.0d,0.0d);
            
    } 

    /**when we call getters in main method it gives return type
     *
     * @return the value of hourlyRate of the employee salary
     */
    public double gethourlyRate()
    {
        return hourlyRate;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the value of bonus from employee salary
     */
    public double getBonus()
    {
        return Bonus;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the value of insurance rate
     */
    public double getinsuranceRate()
    {
        return insuranceRate;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the value of tax rate on an employee salary
     */
    public double gettaxRate()
    {
        return taxRate;
    }

    /**When we call setters in the main method it sets the value.
     *
     * @param hourlyRate sets the value of hourly rate of the employee
     */
    public void sethourlyRate(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    /**When we call setters in the main method it sets the value.
     *
     * @param Bonus sets the value of bonus
     */
    public void setBonus(double Bonus)
    {
        this.Bonus = Bonus;
    }

    /**When we call setters in the main method it sets the value.
     *
     * @param insuranceRate sets the value of insurance rate in the employee salary
     */
    public void setinsuranceRate(double insuranceRate)
    {
        this.insuranceRate = insuranceRate;
    }

    /**When we call setters in the main method it sets the value.
     *
     * @param taxRate set the value of tax rate in employee salary
     */
    public void settaxRate(double taxRate)
    {
        this.taxRate = taxRate;
    }

    /**on calling method in main method gives return type
     *
     * @return the value of monthly salary of the employee
     */
    public double monthlySalary()
    {
       int weeks = 4;
       double monthlySalary = hourlyRate*weeks* HOURS;
       return monthlySalary;
        
    }

    /**on calling method in main method gives return type
     *
     * @return the value of monthly insurance of the employee
     */
    public double monthlyInsurance()
    {
       double monthlyInsurance = (insuranceRate/100.0)*monthlySalary();
       return monthlyInsurance;
        
    }

    /**on calling method in main method gives return type
     *
     * @return the value of annual gross salary of the employee
     */
    public double annualGrossSalary()
    {
        int months=12;
        double annualGrossSalary  = (monthlySalary()*months)+ Bonus;;
        return annualGrossSalary;
    }

    /**on calling method in main method gives return type
     *
     * @return the value of the annual net pay of the employee
     */
    public double annualNetPay()
    {  
       double MiscTax = 3.2;
       double annualNetPay = (annualGrossSalary()-((annualGrossSalary()*taxRate)/100.0)-(monthlySalary()*12*insuranceRate)/100.0-(annualGrossSalary()*MiscTax/100));
       return annualNetPay;
       
    }
    
    /**Returns the string representation of a variable or operation
     * 
     * @return Returns the operation when we call toString method in main method
     */
    @Override
    public String toString()
    {
         
     return "Hourly pay rate:$"+hourlyRate+", insurance rate:"+insuranceRate+"%, tax:"+taxRate+"%, annual bonus:$"+Bonus+", Hours per week: "+HOURS+"\nThe monthly salary of the Employee is:$"+monthlySalary()+
     "\nThe monthly insurance of the Employee is:$"+monthlyInsurance()+"\nThe annual gross salary of the Employee is:$"+annualGrossSalary()+"\nThe gross annual net pay of the Employee is:$"+annualNetPay();

    
    }
    
        
        
}    
    
    
    

    

