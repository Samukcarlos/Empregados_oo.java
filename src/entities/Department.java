package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;
	
	public Department() {
		
	}

	public Department(String name, int payDay) {
		super();
		this.name = name;
		this.payDay = payDay;
	}
	
	private List<Employee> employees = new ArrayList<>();
	private Address address = new Address();
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}
	

	public List<Employee> getEmployee() {
		return employees;
	}


	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
		
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
		
	}
	
	public double payroll() {
		double sum=0;
		
		for(Employee e: employees) {
			
			sum += e.getSalary();
		}
		return sum;
			
		
	}
	

   @Override

	public String toString() {
		return (" Folha de pagamento" + "\n"
				+ "Departamento de vendas + R$ "+ payroll() +"\n"
				+ "Pagamento realizado dia: " + getPayDay()  +"\n"
				+"Funcionários" + "\n"
				+ getEmployee()+ "\n" 
		        +"Para dúvidas, favor entrar em contato: "+  getAddress());
	}
		
	
	}

