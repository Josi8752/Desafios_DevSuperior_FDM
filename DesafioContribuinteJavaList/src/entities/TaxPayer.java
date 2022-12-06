package entities;

public class TaxPayer {
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;

	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		super();
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public Double salaryTax() {

		if (salaryIncome / 12 < 3000.0) {
			return 0.0;
		}
		if (salaryIncome / 12 < 5000.0) {
			return salaryIncome * 0.1;
		} else {

			return salaryIncome * 0.2;
		}

	}

	public double gastosDedutiveis() {
		return healthSpending + educationSpending;
	}

	public Double maximoDedutivel() {
		return grossTax() * 0.3;
	}

	public Double servicesTax() {

		return servicesIncome * 0.15;

	}

	public Double capitalTax() {
		return capitalIncome * 0.2;

	}

	public Double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();

	}

	public Double taxRebate() {
		if (gastosDedutiveis() < maximoDedutivel()) {
			return gastosDedutiveis();
		} 
		else {
			return maximoDedutivel();
		}
	}

	public Double netTax() {
		return grossTax() - taxRebate();

	}
}
