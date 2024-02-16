import java.util.Scanner;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Project_Main {
	static boolean check=false;

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList <Employ>ArrayOfEmploys=new ArrayList <Employ>();
		ArrayList <Technician>ArrayOfTechnicians=new ArrayList <Technician>();
		ArrayList <Administrator>ArrayOfAdministrators=new ArrayList <Administrator>();
		ArrayList <instractors>ArrayOfInstractors=new ArrayList <instractors>();
		ArrayList <Student>ArrayOfStudents=new ArrayList <Student>();
	
		try
		{
		while(true)
		{
		
			check=false;
			System.out.println("to exit Enter 0");
			System.out.println(" add a student Enter 1");
			System.out.println(" delete a student Enter 2");
			System.out.println("search for student Enter 3");
			System.out.println("display student information  Enter 4");
			System.out.println("display aa students information  Enter 5");
			System.out.println("                **********            ");
			System.out.println("add for instractor Enter 6");
			System.out.println("delete for an instractor or  Enter 7 ");
			System.out.println("search for an instractor Enter 8");
			System.out.println("display  instractor information Enter instractor  9");
			System.out.println("display all instractors information Enter instractor  10");
			System.out.println("                **********            ");
			System.out.println("add for technician Enter 11");
			System.out.println("delete a technician Enter 12");
			System.out.println("search  for a technician Enter 13");
			System.out.println(" display information of technician Enter 14");
			System.out.println(" display information of all technicians Enter 15");
			System.out.println("                **********            ");
			System.out.println("add an Admin Enter 16");
			System.out.println("delete an Admin or an Employ Enter 17");
			System.out.println("search for Admin or an Admin Enter 18");
			System.out.println("display Admin information  Enter 19");
			System.out.println("display all Admins information  Enter 20");
			System.out.println();
			

			int x1=in.nextInt();
			// exit
			switch(x1)
			{
			case 0:
			{
				break;
			}
			//add student
			case 1:
			{
				Student std=new Student();
				System.out.println("Enter student_ID ");
				 std.student_ID=in.next();
				std.setStudent_ID(std.student_ID);
				
				System.out.println("Enter student_name ");
				 std.student_name=in.next();
				std.setStudent_name(std.student_name);
				
				System.out.println("Enter student_gender ");
				 std.gender=in.next();
				 while (true)
				 
				 {
					 if( std.gender.equals("female") ||std.gender.equals("male" )||std.gender.equals("Female") ||std.gender.equals("Male" ))
							 break;
				System.out.println("invalid gender ");
				 std.gender=in.next();

			     }
				std.setGender(std.gender);
				
				System.out.println("Enter student_address ");
				 std.address=in.next();
				std.setAddress(std.address);
				
				System.out.println("Enter student_level ");
				 std.student_level=in.nextInt();
				
					while(true)
					{
						if(std.student_level>0 && std.student_level <=4)
						{
							break;
						}
					System.out.println("invalid student_level ");
					 std.student_level=in.nextInt();
					}
				std.setStudent_level(std.student_level);
				
				
				System.out.println("Enter student_email ");
				 std.academic_email=in.next();
				std.setAcademic_email(std.academic_email);
				
				System.out.println("Enter student_Birth_date ");
				 std.Birth_date=in.next();
				std.setBirth_date(std.Birth_date);
				
				System.out.println("Enter student_photo ");
				 std.photo=in.next();
				std.setPhoto(std.photo);
				
				
				System.out.println("Enter student_GPA");
				 std.GPA=in.nextDouble();
				
				while(true)
				{
					if(std.GPA>=0 && std.GPA <=4)
					{
						break;
					}
				System.out.println("invalid GPA");
				 std.GPA=in.nextDouble();
				}
				   std.setGPA(std.GPA);
				 ArrayOfStudents.add(std);
				System.out.println("student added");
				break;
				 
				
			}
			
			//add instractors 
			case 6:
				 {
		             
				instractors ins=new instractors();
					 System.out.println("employ_ID");
					 ins.employ_ID=in.next();
					 ins.setEmploy_ID(ins.employ_ID);
					 
					 System.out.println("employ_name");
					 ins.employ_name=in.next();
					 ins.setEmploy_name(ins.employ_name);
					 
					 
					 System.out.println("salary");
					 ins.salary=in.nextDouble();
					 ins.setSalary(ins.salary);
					 
					 
					 
					 System.out.println("bonus");
					 ins.bonus=in.nextDouble();
					 ins.setBonus(ins.bonus);
					 
					 System.out.println("dedection");
					 ins.dedection=in.nextDouble();
					 ins.setDedection(ins.dedection);
					
					 System.out.println("email");
					 ins.email=in.next();
					 ins.setEmail(ins.email);
					 
					 ArrayOfInstractors.add(ins);
					 ArrayOfEmploys.add(ins);
					 System.out.println("instractors added");
					 break;
				 }
				 //add Technician
				 
			case 11:
				 {
					 Technician tech=new Technician();
					 System.out.println("Technician_name");
					 tech.employ_name=in.next();
					tech.setEmploy_name(tech.employ_name);
					
					 System.out.println("Technician_ID");
					 tech.employ_ID=in.next();
					tech.setEmploy_ID(tech.employ_ID);
					
					 System.out.println("workplace");
					 tech.workplace=in.next();
					 tech.setWorkplace(tech.workplace);
					 
					 System.out.println("address");
					 tech.address=in.next();
					 tech.setAddress(tech.address);
					 
					 System.out.println("email");
					 tech.email=in.next();
					 tech.setEmail(tech.email);
					 
					
					 System.out.println("salary");
					 tech.salary=in.nextDouble();
					 tech.setSalary(tech.salary);
					 
					 System.out.println("bonus");
					 tech.bonus=in.nextDouble();
					 tech.setBonus(tech.bonus);
					
					 System.out.println("dedection");
					 tech.dedection=in.nextDouble();
					 tech.setDedection(tech.dedection);
					 
					 System.out.println("credit_card");
					 tech.credit_card=in.next();
					 tech.setCredit_card(tech.credit_card);
					 
					 System.out.println("setTechnician_rank");
					 tech.Technician_rank=in.next();
					 tech.setTechnician_rank(tech.Technician_rank);
					 
					 ArrayOfTechnicians.add(tech);
					 ArrayOfEmploys.add(tech);
					 System.out.println("Technician added");
					 break;
			}
				 // add Admin
			case 16:
				 {
					 Administrator admin=new Administrator();
					 System.out.println("Administrator_name");
					 admin.employ_name=in.next();
					 admin.setEmploy_name(admin.employ_name);
					
					 System.out.println("Administrator_ID");
					 admin.employ_ID=in.next();
					 admin.setEmploy_ID(admin.employ_ID);
					
					 System.out.println("Administrator_address");
					 admin.address=in.next();
					 admin.setAddress(admin.address);
					
					 System.out.println("admin_job");
					 admin.admin_job=in.next();
					 admin.setAdmin_job(admin.admin_job);
					 
					 
					 System.out.println("salary");
					 admin.salary=in.nextDouble();
					 admin.setSalary(admin.salary);
					
					 System.out.println("bonus");
					 admin.bonus=in.nextDouble();
					 admin.setBonus(admin.bonus);
					 
					 System.out.println("dedection");
					 admin.dedection=in.nextDouble();
					 admin.setDedection(admin.dedection);
					 
					 
					 System.out.println("admin_email");
					 admin.email=in.next();
					 admin.setEmail(admin.email);
					 
					 System.out.println("credit_card");
					 admin.credit_card=in.next();
					 admin.setCredit_card(admin.credit_card);
					 
					 System.out.println("admin_rank");
					 admin.rank=in.next();
					 admin.setRank(admin.rank);
					 
					 ArrayOfAdministrators.add(admin);
					 ArrayOfEmploys.add(admin);
					 System.out.println("admin added");
					 break;

			}
			
				 //*DISPLAY*
				 //display all students information  
			case 5:
				 {
				 for(Student index:ArrayOfStudents)
				 {
					 System.out.println(index.toString());
				 }
				 break;
				 }
				
				 //display  all instractors information 
			case 10:
				 {
					 
				 for(instractors index:ArrayOfInstractors)
				 {
					 System.out.println(index.toString());
				 }
				 break;
				 }
				 //display all  technicians information  
			case 15:
				 {
					 
				 for(Technician index:ArrayOfTechnicians)
				
				 {
					 System.out.println(index.toString());
				 }
				 break;
				 }
				//display all  Admins information  Enter 16"
			case 20:
				 {
					 
				 for(Administrator index:ArrayOfAdministrators)
				 {
					 System.out.println(index.toString());
				 }
				 break;
				 }
				 
				//display student information
			case 4:
				 {
					 System.out.println(" Enter Student_ID");
					 String ID1=in.next();
					 for(Student index:ArrayOfStudents)
					 {
						 String id=index.student_ID;
						 
						 if(id.equals(ID1) )
						 {
							 System.out.println(index.toString());
							 check=true;
							 break;
						 }
					  }
					 
					 if(check==false)
					 {
						 System.out.println("Not Found");
	 
					 }
					 break;
				 }	
				//display instractor information
			case 9:
				 {
					 System.out.println(" Enter instractor_ID");
					 String ID1=in.next();
					 for(instractors index:ArrayOfInstractors)
					 {
						 String id=index.employ_ID;
						 if(id.equals(ID1))
						 {
							 System.out.println(index.toString());
							 check=true;
							 break;
						 }
					 }
					 if(check==false)
					 {
						 System.out.println("Not Found");
	 
					 }
					 break;
				 }	
				//display Technician information
			case 14:
				 {
					 System.out.println(" Enter Technician_ID");
					 String ID1=in.next();
					 for(Technician index:ArrayOfTechnicians)
					 {
						 String id=index.employ_ID;
						 if(id.equals(ID1))
						 {
							 System.out.println(index.toString());
							 check=true;

							 break;
						 }
					 }
					 if(check==false)
					 {
						 System.out.println("Not Found");
	 
					 }
					 break;
				 }	
				//display Adminstrator information
			     case 19:
				 {
					 System.out.println(" Enter Adminstrator_ID");
					 String ID1=in.next();
					 for(Administrator index:ArrayOfAdministrators)
					 {
						 String id=index.employ_ID;
						 if(id.equals(ID1))
						 {
							 System.out.println(index.toString());
							 check=true;
							 break;
						 }
					 }
					 if(check==false)
					 {
						 System.out.println("Not Found");
	 
					 }
					 break;
				 }	
				 
				 //*REMOVE*
				 //remove  student
			case 2:
				 {
					 System.out.println(" Enter Student_ID");
					 String ID1=in.next();
					 for(Student index:ArrayOfStudents)
					 {
						String id=index.student_ID;
						 
						 if(id.equals(ID1))
						 {
							 ArrayOfStudents.remove(index);
							 System.out.println(" student removed");
							 break;
						 }
					 }
					 break;
				 }
					// remove for an instractor 
			     case 7:
					 {
						 System.out.println(" Enter instractor_ID");
						 String ID1=in.next();
						 for(instractors index:ArrayOfInstractors)
						 {
								String id=index.employ_ID;

							 if(id.equals(ID1))
							 {
								 ArrayOfInstractors.remove(index);
								 ArrayOfEmploys.remove(index);
								 System.out.println("instractor removed");
								 break;
							 }
						 }
						 break;
					 }
					// remove for an Technician 
			case 12:
					 {
						 System.out.println(" Enter Technician_ID");
						 String ID1=in.next();
						 for(Technician index:ArrayOfTechnicians)
						 {
							 String id=index.employ_ID;
							 if(id.equals(ID1))
							 {
								 ArrayOfTechnicians.remove(index);
								 ArrayOfEmploys.remove(index);
								 System.out.println("DONE");
								 break;
							 }
						 }
						 break;
					 }
					// remove for an Administrator 
			case 17:
					 {
						 System.out.println(" Enter Administrator_ID");
						 String ID1=in.next();
						 for(Administrator index:ArrayOfAdministrators)
						 {
							 String id=index.employ_ID;
							 if(id.equals(ID1))
							 {
								 ArrayOfAdministrators.remove(index);
								 ArrayOfEmploys.remove(index);
								 System.out.println("DONE");
								 break;
							 }
						 }
						 break;
					 }
					 //*SEARCH*
					 //search for  student
			case 3:
					 {
						 System.out.println(" Enter Student_ID");
						 String ID=in.next();
						 for(Student index:ArrayOfStudents)
						 {
							 String id=index.student_ID;
							 if(id.equals(ID))
						 {
								 System.out.println("Found");
								 check=true;
								 break;
							 }
							 
						
						 }
						 if(check==false)
						 {
							 System.out.println("Not found");
							 
						 }
						 break;
					 }
						// search for an instractor 
			           case 8:
				
						 {
							 System.out.println(" Enter instractor_ID");
							 String ID1=in.next();
							 for(instractors index:ArrayOfInstractors)
							 {
								 String id=index.employ_ID;

								 if(id.equals(ID1))
								 {
									 System.out.println("Found");
									 check=true;
									 break;
								 }
							 }
							 if(check==false)
							 {
								 System.out.println("Not found");
								 
							 }
							 break;
						 }
						// Search for an Technician 
			case 13:
						 {
							 System.out.println(" Enter Technician_ID");
							 String ID1=in.next();
							 for(Technician index:ArrayOfTechnicians)
							 {
								 String id=index.employ_ID;

								 if(id.equals(ID1))
								 {
									 System.out.println("Found");
									 check=true;
									 break;
								 }
							 }
							 if(check==false)
							 {
								 System.out.println("Not found");
								 
							 }
							 break;
						 }
						// Search for an Administrator 
			            case 18:
						 {
							 System.out.println(" Enter Administrator_ID");
							 String ID1=in.next();
							 for(Administrator index:ArrayOfAdministrators)
							 {
								 String id=index.employ_ID;

								 if(id.equals(ID1))
								 {
									 System.out.println("Found");
									 check=true;
									 break;
								 }
							 }
						 if(check==false)
						 {
							 System.out.println("Not found");
						 }
						 break;
						 }
			}
			}
		}
			catch(Exception e)
			{
				System.out.println("Somthing went wrong ... "+e.getMessage());
			}
		
			
}
}
	
		
		
		

