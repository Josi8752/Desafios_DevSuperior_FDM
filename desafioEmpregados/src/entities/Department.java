package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private Integer payDay;

	private List<Employee> employees = new ArrayList<>();

	private Addres addres;

	public Department() {

	}

	public Department(String name, Integer payDay, Addres addres) {
		super();
		this.name = name;
		this.payDay = payDay;
		this.addres = addres;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Addres getAddres() {
		return addres;
	}

	public void setAddres(Addres addres) {
		this.addres = addres;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
	employees.remove(employee);	
	}

	public Double payroll() {
		double aux = 0.0;
		for (Employee emp : employees) {
		 aux += emp.getSalary();
		}
	return aux;
	}

	@Override
	public String toString() {
		return  name  + payDay + employees + addres;
	}

	

		
}