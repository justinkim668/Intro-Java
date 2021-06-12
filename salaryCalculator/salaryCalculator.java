import java.util.Scanner;

public class salaryCalculator{
  public static double calcSalary(double hours,
                                  double hourlyRate,
                                  double vacationDays){
    double yearlySalary = hours*hourlyRate*52;
    double timeOff = hours*8*vacationDays;
    double totalYearlySalary = yearlySalary - timeOff;
    return totalYearlySalary;
  }
  public static void main(String[] args){
    double salary = calcSalary(40, 25, 20);
    System.out.println("The employee's yearly salary is " + salary);
  }
}
