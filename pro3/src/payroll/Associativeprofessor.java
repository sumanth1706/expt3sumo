package payroll;

public class Associativeprofessor extends Employee{
	private double basic_pay;
	public Associativeprofessor()
	{
		basic_pay=0;
		
	}
	public Associativeprofessor(String n,long id,String add,String mail,long num,double Bp)
	{
		super(n,id,add,mail,num);
		basic_pay=Bp;
		
	}
	public void printAccount()
	{
		super.printAccount();
		System.out.println("Basic_pay:"+basic_pay);
	}
	public void printstatement()
	{
		double total;
		double total1;
		double total2;
		double total3;
		double gross;
		double net;
		printAccount();
		total=basic_pay*0.97;
		total1=basic_pay*0.1;
		total2=basic_pay*0.12;
		total3=basic_pay*0.001;
		gross=total+total1+total2+total3;
		net=gross-total2-total3;
		System.out.printf("duty allowance:%2f\n",total);
		System.out.printf("Hra:%2f\n",total1);
		System.out.printf("Pf:%2f\n",total2);
		System.out.printf("staff club fund:%2f\n",total3);
		System.out.printf("gross salary is:%2f\n",gross);
		System.out.printf("net salary is:%2f\n",net);
	}

		



		
		
	}




