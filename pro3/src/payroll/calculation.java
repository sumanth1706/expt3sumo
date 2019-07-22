package payroll;

public class calculation {
	public static void main(String[]args) {
		programmer pro;
		Assistantprofessor Asspro;
		Associativeprofessor Asopro;
		professor prof;
		pro=new programmer("raja",30001,"chennai","account@gmail.com",70000001,70001);
		Asspro=new Assistantprofessor("kamal",60001,"chennai","account@gmail.com",90000001,60001);
		Asopro=new Associativeprofessor("kala",80001,"chennai","account@gmail.com",900000001,80001);
		prof=new professor("nithin",90001,"chennai","account@gmail.com",20000001,10001);
		pro.printAccount();
		Asspro.printstatement();
		Asopro.printstatement();
		prof.printstatement();
		
		
		
		
		
		
		
	}

}
