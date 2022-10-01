package program;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;

public class Program {
	
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);


System.out.print("Enter departament name: ");
String departmentName = sc.nextLine();

System.out.print("Dia do pagamento: ");
int payDay = sc.nextInt();
sc.nextLine();
System.out.print("Email: ");
String mail = sc.nextLine();

System.out.print("Telefone: ");
double phone = sc.nextDouble();

System.out.print("Quantos funcionários tem o departamento?: ");
int N = sc.nextInt();

Department dept = new Department (departmentName, payDay );


for (int i = 0; i < N; i++) {
	int acc = i + 1;
	System.out.println("Dados do funcionário  " + acc);
	System.out.print("Nome:  ");
	String name = sc.next();	
	
	System.out.print("Salário:  ");
	double salary = sc.nextDouble();
		
	Employee emp = new Employee(name, salary);
	dept.addEmployee(emp);
	
}

    System.out.print(dept);

    //System.out.print("Departamento de venda = R$ "+ dept.payroll() );
	//System.out.print("Pagamento realizado dia :" + dept.getPayDay());
	//System.out.print("Funcionários:");
	//System.out.print(dept.getEmployee());	
	//System.out.print("Para dúvidas favor entrar em contato: " + dept.getAddress());
	

sc.close();
}
}










	


