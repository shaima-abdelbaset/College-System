
import java.util.Arrays;

public class Student {
	protected String student_ID;
	protected String student_name;
	protected double GPA;
	protected int student_level;
	protected String address;
	protected String photo;
	protected String Birth_date;
	protected String academic_email;
	protected String gender;
	protected String[] timetable;
	String coursecode;
	int block;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAcademic_email() {
		return academic_email;
	}
	public void setAcademic_email(String academic_email) {
		this.academic_email = academic_email;
	}
	public String getStudent_ID() {
		return student_ID;
	}
	public void setStudent_ID(String student_ID) {
		this.student_ID = student_ID;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public int getStudent_level() {
		return student_level;
	}
	public void setStudent_level(int student_level) {
		if(student_level>=1 && student_level<=4)
		this.student_level = student_level;
		else 
		{
			System.out.println("valid student_level among 1-4 ");
		}
	}
	public String getAddress() {
		
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}	public String getBirth_date() {
		return Birth_date;
	}
	public void setBirth_date(String birth_date) {
		Birth_date = birth_date;
	}
       public Student() {
		
	}
	public Student(String student_ID, String student_name, double gPA, int student_level, String address, String photo,
			String birth_date,String academic_email,String gender) {
		super();
		this.student_ID = student_ID;
		this.student_name = student_name;
		GPA = gPA;
		this.student_level = student_level;
		this.address = address;
		this.photo = photo;
		Birth_date = birth_date;
		this.academic_email=academic_email;
		this.gender=gender;
		timetable=new String[8];
		
	}
	public void setcourse(int block,String coursecode )
	{
		timetable[block-1]=coursecode;
		
	}
	public String getcourse(int block )
	{
		if(timetable[block-1]==null)
		{
			return "NO Course Schduled";
		}
		else 
		return timetable[block-1];
		
	}
	@Override
	public String toString() {
		return "Student [student_ID=" + student_ID + ", student_name=" + student_name + ", GPA=" + GPA
				+ ", student_level=" + student_level + ", address=" + address + ", photo=" + photo + ", Birth_date="
				+ Birth_date + ", academic_email=" + academic_email + ", gender=" + gender +"]";
	}
	}

