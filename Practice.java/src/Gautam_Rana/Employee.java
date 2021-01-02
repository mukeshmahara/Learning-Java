//1.	Design a class named Employee. The class should keep the following information in fields:
//●	Employee name
//●	Employee number in the format XXX-L, where each X is a digit within the range 0-9 and the L is a letter within the range A_M.
//●	Hire date
//Write one or more constructors and the appropriate accessor and mutator methods for the class.
//Next, write a class named ProductionWorker that extends the Employee class. The ProductionWorker class should have fields to hold the following information:
//●	Shift (an integer)
//●	Hourly pay rate (double)
//The workday is divided into two shifts: day and night. The shift field will be an integer value representing the shift that the employee works. The day shift is shift 1 and the night shift is shift 2. Write one or more constructors and the appropriate accessor and mutator methods for the class. Demonstarte the classes by writing a program that uses a ProductionWorker object.

//Note : 65 - 77 Asci value for the range A-M
package Gautam_Rana;

//import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//import com.sun.tools.classfile.StackMapTable_attribute.same_frame;

public class Employee {
	String Emp_name;
	int emp_number;
	Date hire_Date;
	Scanner s = new Scanner(System.in);
//	Calendar hire_date;

	

	@SuppressWarnings("deprecation")
	public Employee() {

		this.Emp_name = s.next();

		System.out.println("Enter hire date of Employee (YY:MM:DD) format :");
		int year, month, day;
		System.out.println("Year :");
		year = s.nextInt();
		System.out.println("Month :");
		month = s.nextInt();
		System.out.println("Day :");
		day = s.nextInt();

		hire_Date = new Date(year, month - 1, day, 12, 0, 30);

		System.out.println("Hire Date :" + hire_Date);

		System.out.println("Employee is number is :" + (int) (Math.random() * 1000) + "-"
				+ (char) (int) (Math.random() * (77 - 65 + 1) + 65));

	}

	public String getName() {
		return Emp_name;
	}

	public void setName(String name) {
		this.Emp_name = name;
	}

	public int getEmp_number() {
		return emp_number;
	}

	public void setEmp_number(int emp_number) {
		this.emp_number = emp_number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Employee name :");
		ProductionWorker pWorker = new ProductionWorker();

	}
}


class ProductionWorker extends Employee {

	int shift;
	double hourly_pay_rate;

	public ProductionWorker() {

		super();

		System.out.println("Enter the shift of the employee :");
		shift = s.nextInt();

		if (shift == 1) {
			System.out.println("Employee works in Day Shift");
		} else if (shift == 2) {
			System.out.println("Employee works in Night Shift");
		} else {
			System.out.println("unknow shift of working employee");
		}

		System.out.println("Enter hourly pay rate of Employee :");
		hourly_pay_rate = s.nextDouble();
	}

}
