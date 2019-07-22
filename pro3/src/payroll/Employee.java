package payroll;

public class Employee {
	protected String emp_name;
	protected long emp_id;
	protected String address;
	protected String mail_id;
	protected double mobile_number;
public Employee()
{
	emp_name="name";
	emp_id=123123;
	address="not given";
	mail_id="not given";
	mobile_number=91223377;
}

public Employee(String n,long id,String add,String mail,long num)
{
	emp_name=n;
	emp_id=id;
	address=add; 
	mail_id=mail;
	mobile_number=num;
}

public void printAccount()
{
	System.out.println("Name of the employee:"+emp_name);
	System.out.println("employee ID:"+emp_id);
	System.out.println("Address:"+address);
	System.out.println("Mail of the employee:"+mail_id);
	System.out.println("Mobile number of the employee:"+mobile_number);
}

}








	


