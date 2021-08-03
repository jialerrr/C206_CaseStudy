import java.util.ArrayList;
import java.util.Random;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Parent> pList = new ArrayList<Parent>();

		String msg = "1. Administrator\n2. CCA Coordinator/Instructor\n3. Parent";
		System.out.println(msg);
		int menuOption = Helper.readInt("Choose which user to login as > ");
		if (menuOption == 1) {
			System.out.println("-----LOGGED IN AS ADMINISTRATOR-----");

			int option = 0;
			String msg2 = "1. Add Student\n2. View Students/Instructor\n3. Delete Student\n4. Quit";
			System.out.println(msg2);
			option = Helper.readInt("Enter option > ");
			while (option != 4) {

				if(option == 1) {
					System.out.println("-----ADD STUDENT-----");
					Parent p = inputStudentDetail();
					addStudentDetail(pList,p);
					msg2 = "1. Add Student\n2. View Students/Instructor\n3. Delete Student\n4. Quit";
					System.out.println(msg2);
					option = Helper.readInt("Enter option > ");
				}
				else if(option==2) {
					System.out.println("-----VIEW STUDENT-----");
					retrieveAllStudentdetail(pList);
					viewAllStudentdetail(pList);
					msg2 = "1. Add Student\n2. View Students/Instructor\n3. Delete Student\n4. Quit";
					System.out.println(msg2);
					option = Helper.readInt("Enter option > ");

				}
				else if(option==3) {
					System.out.println("-----DELETE STUDENT-----");
					deleteDetails(pList);
					msg2 = "1. Add Student\n2. View Students/Instructor\n3. Delete Student\n4. Quit";
					System.out.println(msg2);
					option = Helper.readInt("Enter option > ");
				}

			} if(option == 4) {
				System.out.println("Successfully quit the program");
			}


		} else if (menuOption == 2) {
			System.out.println("-----LOGGED IN AS COORDINATOR/ INSTRUCTOR-----");

			ArrayList<String> categoryList = new ArrayList<String>();
			categoryList.add(new String("Sports"));
			categoryList.add(new String("Arts & Culture"));

			int option = 0;
			String catMsg = "1. Add CCA category\n2. View all CCA categories\n3. Delete CCA category\n4. View Parents in Registration List\n5. Delete Parent from Registration List";
			System.out.println(catMsg);
			option = Helper.readInt("Enter option > ");

			while (option != 6) {

				if(option == 1) {
					String cat = inputTitle();
					addCategory(categoryList,cat);

					catMsg = "1. Add CCA category\n2. View all CCA categories\n3. Delete CCA category\n4. View Parents in Registration List\n5. Delete Parent from Registration List";
					System.out.println(catMsg);
					option = Helper.readInt("Enter option > ");
				}

				else if(option == 2) {
					retrieveAllCCACategories(categoryList);
					viewAllCategories(categoryList);

					catMsg = "1. Add CCA category\n2. View all CCA categories\n3. Delete CCA category\n4. View Parents in Registration List\n5. Delete Parent from Registration List";
					System.out.println(catMsg);
					option = Helper.readInt("Enter option > ");   
				}

				else if(option == 3) {
					deleteCategory(categoryList);

					catMsg = "1. Add CCA category\n2. View all CCA categories\n3. Delete CCA category\n4. View Parents in Registration List\n5. Delete Parent from Registration List";
					System.out.println(catMsg);
					option = Helper.readInt("Enter option > ");

				}
				//				else if(option == 4) {
				//					retrieveAllStudentRegDetail(regIDList);
				//					viewAllStudentRegDetail(regIDList);
				//
				//					catMsg = "1. Add CCA category\n2. View all CCA categories\n3. Delete CCA category\n4. View Parents in Registration List\n5. Delete Parent from Registration List";
				//					System.out.println(catMsg);
				//					option = Helper.readInt("Enter option > ");   
				//				}
				//				else if(option == 5) {
				//					deleteRegStudent(regIDList);
				//
				//					catMsg = "1. Add CCA category\n2. View all CCA categories\n3. Delete CCA category\n4. View Parents in Registration List\n5. Delete Parent from Registration List";
				//					System.out.println(catMsg);
				//					option = Helper.readInt("Enter option > ");
				//
				//				}
			}

		} else if (menuOption == 3) {
			System.out.println("-----LOGGED IN AS PARENT-----");

			ArrayList<ParentReg> regIDList = new ArrayList<ParentReg>();

			int option = 0;
			String regMsg = "1. Register for a CCA\n2. Login\n3. View\n4. Delete\n5. View database\n6. Add to database";
			System.out.println(regMsg);
			option = Helper.readInt("Enter option > ");

			while (option != 7) {

				if(option == 1) {
					ParentReg r = inputRegStudent();
//					if (verifystudentID(r.getStudentID(), pList) == true){
					for(int i = 0; i < pList.size(); i++) {
					if(pList.get(i).getStudentID().equals(r.getStudentID())) {
					addStudentAccount(regIDList,r);
					break;
					}
					}
//					}

					regMsg = "1. Register for a CCA\n2. Login\n3. View\n4. Delete\n5. View database\n6. Add to database";
					System.out.println(regMsg);
					option = Helper.readInt("Enter option > ");
				}

				else if(option == 2) {
					//login 
				} else if(option == 3) {
					retrieveAllStudentRegDetail(regIDList);
					viewAllStudentRegDetail(regIDList);

					regMsg = "1. Register for a CCA\n2. Login\n3. View\n4. Delete\n5. View database\n6. Add to database";
					System.out.println(regMsg);
					option = Helper.readInt("Enter option > ");   
				} else if(option == 4) {
					deleteRegStudent(regIDList);

					regMsg = "1. Register for a CCA\n2. Login\n3. View\n4. Delete\n5. View database\n6. Add to database";
					System.out.println(regMsg);
					option = Helper.readInt("Enter option > ");

				} else if(option==5) {
					System.out.println("-----VIEW STUDENT-----");
					retrieveAllStudentdetail(pList);
					viewAllStudentdetail(pList);
					regMsg = "1. Register for a CCA\n2. Login\n3. View\n4. Delete\n5. View database\n6. Add to database";
					System.out.println(regMsg);
					option = Helper.readInt("Enter option > ");

				} else if(option == 6) {
					System.out.println("-----ADD STUDENT-----");
					Parent p = inputStudentDetail();
					addStudentDetail(pList,p);
					regMsg = "1. Register for a CCA\n2. Login\n3. View\n4. Delete\n5. View database\n6. Add to database";
					System.out.println(regMsg);
					option = Helper.readInt("Enter option > ");
				}
			}
		}
	}


	//------------------------------------------add parent----------------------------------------------//
	//return object
	public static Parent inputStudentDetail() {
		String ID = Helper.readString("Enter ID > ");
		String name = Helper.readString("Enter Name > ");
		String grade = Helper.readString("Enter Grade > ");
		String teacher = Helper.readString("Enter Teacher Name > ");
		String pname = Helper.readString("Enter Parent name > ");
		String pemail = Helper.readString("Enter Parent email > ");
		String pcontact = Helper.readString("Enter Parent contact > ");
		Parent sd = null;

		if (Integer. parseInt(ID)<0) {
			System.out.println("-----Invalid ID-----");
		} 
		else {
			sd = new Parent(ID, name, grade, teacher, pname, pemail, pcontact);;
		}
		return sd;
	}
	public static void addStudentDetail(ArrayList<Parent> pList, Parent sd) {

		pList.add(sd);
		System.out.println("-----Student Detail Added!-----");

	}

	//------------------------------------------view parents----------------------------------------------//

	public static String retrieveAllStudentdetail(ArrayList<Parent> pList) {
		String output = "";

		for (int i = 0; i < pList.size(); i++) {

			output += String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", pList.get(i).getStudentID(), 
					pList.get(i).getStudentName(),pList.get(i).getGrade(),pList.get(i).getTeacher(),pList.get(i).getParentName()
					,pList.get(i).getParentEmail(),pList.get(i).getParentContact());
		}
		return output;
	}

	public static void viewAllStudentdetail(ArrayList<Parent> pList) {
		System.out.println("-----STUDENT DETAILS-----");
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "STUDENT ID", "STUDENT NAME", "GRADE",
				"TEACHER","PARENT NAME","PARENT EMAIL","PARENT CONTACT" );
		output += retrieveAllStudentdetail(pList);  
		System.out.println(output);
	}
	//------------------------------------------delete parent----------------------------------------------//

	public static void deleteDetails(ArrayList<Parent> pList) {
		// write your code here
		viewAllStudentdetail(pList);
		String id = Helper.readString("Enter ID to delete > ");
		for (int i = 0; i < pList.size(); i++) {
			if (pList.get(i).getStudentID().equals(id)) {
				System.out.println("-----Student ID: " + id + " Deleted-----");
				pList.remove(i);

			}  
			else {
				System.out.println("-----Invalid ID provided-----");
			}

		}
	}

	//-------------------------------------add category-----------------------------------------//
	public static String inputTitle() {
		String name = Helper.readString("Enter name of new CCA category > ");
		String cat = "";
		if (name.isEmpty()) {
			System.out.println("-----No input!-----");
			cat = "";
		} else {
			cat = name;
		}
		return cat;
	}

	public static void addCategory(ArrayList<String> categoryList, String cat) {

		categoryList.add(cat);
		System.out.println("-----New CCA category added!-----");
	}

	//-----------------------------------------View categories-----------------------------------------//

	public static String retrieveAllCCACategories(ArrayList<String> categoryList) {
		String output = "";

		if (!categoryList.isEmpty()) {
			for (int i = 0; i < categoryList.size(); i++) {

				output += categoryList.get(i) + ", ";
			}   
		} else {
			output = "-----No CCA categories available-----";
		}
		return output;
	}

	public static void viewAllCategories(ArrayList<String> categoryList) {
		System.out.println("CCA CATEGORIES");
		String output = retrieveAllCCACategories(categoryList);  
		System.out.println(output);
	}

	//------------------------------------------delete category----------------------------------------------//

	public static void deleteCategory(ArrayList<String> categoryList) {
		viewAllCategories(categoryList);
		String name = Helper.readString("Enter category name to remove > ");
		String output = "";
		for (int i = 0; i < categoryList.size(); i++) {
			if (categoryList.get(i).equalsIgnoreCase(name)) {
				categoryList.remove(i);
				output = "-----Category " + name + " deleted successfully.-----";
				break;
			}  else {
				output = "-----Category not found.-----";
			}
		}
		System.out.println(output);
	}

	//------------------------------------------Add student to registration list----------------------------------------------// 
	public static ParentReg inputRegStudent() { 

		//not sure where to add and assign the code to a variable for generating unique registration ID 

		String ID = Helper.readString("Enter student ID > "); 
		String name = Helper.readString("Enter Name > "); 
		String grade = Helper.readString("Enter Grade > "); 
		String teacher = Helper.readString("Enter Teacher Name > ");
		String pName = Helper.readString("Enter Parent Name > ");
		String pEmail = Helper.readString("Enter Parent Email > ");
		String pContact = Helper.readString("Enter Parent Contact > ");
		ParentReg sdReg = null;

		if (Integer.parseInt(ID)<0) { 
			System.out.println("Invalid ID entered."); 

		} else {
			char[] alphabets = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			char[] passArray = new char[8];
			Random alpha = new Random();
			String regID = "";

			for (int i = 0; i < 8; i ++) {
				int randIdx = alpha.nextInt(alphabets.length);
				passArray[i] = alphabets[randIdx];

			}

			int randUpper = alpha.nextInt(passArray.length-1)+1;

			for (int i = 0; i <= randUpper; i ++) {
				int randChar = alpha.nextInt(passArray.length);
				passArray[randChar] = Character.toUpperCase(passArray[randChar]);
			}
			for (int i = 0; i < 8; i ++) {
				regID += passArray[i];
			}
			sdReg = new ParentReg(ID, name, grade, teacher, pName, pEmail, pContact, regID); 
		} 
		return sdReg; 
	} 


	public static void addStudentAccount(ArrayList<ParentReg> regIDList, ParentReg sdReg) { 

		//		for (int i = 0; i < regIDList.size(); i++) { 
		//			if (!regIDList.contains(regIDList.get(i).getStudentID())) {
		regIDList.add(sdReg); 
		System.out.println("Student has successfully registered.\nCCA Registration ID: " + sdReg.getregID());
		//
		//			} else { 
		//				System.out.println("Student has already registered.");  
		//			} 
		//		}
	} 


	//------------------------------------------view registered students----------------------------------------------// 
	public static String retrieveAllStudentRegDetail(ArrayList<ParentReg> regIDList) { 

		//retrieveAllStudentRegDetail dun hv the registrationID inside as idk how to access it in the regIDList 

		String output = ""; 

		for (int i = 0; i < regIDList.size(); i++) { 

			output += String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", regIDList.get(i).getStudentID(),  
					regIDList.get(i).getStudentName(), regIDList.get(i).getGrade(), regIDList.get(i).getTeacher(), regIDList.get(i).getParentName(), 
					regIDList.get(i).getParentEmail(), regIDList.get(i).getParentContact(), regIDList.get(i).getregID()); 
		} 
		return output; 
	} 

	public static void viewAllStudentRegDetail(ArrayList<ParentReg> regIDList) { 
		System.out.println("-----REGISTERED STUDENT DETAILS-----"); 

		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "STUDENT ID", "STUDENT NAME", "GRADE", 
				"TEACHER", "PARENT NAME", "PARENT EMAIL", "PARENT CONTACT", "REGISTRATION ID" ); 
		output += retrieveAllStudentRegDetail(regIDList);  

		System.out.println(output); 
	} 

	//------------------------------------------delete student reg account----------------------------------------------// 

	public static void deleteRegStudent(ArrayList<ParentReg> regIDList){ 

		viewAllStudentRegDetail(regIDList);
		String id = Helper.readString("Enter ID to delete > ");
		for (int i = 0; i < regIDList.size(); i++) {
			if (regIDList.get(i).getStudentID().equals(id)) {
				System.out.println("-----Student ID: " + id + " Deleted-----");
				regIDList.remove(i);

			}  
			else {
				System.out.println("-----Invalid ID provided-----");
			}

		}
	}
	
//	public static boolean verifystudentID(String studentID, ArrayList<Parent> pList) {
//		Boolean studentIDverified = false;
//		for (int i = 0; i < pList.size(); i++) {
//			if (pList.get(i).getStudentID() == studentID) {
//				studentIDverified = true;
//				break;
//			} else {
//				studentIDverified = false;
//			}
//		}
//		return studentIDverified;
//	}

}
