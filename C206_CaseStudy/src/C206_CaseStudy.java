
import java.util.ArrayList;
import java.util.Random;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> sList = new ArrayList<Student>();
		ArrayList<Parent> pList = new ArrayList<Parent>();
		ArrayList<CCA> ccaList = new ArrayList<CCA>();

		ArrayList<String> categoryList = new ArrayList<String>();
		categoryList.add(new String("Sports"));
		categoryList.add(new String("Arts & Culture"));

		ArrayList<String> ccaTitles = new ArrayList<String>();
		ccaTitles.add(new String("Sports"));
		ccaTitles.add(new String("Arts & Culture"));
		boolean bQuit = true;
		while (bQuit) {

			String msg = "1. Administrator\n2. CCA Coordinator/Instructor\n3. Parent";
			System.out.println(msg);
			int menuOption = Helper.readInt("Choose which user to login as > ");
			//------------------------------------------administrator----------------------------------------------//
			if (menuOption == 1) {
				System.out.println("\n-----LOGGED IN AS ADMINISTRATOR-----");

				int option = 0;
				String adminMsg = "\n1. Add Student to Database\n2. View Students in database\n3. Update Student in Database\n4. Delete Student in Database\n5. Quit";
				System.out.println(adminMsg);
				option = Helper.readInt("Enter option > ");
				while (option != 5) {
					if(option == 1) {
						System.out.println("\n-----ADD STUDENT TO DATABASE-----");
						Student p = inputStudentDetail();
						addStudentDetail(sList,p);

						System.out.println(adminMsg);
						option = Helper.readInt("Enter option > ");
					}

					else if(option==2) {
						System.out.println("\n-----VIEW STUDENT IN DATABASE-----");
						retrieveAllStudentdetail(sList);
						viewAllStudentdetail(sList);

						System.out.println(adminMsg);
						option = Helper.readInt("Enter option > ");
					}

					else if(option==3) {
						System.out.println("\n-----UPDATE STUDENT IN DATABASE-----");
						updateStudentDetail(pList, sList);

						System.out.println(adminMsg);
						option = Helper.readInt("Enter option > ");
					} 

					else if(option==4) {
						System.out.println("\n-----DELETE STUDENT IN DATABASE-----");
						deleteDetails(sList);

						System.out.println(adminMsg);
						option = Helper.readInt("Enter option > ");
					}

				} if(option == 5) {
					System.out.println("\nSuccessfully logged out \n");
				}

			} 

			//------------------------------------------coordinator----------------------------------------------//

			else if (menuOption == 2) {
				System.out.println("\n-----LOGGED IN AS COORDINATOR/ INSTRUCTOR-----");

				int option = 0;
				String catMsg = "\n1. Add CCA category\n2. View all CCA categories\n3. Update CCA category\n4. Delete CCA category\n5. View Parents in Registration List\n6. Update Parent in Registration List\n7. Delete Parent from Registration List"
						+ "\n8. Add CCA details\n9. View CCA details\n10. Update CCA details\n11. Delete CCA details\n12. Add Student to CCA\n13. View Students in CCA\n14. Delete Student in CCA\n15. Quit";
				System.out.println(catMsg);
				option = Helper.readInt("Enter option > ");

				while (option != 15) {

					if(option == 1) {
						System.out.println("\n-----ADD CATEGORY-----");
						String cat = inputTitle();
						addCategory(categoryList,cat);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");
					}

					else if(option == 2) {
						System.out.println("\n-----VIEW CATEGORIES-----");
						retrieveAllCCACategories(categoryList);
						viewAllCategories(categoryList);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");   
					}

					else if(option == 3) {
						System.out.println("\n-----UPDATE CATEGORY-----");
						updateCategories(categoryList);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");
					} 

					else if(option == 4) {
						System.out.println("\n-----DELETE CATEGORY-----");
						deleteCategory(categoryList);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");
					} 

					else if(option == 5) {
						System.out.println("\n-----VIEW PARENTS IN REGISTERED LIST-----");
						retrieveAllStudentRegDetail(pList);
						viewAllStudentRegDetail(pList);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");   
					} 

					else if(option == 6) {
						System.out.println("\n-----UPDATE PARENTS IN REGISTERED LIST-----");
						updateParentDetail(pList, sList);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");

					} 

					else if(option == 7) {
						System.out.println("\n-----DELETE PARENTS IN REGISTERED LIST-----");
						deleteRegStudent(pList);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");
					}

					else if(option == 8) {
						System.out.println("\n-----ADD CCA DETAILS-----");
						CCA c1 = (inputCCADetail());
						addCCADetail(ccaList,c1);
						ccaTitles.add(c1.getTitle());

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");
					} 

					else if(option == 9) {
						System.out.println("\n-----VIEW CCA DETAILS-----");
						retrieveAllCCADetails(ccaList);
						viewAllCCADetails(ccaList);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");
					} 

					else if(option == 10) {
						System.out.println("\n-----UPDATE CCA DETAILS-----");
						updateCCADetail(ccaList);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");
					} 

					else if(option == 11) {
						System.out.println("\n-----DELETE CCA DETAILS-----");
						deleteCCADetail(ccaList);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");
					} 

					else if(option == 12) {
						System.out.println("\n-----ADD STUDENT TO CCA-----");
						retrieveAllStudentRegDetail(pList);
						viewAllStudentRegDetail(pList);
						addstudentCCA(pList, ccaList, ccaTitles);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");
					} 

					else if(option == 13) {
						System.out.println("\n-----VIEW STUDENTS IN CCA-----");
						viewstudentCCA(ccaTitles);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");
					} 
					else if(option == 14) {
						System.out.println("\n-----DELETE STUDENT IN CCA-----");
						viewstudentCCA(ccaTitles);
						deletestudentCCA(ccaTitles);

						System.out.println(catMsg);
						option = Helper.readInt("Enter option > ");
					}

				} if(option == 15) {
					System.out.println("\nSuccessfully logged out \n");
				}
			} 

			//------------------------------------------parent----------------------------------------------//

			else if (menuOption == 3) {
				System.out.println("\n-----LOGGED IN AS PARENT-----");

				int option = 0;
				String regMsg = "\n1. Register for a CCA\n2. Login\n3. View CCA details\n4. Quit";

				System.out.println(regMsg);
				option = Helper.readInt("Enter option > ");

				while (option != 4) {

					if(option == 1) {
						System.out.println("\n-----REGISTER FOR CCA-----");
						Parent r = inputRegStudent();
						addStudentAccount(sList,pList,r);

						System.out.println(regMsg);
						option = Helper.readInt("Enter option > ");
					}

					else if(option == 2) {
						System.out.println("\n-----LOGIN AS PARENT-----");
						checkLogin(pList, ccaList, ccaTitles);

						System.out.println(regMsg);
						option = Helper.readInt("Enter option > ");
					} else if(option == 3) {
						System.out.println("\n-----VIEW CCA DETAILS-----");
						retrieveAllCCADetails(ccaList);
						viewAllCCADetails(ccaList);

						System.out.println(regMsg);
						option = Helper.readInt("Enter option > ");
					} 
				} if(option == 4) {
					System.out.println("\nSuccessfully logged out \n");
				}
			}
		}
	}

	//------------------------------------------add student (USER STORY 1)----------------------------------------------//

	public static Student inputStudentDetail() {
		String ID = Helper.readString("Enter ID > ");
		String name = Helper.readString("Enter Name > ");
		String grade = Helper.readString("Enter Grade > ");
		String teacher = Helper.readString("Enter Teacher Name > ");
		String pname = Helper.readString("Enter Parent name > ");
		String pemail = Helper.readString("Enter Parent email > ");
		String pcontact = Helper.readString("Enter Parent contact > ");
		Student sd = null;

		if (Integer. parseInt(ID)<0) {
			System.out.println("-----Invalid ID-----");
		} 
		else {
			sd = new Student(ID, name, grade, teacher, pname, pemail, pcontact);;
		}
		return sd;
	}
	public static void addStudentDetail(ArrayList<Student> sList, Student sd) {

		sList.add(sd);
		System.out.println("-----Student Detail Added!-----");

	}

	//------------------------------------------view student (USER STORY 2)----------------------------------------------//

	public static String retrieveAllStudentdetail(ArrayList<Student> sList) {
		String output = "";

		for (int i = 0; i < sList.size(); i++) {

			output += String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", sList.get(i).getStudentID(), 
					sList.get(i).getStudentName(),sList.get(i).getGrade(),sList.get(i).getTeacher(),sList.get(i).getParentName()
					,sList.get(i).getParentEmail(),sList.get(i).getParentContact());
		}
		return output;
	}
	public static void viewAllStudentdetail(ArrayList<Student> sList) {
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("                                                               STUDENT DATABASE                                                               ");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "STUDENT ID", "STUDENT NAME", "GRADE",
				"TEACHER","PARENT NAME","PARENT EMAIL","PARENT CONTACT" );
		output += retrieveAllStudentdetail(sList);  
		System.out.println(output);
	}

	//------------------------------------------delete student (USER STORY 3)----------------------------------------------//

	public static void deleteDetails(ArrayList<Student> sList) {
		// write your code here
		viewAllStudentdetail(sList);
		String id = Helper.readString("Enter ID to delete > ");
		for (int i = 0; i < sList.size(); i++) {
			if (sList.get(i).getStudentID().equals(id)) {
				System.out.println("-----Student ID: " + id + " Deleted-----");
				sList.remove(i);

			}  
			else {
				System.out.println("-----Invalid ID provided-----");
			}

		}
	}

	//------------------------------------------add category (USER STORY 4)----------------------------------------------//

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

	//------------------------------------------view category (USER STORY 5)----------------------------------------------//

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
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("                                                                          CCA CATEGORIES                                                                          ");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		String output = retrieveAllCCACategories(categoryList);  
		System.out.println(output);
	}

	//------------------------------------------delete category (USER STORY 6)----------------------------------------------//

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

	//------------------------------------------add cca detail (USER STORY 7)----------------------------------------------//

	public static CCA inputCCADetail() {
		String title = Helper.readString("Enter title > ");
		String description = Helper.readString("Enter description > ");
		int size = Helper.readInt("Enter class size > ");
		String day = Helper.readString("Enter day of week> ");
		String time = Helper.readString("Enter duration of CCA > ");
		String venue = Helper.readString("Enter venue > ");
		String instructor = Helper.readString("Enter instructor > ");


		CCA c1 = new CCA(title, description, size, day, time, venue, instructor);

		return c1;
	}
	public static void addCCADetail(ArrayList<CCA> ccaList, CCA c1) {

		ccaList.add(c1);
		System.out.println("-----CCA Detail Added!-----");

	}

	//------------------------------------------view cca detail (USER STORY 8)----------------------------------------------//

	public static String retrieveAllCCADetails (ArrayList<CCA> ccaList) {
		String output = "";
		for (int i = 0; i < ccaList.size(); i++) { 

			output += String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", ccaList.get(i).getTitle(), ccaList.get(i).getDescription(), ccaList.get(i).getSize(), ccaList.get(i).getDay(), 
					ccaList.get(i).getTime(), ccaList.get(i).getVenue(), ccaList.get(i).getVenue() );
		}
		return output;

	}
	public static void viewAllCCADetails(ArrayList<CCA> ccaList) {
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("                                                                            CCA DETAILS                                                                            ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", "TITLE", "DESCRIPTION", "SIZE", "DAY", "TIME", "VENUE", "INSTRUCTOR"); 
		output += retrieveAllCCADetails(ccaList);  
		System.out.println(output);
	}

	//------------------------------------------delete cca detail (USER STORY 9)----------------------------------------------//

	public static void deleteCCADetail(ArrayList<CCA> ccaList) {
		viewAllCCADetails(ccaList);
		String title = Helper.readString("Enter CCA title to remove > ");
		String output = "";
		for (int i = 0; i < ccaList.size(); i++) {
			if (ccaList.get(i).getTitle().equalsIgnoreCase(title)) {
				ccaList.remove(i);
				output = "-----CCA Detail: " + title + " deleted successfully.-----";
				break;
			}  else {
				output = "-----CCA not found.-----";
			}
		}
		System.out.println(output);
	}

	//------------------------------------------add parent (USER STORY 10)----------------------------------------------//

	public static Parent inputRegStudent() { 

		String ID = Helper.readString("Enter student ID > "); 
		String name = Helper.readString("Enter Name > "); 
		String grade = Helper.readString("Enter Grade > "); 
		String teacher = Helper.readString("Enter Teacher Name > ");
		String pName = Helper.readString("Enter Parent Name > ");
		String pEmail = Helper.readString("Enter Parent Email > ");
		String pContact = Helper.readString("Enter Parent Contact > ");
		Parent sdReg = null;

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
			sdReg = new Parent(ID, name, grade, teacher, pName, pEmail, pContact, regID);
		} 
		return sdReg; 
	} 
	public static void addStudentAccount(ArrayList<Student> sList, ArrayList<Parent> pList, Parent sdReg) { 

		for (int j = 0; j < sList.size(); j++) {
			if (sdReg.getStudentID().equals(sList.get(j).getStudentID())) {

				pList.add(sdReg); 
				System.out.println("Student has successfully registered.\nCCA Registration ID: \n" + sdReg.getregID());
				return;
			} 
		}
		System.out.println("Register is unsuccessful. \n");
	}

	//------------------------------------------view parent (USER STORY 11)----------------------------------------------//

	public static String retrieveAllStudentRegDetail(ArrayList<Parent> pList) { 

		String output = ""; 

		for (int i = 0; i < pList.size(); i++) { 

			output += String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", pList.get(i).getStudentID(),  
					pList.get(i).getStudentName(), pList.get(i).getGrade(), pList.get(i).getTeacher(), pList.get(i).getParentName(), 
					pList.get(i).getParentEmail(), pList.get(i).getParentContact(), pList.get(i).getregID()); 
		} 
		return output; 
	} 
	public static void viewAllStudentRegDetail(ArrayList<Parent> pList) {
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("                                                                    REGISTERED STUDENT DETAILS                                                                    ");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "STUDENT ID", "STUDENT NAME", "GRADE", 
				"TEACHER", "PARENT NAME", "PARENT EMAIL", "PARENT CONTACT", "REGISTRATION ID" ); 
		output += retrieveAllStudentRegDetail(pList);  

		System.out.println(output); 
	}

	//------------------------------------------delete parent (USER STORY 12)----------------------------------------------//

	public static void deleteRegStudent(ArrayList<Parent> pList){ 

		viewAllStudentRegDetail(pList);
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

	//------------------------------------------login (USER STORY 13)----------------------------------------------//

	public static void checkLogin(ArrayList<Parent> pList, ArrayList<CCA> ccaList, ArrayList<String> ccaTitles) {
		String passID = Helper.readString("Enter CCA Registration ID > ");
		String stdID = Helper.readString("Enter Student ID > ");
		for (int i = 0; i < pList.size(); i++) {
			if (pList.get(i).getregID().equals(passID) && pList.get(i).getStudentID().equals(stdID)) {
				String stdName = pList.get(i).getStudentName();
				viewAllCCADetails(ccaList);
				addstudentLOGIN(pList, ccaList, ccaTitles, stdID, stdName);
				System.out.println("Success");
			} else {
				System.out.println("UnSuccess");
			}
		}
	}

	//------------------------------------------add student to cca (USER STORY 14)----------------------------------------------//

	private static void addstudentCCA(ArrayList<Parent> pList, ArrayList<CCA> ccaList,
			ArrayList<String> ccaTitles) {
		String studentCCAadd = Helper.readString("Enter student ID to add > ");
		for (int i = 0; i < ccaList.size(); i ++) {
			System.out.println(ccaList.get(i).getTitle());
		}
		String ccaAdd = Helper.readString("Enter cca to add Students to > ");
		//checks existing cca
		Boolean ccaFound = false;
		for (int a = 0; a < ccaList.size(); a++) {
			if (ccaAdd.equalsIgnoreCase(ccaList.get(a).getTitle())) {
				ccaFound = true;
				break;
			}
		}
		//checks existing student
		Boolean studentFound = false;
		String sName = "";
		String sID = "";
		for (int x = 0; x < pList.size(); x++) {
			if (studentCCAadd.equalsIgnoreCase(pList.get(x).getStudentID())) {
				sName = pList.get(x).getStudentName();
				sID = pList.get(x).getStudentID();
				studentFound = true;
				break;
			}
		}

		//adds student id and name to ccaTitle
		if (ccaFound == true && studentFound == true) {
			for (int y = 0; y < ccaTitles.size(); y++) {
				if (ccaTitles.get(y).equalsIgnoreCase(ccaAdd)) {
					String strNames = sName+"("+sID+"), ";
					ccaTitles.add(y+1, strNames);
					System.out.println("\n-----SUCCESSFUL-----");
					break;
				}
			}
		} else {
			System.out.println("\n-----UNSUCCESSFUL-----");
		}
	}

	//------------------------------------------view student in cca (USER STORY 15)----------------------------------------------//

	private static void viewstudentCCA(ArrayList<String> ccaTitles) {
		for (int i = 0; i < ccaTitles.size(); i ++) {
			System.out.println(ccaTitles.get(i));
		}
	}

	//------------------------------------------update student (USER STORY 16)----------------------------------------------//

	@SuppressWarnings("unused")
	public static void updateStudentDetail(ArrayList<Parent> pList,ArrayList<Student> sList) {
		viewAllStudentdetail(sList);
		if(sList.size()>0) {
			String id = Helper.readString("Enter Student ID to update > ");
			for(int i = 0; i < sList.size(); i++) {
				if(id.equals(sList.get(i).getStudentID())) {
					String newstudentname = Helper.readString("Enter New Student Name to update > ");
					String newgrade = Helper.readString("Enter New Grade to update > ");
					String newteacher = Helper.readString("Enter New Teacher to update > ");
					String newparentname = Helper.readString("Enter New Parent Name to update > ");
					String newparentemail = Helper.readString("Enter New Parent Email to update > ");
					String newparentcontact= Helper.readString("Enter New Parent Contact to update > ");

					sList.get(i).setStudentName(newstudentname);
					sList.get(i).setGrade(newgrade);
					sList.get(i).setTeacher(newteacher);
					sList.get(i).setParentName(newparentname);
					sList.get(i).setParentEmail(newparentemail);
					sList.get(i).setParentContact(newparentcontact);

					System.out.println("Student Updated");

					if(pList.size()>0) {
						for(int x = 0; x < sList.size(); x++) {
							if(id.equals(sList.get(i).getStudentID())) {
								pList.get(i).setStudentName(newstudentname);
								pList.get(i).setGrade(newgrade);
								pList.get(i).setTeacher(newteacher);
								pList.get(i).setParentName(newparentname);
								pList.get(i).setParentEmail(newparentemail);
								pList.get(i).setParentContact(newparentcontact);
								break;
							}
							else {
								break;
							}
						}
					}
					break;
				}
				else {
					System.out.println("INVALID ID PROVIDED");
					break;
				}
			}
		}
		else {
			System.out.println("No student registered\n");


		}
	}

	//------------------------------------------update cca detail (USER STORY 17)----------------------------------------------//

	public static void updateCCADetail(ArrayList<CCA> ccaList) {
		viewAllCCADetails(ccaList);
		String title = Helper.readString("Enter CCA title to update > ");
		String output = "";
		for (int i = 0; i < ccaList.size(); i++) {
			if (ccaList.get(i).getTitle().equalsIgnoreCase(title)) {
				String newTitle = Helper.readString("Enter new title > ");
				String newDesc = Helper.readString("Enter new description > ");
				int newSize = Helper.readInt("Enter new class size > ");
				String newDay = Helper.readString("Enter new day of week > ");
				String newTime = Helper.readString("Enter new time > ");
				String newVenue = Helper.readString("Enter new venue > ");
				String newInstruct = Helper.readString("Enter new instructor > ");
				ccaList.get(i).setTitle(newTitle);
				ccaList.get(i).setDescription(newDesc);
				ccaList.get(i).setSize(newSize);
				ccaList.get(i).setDay(newDay);
				ccaList.get(i).setTime(newTime);
				ccaList.get(i).setVenue(newVenue);
				ccaList.get(i).setInstructor(newInstruct);
				output = "-----CCA Detail: " + newTitle + " updated successfully.-----";
				break;
			}  else {
				output = "-----CCA not found.-----";
			}
		}
		System.out.println(output);
	}

	//------------------------------------------update category (USER STORY 18)----------------------------------------------//

	public static void updateCategories(ArrayList<String> categoryList) {
		viewAllCategories(categoryList);
		String cat = Helper.readString("Enter CCA category to update > ");
		String output = "";
		for (int i = 0; i < categoryList.size(); i++) {
			if (categoryList.get(i).equalsIgnoreCase(cat)) {
				String newCat = Helper.readString("Enter new category > ");
				categoryList.set(i, newCat);
				output = "-----Category: " + newCat + " updated successfully.-----";
				break;
			}  else {
				output = "-----Category not found.-----";
			}
		}
		System.out.println(output);
	}

	//------------------------------------------update parent (USER STORY 19)----------------------------------------------//

	@SuppressWarnings("unused")
	public static void updateParentDetail(ArrayList<Parent> pList,ArrayList<Student> sList) {
		viewAllStudentRegDetail(pList);

		String id = Helper.readString("Enter Student ID to update > ");

		//loop for reg list
		if(pList.size()>0) {
			for (int i = 0; i < pList.size(); i++) {
				if(id.equals(pList.get(i).getStudentID())) {
					String newstudentname = Helper.readString("Enter New Student Name to update > ");
					String newgrade = Helper.readString("Enter New Grade to update > ");
					String newteacher = Helper.readString("Enter New Teacher to update > ");
					String newparentname = Helper.readString("Enter New Parent Name to update > ");
					String newparentemail = Helper.readString("Enter New Parent Email to update > ");
					String newparentcontact= Helper.readString("Enter New Parent Contact to update > ");

					pList.get(i).setStudentName(newstudentname);
					pList.get(i).setGrade(newgrade);
					pList.get(i).setTeacher(newteacher);
					pList.get(i).setParentName(newparentname);
					pList.get(i).setParentEmail(newparentemail);
					pList.get(i).setParentContact(newparentcontact);
					System.out.println("Student Updated");

					if(sList.size()>0) {
						for(int x = 0; x < sList.size(); x++) {
							if(id.equals(sList.get(i).getStudentID())) {
								sList.get(i).setStudentName(newstudentname);
								sList.get(i).setGrade(newgrade);
								sList.get(i).setTeacher(newteacher);
								sList.get(i).setParentName(newparentname);
								sList.get(i).setParentEmail(newparentemail);
								sList.get(i).setParentContact(newparentcontact);
								break;
							}
							else {
								break;
							}
						}
					}

					break;

				}
				else {
					System.out.println("INVALID ID PROVIDED");
					break;
				}
			}

		}
		else {
			System.out.println("No student registered\n");

		}
	}

	//------------------------------------------delete student in cca (USER STORY 20)----------------------------------------------//

	private static void deletestudentCCA(ArrayList<String> ccaTitles) {

		String studentCCAdel = Helper.readString("Enter student ID to delete > ");
		for (int i = 0; i < ccaTitles.size(); i ++) {
			if (ccaTitles.get(i).contains(studentCCAdel)) {
				ccaTitles.remove(i);
			}
		}
	}

	//------------------------------------------other codes----------------------------------------------//


	private static void addstudentLOGIN(ArrayList<Parent> pList, ArrayList<CCA> ccaList,
			ArrayList<String> ccaTitles, String stdID, String stdName) {
		for (int i = 0; i < ccaList.size(); i ++) {
			System.out.println(ccaList.get(i).getTitle());
		}
		String ccaAdd = Helper.readString("Enter chosen CCA > ");
		//checks existing cca
		Boolean ccaFound = false;
		for (int a = 0; a < ccaList.size(); a++) {
			if (ccaAdd.equalsIgnoreCase(ccaList.get(a).getTitle())) {
				ccaFound = true;
				break;
			}
		}
		//checks existing student
		Boolean studentFound = false;
		String sName = "";
		String sID = "";
		for (int x = 0; x < pList.size(); x++) {
			if (stdName.equalsIgnoreCase(pList.get(x).getStudentID())) {
				sName = pList.get(x).getStudentName();
				sID = pList.get(x).getStudentID();
				studentFound = true;
				break;
			}
		}

		//adds student id and name to ccaTitle
		if (ccaFound == true && studentFound == true) {
			for (int y = 0; y < ccaTitles.size(); y++) {
				if (ccaTitles.get(y).equalsIgnoreCase(ccaAdd)) {
					String strNames = sName+"("+sID+"), ";
					ccaTitles.add(y+1, strNames);
					System.out.println("\n-----SUCCESSFUL-----");
					break;
				}
			}
		} else {
			System.out.println("\n-----UNSUCCESSFUL-----");
		}
	}

}


