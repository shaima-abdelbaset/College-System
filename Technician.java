


public class Technician extends Employ{
	String credit_card;
	String Technician_rank;
	String workplace;
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	public Technician() {
		super();
	}
	public Technician(String employ_ID, String employ_name, double salary, double bonus, double dedection, String email,
			String address,String credit_card,String Technician_rank,String workplace) {
		super(employ_ID, employ_name, salary, bonus, dedection, email, address);
		this.credit_card=credit_card;
		this.Technician_rank=Technician_rank;
		this.workplace=workplace;
	}
	public String getCredit_card() {
		return credit_card;
	}
	public void setCredit_card(String credit_card) {
		this.credit_card = credit_card;
	}
	public String getTechnician_rank() {
		return Technician_rank;
	}
	public void setTechnician_rank(String technician_rank) {
		this.Technician_rank = technician_rank;
	}
	public void print_details()
	{

		System.out.println("employ_ID " +employ_ID);
		System.out.println("employ_name "+employ_name);
		System.out.println("salary "+salary);
		System.out.println("bonus "+bonus);
		System.out.println("dedection "+dedection);
		System.out.println("address"+address);
		System.out.println("workplace "+workplace);
		System.out.println("credit_card "+credit_card);
		System.out.println("Technician_rank "+Technician_rank);
	}
	@Override
	public String toString() {
		return "Technician [credit_card=" + credit_card + ", Technician_rank=" + Technician_rank + ", workplace="
				+ workplace + ", employ_ID=" + employ_ID + ", employ_name=" + employ_name + ", salary=" + salary
				+ ", bonus=" + bonus + ", dedection=" + dedection + ", email=" + email + ", address=" + address + "]";
	}

	

}
