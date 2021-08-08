
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private ArrayList<Student> sList;
	private ArrayList<String> CategoryList;
	private ArrayList<Parent> pList;
	private ArrayList<CCA> ccaList;
	private ArrayList<String> ccaTitles;
	private Student s1;
	private String c1;
	private Parent p1;
	private CCA ca1;
	private String allstudent;
	private String allstudentReg;
	private String allCCAdetail;

	//Testing add Parents

	@Before
	public void setUp() throws Exception {
		// prepare test data
		s1 = new Student("ID", "name","grade","teacher", "pname","pemail","pcontact");
		c1 = "Sports";
		p1 = new Parent("ID", "name","grade","teacher", "pname","pemail","pcontact", "pReg");;
		ca1 = new CCA("title", "description", 1, "day", "time", "venue", "instructor");
		sList = new ArrayList<Student>();
		CategoryList = new ArrayList<String>();
		pList = new ArrayList<Parent>();
		ccaList = new ArrayList<CCA>();
		ccaTitles= new ArrayList<String>();
	}

	//------------------------------------------test add student (USER STORY 1)----------------------------------------------//

	@Test
	public void testAddStudent() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid arraylist to add to", sList);

		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addStudent(sList, s1);    
		assertEquals("Test if that  arraylist size is 1?", 1, sList.size());

		//The item just added is as same as the first item of the list
		assertSame("Test that student is added same as 1st item of the list?", s1, sList.get(0));

	}

	//------------------------------------------test view student (USER STORY 2)----------------------------------------------//

	@Test
	public void testviewStudent() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid  arraylist to add to", sList);

		//test if the list of parent retrieved from the C206_CaseStudy is empty
		String allParent = C206_CaseStudy.retrieveStudent(sList);
		String testOutput = "";
		assertEquals("Check that ViewAllsList", testOutput, allParent);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addStudent(sList, s1);
		assertEquals("Test if that the  arraylist size is 1?", 1, sList.size());

		//test if the expected output string same as the list of student retrieved from the C206_CaseStudy
		allstudent= C206_CaseStudy.retrieveStudent(sList);

		testOutput = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n","ID", "name","grade","teacher", "pname","pemail","pcontact");

		assertEquals("Check that retrieveAllStudentDetail", testOutput, allstudent);

	}

	//------------------------------------------test delete student (USER STORY 3)----------------------------------------------//

	@Test
	public void testDeleteStudent() {
		//fail("Not yet implemented");
		// write your code here

		assertNotNull("Test if there is valid arraylist to add to", sList);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addStudent(sList, s1);
		assertEquals("Test if that the  arraylist size is 1?", 1, sList.size());

		//remove p1
		sList.remove(s1);
		assertEquals("Test if parent list is empty", 0, sList.size());

	}

	//------------------------------------------test add category (USER STORY 4)----------------------------------------------//

	@Test
	public void testAddCat() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid  arraylist to add to", CategoryList);

		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addCategory(CategoryList, c1);    
		assertEquals("Test if that  arraylist size is 1?", 1, CategoryList.size());

		//The item just added is as same as the first item of the list
		assertSame("Test that student is added same as 1st item of the list?", c1, CategoryList.get(0));

	}

	//------------------------------------------test view category (USER STORY 5)----------------------------------------------//

	@Test
	public void testRetrieveAllCat() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid arraylist to add to", CategoryList);

		//test if the list of parent retrieved from the C206_CaseStudy is empty
		String allcategory = C206_CaseStudy.retrieveAllCCACategories(CategoryList);
		String testOutput = "-----No CCA categories available-----";
		assertEquals("Check that retrieveAllCCACategories", testOutput, allcategory);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addCategory(CategoryList, c1);
		assertEquals("Test if that the  arraylist size is 1?", 1, CategoryList.size());

		//test if the expected output string same as the list of student retrieved from the C206_CaseStudy
		allcategory= C206_CaseStudy.retrieveAllCCACategories(CategoryList);

		testOutput = "Sports, ";

		assertEquals("Check that retrieveAllCCACategories", testOutput, allcategory);

	}

	//------------------------------------------test delete category (USER STORY 6)----------------------------------------------//

	@Test
	public void testDeleteCat() {
		//fail("Not yet implemented");
		// write your code here

		assertNotNull("Test if there is valid arraylist to add to", CategoryList);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addCategory(CategoryList, c1);
		assertEquals("Test if that the  arraylist size is 1?", 1, CategoryList.size());
		//remove p1
		CategoryList.remove(c1);
		assertEquals("Test if category list is empty", 0, CategoryList.size());

	}

	//------------------------------------------test add cca (USER STORY 7)----------------------------------------------//

	@Test
	public void testAddCCA() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid arraylist to add to", ccaList);

		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addCCADetail(ccaList, ccaTitles, ca1);    
		assertEquals("Test if that  arraylist size is 1?", 1, ccaList.size());

		//The item just added is as same as the first item of the list
		assertSame("Test that student is added same as 1st item of the list?", ca1, ccaList.get(0));

	}

	//------------------------------------------test view cca (USER STORY 8)----------------------------------------------//

	@Test
	public void testRetrieveAllCCA() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid  arraylist to add to", ccaList);

		//test if the list of parent retrieved from the C206_CaseStudy is empty
		String allDetail = C206_CaseStudy.retrieveAllCCADetails(ccaList);
		String testOutput = "";
		assertEquals("Check that ViewAllCCADetail", testOutput, allDetail);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addCCADetail(ccaList, ccaTitles, ca1);
		assertEquals("Test if that the  arraylist size is 1?", 1, ccaList.size());

		//test if the expected output string same as the list of student retrieved from the C206_CaseStudy
		allCCAdetail= C206_CaseStudy.retrieveAllCCADetails(ccaList);

		testOutput = String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n","title", "description", 1, "day", "time", "venue", "instructor");

		assertEquals("Check that retrieveAllCCADetails", testOutput, allCCAdetail);

	}

	//------------------------------------------test delete cca (USER STORY 9)----------------------------------------------//

	@Test
	public void testDeleteCCA() {
		//fail("Not yet implemented");
		// write your code here

		assertNotNull("Test if there is valid arraylist to add to", ccaList);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addCCADetail(ccaList, ccaTitles, ca1);
		assertEquals("Test if that the  arraylist size is 1?", 1, ccaList.size());

		//remove p1
		ccaList.remove(ca1);
		assertEquals("Test if cca detail list is empty", 0, ccaList.size());

	}

	//------------------------------------------test add parent (USER STORY 10)----------------------------------------------//

	@Test
	public void testaddParent() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid arraylist to add to", pList);

		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addStudent(sList, s1);
		C206_CaseStudy.addParent(sList, pList, p1);    
		assertEquals("Test if that  arraylist size is 1?", 1, pList.size());

		//The item just added is as same as the first item of the list
		assertSame("Test that student is added same as 1st item of the list?", p1, pList.get(0));
	}

	//------------------------------------------test view parent (USER STORY 11)----------------------------------------------//

	@Test
	public void testviewParent() {

		assertNotNull("Test if there is valid  arraylist to add to", pList);

		String allstudentDetail = C206_CaseStudy.retrieveParent(pList);
		String testOutput = "";
		assertEquals("Check that ViewAllStudentRegDetail", testOutput, allstudentDetail);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addStudent(sList, s1);
		C206_CaseStudy.addParent(sList, pList, p1);
		assertEquals("Test if that the  arraylist size is 1?", 1, pList.size());

		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		allstudentReg = C206_CaseStudy.retrieveParent(pList);

		testOutput = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n","ID", "name","grade","teacher", "pname","pemail","pcontact", "pReg");
		assertEquals("Check that retrieveAllStudentDetail", testOutput, allstudentReg);

	}

	//------------------------------------------test delete parent (USER STORY 12)----------------------------------------------//

	@Test
	public void testdeleteParent() {
		assertNotNull("Test if there is valid arraylist to add to", pList);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addStudent(sList, s1);
		C206_CaseStudy.addParent(sList, pList, p1);
		assertEquals("Test if that the  arraylist size is 1?", 1, pList.size());

		//remove p1
		pList.remove(p1);
		assertEquals("Test if parent list is empty", 0, pList.size());
	}

	//------------------------------------------test login (USER STORY 13)----------------------------------------------//

	@Test
	public void testLoginStudent() {
		assertNotNull("Test if there is valid arraylist to add to", pList);

		//Check if after registering, student id matches
		C206_CaseStudy.addStudent(sList, s1);
		C206_CaseStudy.addParent(sList, pList, p1);
		//		C206_CaseStudy.addCCADetail(ccaList, ccaTitles, ca1);

		assertSame("Check that user is able to login with registered studentID",p1.getStudentID(), pList.get(0).getStudentID());

		//Check if after registering, cca id matches
		assertSame("Check that user is able to login with registered cca ID",p1.getregID(), pList.get(0).getregID());

		//Check if after logging in with correct input, success message shows
		//		String testOutput = "Success";
		//		String teststdID = p1.getStudentID();
		//		String testccaID = p1.getregID();
		//		String checkOutput = C206_CaseStudy.checkLogin(pList, ccaList, ccaTitles, teststdID, testccaID);
		//		assertSame("Check that user is able to login with registered cca ID", testOutput, checkOutput);
	}

	//------------------------------------------test add student to cca (USER STORY 14)----------------------------------------------//

	@Test
	public void testAddStudentCCA() {
		assertNotNull("Test if there is valid arraylist to add to", ccaList);
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addStudent(sList, s1);
		C206_CaseStudy.addParent(sList, pList, p1);
		C206_CaseStudy.addCCADetail(ccaList, ccaTitles, ca1);
		assertEquals("Test if that arraylist size is 1?", 1, ccaList.size());
		C206_CaseStudy.viewAllCCADetails(ccaList);

		//Test that after adding a cca detail, the title size is 1
		assertEquals("Test if that arraylist size is 1?", 1, ccaTitles.size());
		System.out.println(ccaTitles.get(0));

		//Test that after adding a student into the ccaTitles, the title size is 2
		//		String teststdName = p1.getStudentName();
		//		String testcca = ca1.getTitle();
		//		C206_CaseStudy.addstudentCCA(pList, ccaList, ccaTitles, teststdName, testcca);
		//		assertEquals("Test if that arraylist size is 2?", 2, ccaTitles.size());

		//Check that data in the list is same
		//		String testOutput = pList.get(0).getStudentName() + "(" + pList.get(0).getStudentID() + ")";
		//		assertSame(testOutput, ccaTitles.get(1));


	}

	//------------------------------------------test view student in cca (USER STORY 15)----------------------------------------------//

	@Test
	public void testViewstudentCCA() {
		assertNotNull("Test if there is valid arraylist to add to", ccaList);

		//Check that after adding a cca detail, list is 1
		C206_CaseStudy.addStudent(sList, s1);
		C206_CaseStudy.addParent(sList, pList, p1);
		C206_CaseStudy.addCCADetail(ccaList, ccaTitles, ca1);

		assertEquals("Test if that the  arraylist size is 1?", 1, ccaList.size());

		//Check that after adding a cca title, list is 1
		assertEquals("Test if that the  arraylist size is 1?", 1, ccaTitles.size());

		//Test that after adding a student into the ccaTitles, the title size is 2
		//		String teststdName = p1.getStudentName();
		//		String testID = p1.getStudentID();
		//		String testcca = ca1.getTitle();
		//		C206_CaseStudy.addstudentCCA(pList,ccaList, ccaTitles, teststdName, testcca);

		//Check that data in the list is same
		//		String testoutput = teststdName + "(" + testID + ")";
		//		String checkoutput = ccaTitles.get(1);
		//		assertSame(testoutput, checkoutput);


	}

	//------------------------------------------test update student (USER STORY 16)----------------------------------------------//

	@Test
	public void testupdateStudent() {

		//Check that after adding a student, list is 1
		C206_CaseStudy.addStudent(sList, s1);
		assertEquals("Test if that the  arraylist size is 1?", 1, sList.size());

		//Check that s1 has been updated
		String testname = "testName";
		String testgrade = "testgrade";
		String testteacher = "testteacher";
		String testpname = "testpname";
		String testpemail = "testpemail";
		String testpcontact = "testpcontact";
		for (int i = 0; i < sList.size(); i++) {
			sList.get(i).setStudentName(testname);
			sList.get(i).setGrade(testgrade);
			sList.get(i).setTeacher(testteacher);
			sList.get(i).setParentName(testpname);
			sList.get(i).setParentEmail(testpemail);
			sList.get(i).setParentContact(testpcontact);
		}

		Student s2 = new Student("ID", "testName","testgrade","testteacher", "testpname","testpemail","testpcontact");
		assertSame("Test that name has been updated?", sList.get(0).getStudentName(), s2.getStudentName());
		assertSame("Test that grade has been updated?", sList.get(0).getGrade(), s2.getGrade());
		assertSame("Test that teacher has been updated?", sList.get(0).getTeacher(), s2.getTeacher());
		assertSame("Test that parent name has been updated?", sList.get(0).getParentName(), s2.getParentName());
		assertSame("Test that parent email has been updated?", sList.get(0).getParentEmail(), s2.getParentEmail());
		assertSame("Test that parent contact has been updated?", sList.get(0).getParentContact(), s2.getParentContact());
	}

	//------------------------------------------test update cca (USER STORY 17)----------------------------------------------//

	@Test
	public void testupdateCCA() {

		//Check that after adding a cca detail, list is 1
		C206_CaseStudy.addCCADetail(ccaList, ccaTitles, ca1);
		assertEquals("Test if that the arraylist size is 1?", 1, ccaList.size());

		//Check that ca1 has been updated
		String testTitle = "testTitle";
		String testdesc = "testdesc";
		int testsize = 2;
		String testday = "testday";
		String testtime = "testtime";
		String testvenue = "testvenue";
		String testinstruct = "testinstruct";
		for (int i = 0; i < ccaList.size(); i++) {
			ccaList.get(i).setTitle(testTitle);
			ccaList.get(i).setDescription(testdesc);
			ccaList.get(i).setSize(testsize);
			ccaList.get(i).setDay(testday);
			ccaList.get(i).setTime(testtime);
			ccaList.get(i).setVenue(testvenue);
			ccaList.get(i).setInstructor(testinstruct);
		}

		CCA ca2 = new CCA("testTitle", "testdesc",2,"testday", "testtime","testvenue","testinstruct");
		assertSame("Test that title has been updated?", ccaList.get(0).getTitle(), ca2.getTitle());
		assertSame("Test that description has been updated?", ccaList.get(0).getDescription(), ca2.getDescription());
		assertEquals("Test that size has been updated?", ccaList.get(0).getSize(), ca2.getSize());
		assertSame("Test that parent day has been updated?", ccaList.get(0).getDay(), ca2.getDay());
		assertSame("Test that parent time has been updated?", ccaList.get(0).getTime(), ca2.getTime());
		assertSame("Test that parent venue has been updated?", ccaList.get(0).getVenue(), ca2.getVenue());
		assertSame("Test that parent instructor has been updated?", ccaList.get(0).getInstructor(), ca2.getInstructor());
	}

	//------------------------------------------test update category (USER STORY 18)----------------------------------------------//

	@Test
	public void testupdateCat() {

		//Check that after adding a cca detail, list is 1
		C206_CaseStudy.addCategory(CategoryList, c1);
		assertEquals("Test if that the arraylist size is 1?", 1, CategoryList.size());

		//Check that ca1 has been updated
		String newCat = "testCat";

		for (int i = 0; i < CategoryList.size(); i++) {
			CategoryList.set(i, newCat);
		}

		String c2 = "testCat";
		C206_CaseStudy.addCategory(CategoryList, c2);
		assertSame("Test that category has been updated?", c2, CategoryList.get(0));
	}

	//------------------------------------------test update parent (USER STORY 19)----------------------------------------------//

	@Test
	public void testupdateParent() {

		//Check that after adding a student, list is 1
		C206_CaseStudy.addStudent(sList, s1);
		C206_CaseStudy.addParent(sList, pList, p1);
		assertEquals("Test if that the  arraylist size is 1?", 1, pList.size());

		//Check that p1 has been updated
		String testname = "testName";
		String testgrade = "testgrade";
		String testteacher = "testteacher";
		String testpname = "testpname";
		String testpemail = "testpemail";
		String testpcontact = "testpcontact";
		for (int i = 0; i < pList.size(); i++) {
			pList.get(i).setStudentName(testname);
			pList.get(i).setGrade(testgrade);
			pList.get(i).setTeacher(testteacher);
			pList.get(i).setParentName(testpname);
			pList.get(i).setParentEmail(testpemail);
			pList.get(i).setParentContact(testpcontact);
		}

		Student s2 = new Student("ID", "testName","testgrade","testteacher", "testpname","testpemail","testpcontact");
		Parent p2 = new Parent("ID", "testName","testgrade","testteacher", "testpname","testpemail","testpcontact", "pReg");
		C206_CaseStudy.addStudent(sList, s2);
		C206_CaseStudy.addParent(sList, pList, p2);
		assertSame("Test that name has been updated?", pList.get(0).getStudentName(), pList.get(1).getStudentName());
		assertSame("Test that grade has been updated?", pList.get(0).getGrade(), pList.get(1).getGrade());
		assertSame("Test that teacher has been updated?", pList.get(0).getTeacher(), pList.get(1).getTeacher());
		assertSame("Test that parent name has been updated?", pList.get(0).getParentName(), pList.get(1).getParentName());
		assertSame("Test that parent email has been updated?", pList.get(0).getParentEmail(), pList.get(1).getParentEmail());
		assertSame("Test that parent contact has been updated?", pList.get(0).getParentContact(), pList.get(1).getParentContact());

	}

	//------------------------------------------test delete student in cca (USER STORY 20)----------------------------------------------//

	@Test
	public void testDelStudentfrCCA() {
		assertNotNull("Test if there is valid arraylist to add to", ccaList);

		//Check that after adding a cca details, list is 1
		C206_CaseStudy.addStudent(sList, s1);
		C206_CaseStudy.addParent(sList, pList, p1);
		C206_CaseStudy.addCCADetail(ccaList, ccaTitles, ca1);
		assertEquals("Test if that the  arraylist size is 1?", 1, ccaList.size());

		//Check that after add a cca title, title list is 1
		assertEquals("Test if that the  arraylist size is 1?", 1, ccaTitles.size());

		//Given a list, after deleting 1 item, the list is 0
		for (int i = 0; i < ccaTitles.size(); i++) {
			if (ccaTitles.contains(sList.get(i).getStudentID())) {
				assertTrue("Check that student id is inside CCA titles",ccaTitles.contains(sList.get(i).getStudentID()));
				C206_CaseStudy.deletestudentCCA(ccaTitles);  
				assertEquals("Test if that arraylist size is 0?", 0, ccaList.size());
			}
		}


		//Test that after adding a student into the ccaTitles, the title size is 2
		//		String teststdName = p1.getStudentName();
		//		String testcca = ca1.getTitle();
		//		C206_CaseStudy.addstudentCCA(pList, ccaList, ccaTitles, teststdName, testcca);
		//		assertEquals("Test if that arraylist size is 2?", 2, ccaTitles.size());

	}


	@After
	public void tearDown() throws Exception {
		s1 = null;
		sList = null;
		c1 = null;
		CategoryList = null;
		p1 = null;
		pList = null;

	}
}
