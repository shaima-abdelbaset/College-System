
public class Administrator extends Employ  {
	
	
	
	String admin_job;
	String credit_card;
	String rank;
	public Administrator() {
		super();
	}
	public Administrator(String employ_ID, String employ_name, double salary, double bonus, double dedection, String email,
			String address,String admin_job, String credit_card, String rank) {
		super( employ_ID,  employ_name,  salary,  bonus,  dedection,  email,
				 address);
		this.admin_job = admin_job;
		this.credit_card = credit_card;
		this.rank = rank;
	}
	public String getAdmin_job() {
		return admin_job;
	}
	public void setAdmin_job(String admin_job) {
		this.admin_job = admin_job;
	}
	public String getCredit_card() {
		return credit_card;
	}
	public void setCredit_card(String credit_card) {
		this.credit_card = credit_card;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public void print_details()
	{

		System.out.println("employ_ID " +employ_ID);
		System.out.println("employ_name "+employ_name);
		System.out.println("salary "+salary);
		System.out.println("bonus "+bonus);
		System.out.println("dedection "+dedection);
		System.out.println("address"+address);
		System.out.println("admin_job"+admin_job);
		System.out.println("credit_card"+credit_card);
		System.out.println("rank "+rank);
	}
	@Override
	public String toString() {
		return "Administration [admin_job=" + admin_job + ", credit_card=" + credit_card + ", rank=" + rank
				+ ", employ_ID=" + employ_ID + ", employ_name=" + employ_name + ", salary=" + salary + ", bonus="
				+ bonus + ", dedection=" + dedection + ", email=" + email + ", address=" + address + "]";
	}
	

	
	

	

}
