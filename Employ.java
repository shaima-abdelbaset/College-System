
public abstract class Employ implements Print {
	
	 protected  String employ_ID;
	 protected  String employ_name;
	 protected  double salary;
	 protected double bonus;
	 protected double dedection;
	 protected String email;
	 protected String address;
	public Employ ()  {
	
	}
	public Employ(String employ_ID, String employ_name, double salary, double bonus, double dedection, String email,
			String address) {
		super();
		this.employ_ID = employ_ID;
		this.employ_name = employ_name;
		this.salary = salary;
		this.bonus = bonus;
		this.dedection = dedection;
		this.email = email;
		this.address = address;
	}
	public String getEmploy_ID() {
		return employ_ID;
	}
	public void setEmploy_ID(String employ_ID) {
		this.employ_ID = employ_ID;
	}
	public String getEmploy_name() {
		return employ_name;
	}
	public void setEmploy_name(String employ_name) {
		this.employ_name = employ_name;
	}
	public double getSalary() {
		return salary+bonus-dedection;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getDedection() {
		return dedection;
	}
	public void setDedection(double dedection) {
		this.dedection = dedection;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	

}

