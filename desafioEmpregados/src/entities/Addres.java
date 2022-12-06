package entities;

public class Addres {

	private String email;
	private Integer phone;
	
	public Addres () {
		
	}

	public Addres(String email, Integer phone) {
		
		this.email = email;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return  email + phone ;
	}
	
	
}
