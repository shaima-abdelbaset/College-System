
public class instractors extends Employ {
		protected String credit_card;
		protected String doc_dapartment;
		protected String doc_rank;
	public String getCredit_card() {
			return credit_card;
		}
		public void setCredit_card(String credit_card) {
			this.credit_card = credit_card;
		}
		public String getDoc_dapartment() {
			return doc_dapartment;
		}
		public void setDoc_dapartment(String doc_dapartment) {
			this.doc_dapartment = doc_dapartment;
		}
		public String getDoc_rank() {
			return doc_rank;
		}
		public void setDoc_rank(String doc_rank) {
			this.doc_rank = doc_rank;
		}
		public instractors() {
			super();
			
		}
		public instractors(String employ_ID, String employ_name, double salary, double bonus, double dedection, String email,
				String address,String credit_card, String doc_dapartment, String doc_rank) {
			super(employ_ID,employ_name,  salary,  bonus,  dedection,  email,
					 address);
			this.credit_card = credit_card;
			this.doc_dapartment = doc_dapartment;
			this.doc_rank = doc_rank;
		}
		public void print_details()
		{
			System.out.println("employ_ID " +employ_ID);
			System.out.println("employ_name "+employ_name);
			System.out.println("salary "+salary);
			System.out.println("bonus "+bonus);
			System.out.println("dedection "+dedection);
			System.out.println("address "+address);
			System.out.println("credit_card "+credit_card);
			System.out.println("doc_dapartment "+doc_dapartment);
			System.out.println("doc_rank "+doc_rank);
		}
		@Override
		public String toString() {
			return "constructor [credit_card=" + credit_card + ", doc_dapartment=" + doc_dapartment + ", doc_rank="
					+ doc_rank + ", employ_ID=" + employ_ID + ", employ_name=" + employ_name + ", salary=" + salary
					+ ", bonus=" + bonus + ", dedection=" + dedection + ", email=" + email + ", address=" + address
					+ "]";
		}

		

		
		
		
		
		

}
