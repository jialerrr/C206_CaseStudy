
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private ArrayList<Parent> ParentList;
	private ArrayList<String> CategoryList;
	private ArrayList<ParentReg> regIDList;
	private Parent p1;
	private String c1;
	private ParentReg r1;
	private String allstudent;
	private String allstudentReg;

	//Testing add Parents

	@Before
	public void setUp() throws Exception {
		// prepare test data
		p1 = new Parent("ID", "name","grade","teacher", "pname","pemail","pcontact");
		ParentList = new ArrayList<Parent>();
		CategoryList = new ArrayList<String>();
		c1 = "Sports";
		r1 = new ParentReg("ID", "name","grade","teacher", "pname","pemail","pcontact", "pReg");;
		regIDList = new ArrayList<ParentReg>();
	}

	//------------------------------------------test add parent----------------------------------------------//

	@Test
	public void testAddParent() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid arraylist to add to", ParentList);

		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addStudentDetail(ParentList, p1);    
		assertEquals("Test if that  arraylist size is 1?", 1, ParentList.size());

		//The item just added is as same as the first item of the list
		assertSame("Test that student is added same as 1st item of the list?", p1, ParentList.get(0));

	}

	//------------------------------------------test view all parent----------------------------------------------//

	@Test
	public void testRetrieveAllParent() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid  arraylist to add to", ParentList);

		//test if the list of parent retrieved from the C206_CaseStudy is empty
		String allParent = C206_CaseStudy.retrieveAllStudentdetail(ParentList);
		String testOutput = "";
		assertEquals("Check that ViewAllParentList", testOutput, allParent);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addStudentDetail(ParentList, p1);
		assertEquals("Test if that the  arraylist size is 1?", 1, ParentList.size());

		//test if the expected output string same as the list of student retrieved from the C206_CaseStudy
		allstudent= C206_CaseStudy.retrieveAllStudentdetail(ParentList);

		testOutput = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n","ID", "name","grade","teacher", "pname","pemail","pcontact");

		assertEquals("Check that retrieveAllStudentDetail", testOutput, allstudent);

	}

	//------------------------------------------test delete parent----------------------------------------------//

	@Test
	public void testDeleteParent() {
		//fail("Not yet implemented");
		// write your code here

		assertNotNull("Test if there is valid arraylist to add to", ParentList);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addStudentDetail(ParentList, p1);
		assertEquals("Test if that the  arraylist size is 1?", 1, ParentList.size());

		//remove p1
		ParentList.remove(p1);
		assertEquals("Test if parent list is empty", 0, ParentList.size());

	}

	//------------------------------------------test add category----------------------------------------------//

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

	//------------------------------------------test view all categories----------------------------------------------//

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

	//------------------------------------------test delete category----------------------------------------------//

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

	//------------------------------------------test add registered----------------------------------------------//

	@Test
	public void testaddstudentDetails() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid arraylist to add to", regIDList);

		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addStudentAccount(regIDList, r1);    
		assertEquals("Test if that  arraylist size is 1?", 1, regIDList.size());

		//The item just added is as same as the first item of the list
		assertSame("Test that student is added same as 1st item of the list?", r1, regIDList.get(0));
	}

	//------------------------------------------test view registered----------------------------------------------//

	@Test
	public void testretrieveAllStudentRegDetail() {

		assertNotNull("Test if there is valid  arraylist to add to", regIDList);

		String allstudentDetail = C206_CaseStudy.retrieveAllStudentRegDetail(regIDList);
		String testOutput = "";
		assertEquals("Check that ViewAllStudentRegDetail", testOutput, allstudentDetail);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addStudentAccount(regIDList, r1);
		assertEquals("Test if that the  arraylist size is 1?", 1, regIDList.size());

		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		allstudentReg = C206_CaseStudy.retrieveAllStudentRegDetail(regIDList);

		testOutput = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n","ID", "name","grade","teacher", "pname","pemail","pcontact", "pReg");
		assertEquals("Check that retrieveAllStudentDetail", testOutput, allstudentReg);

	}

	//------------------------------------------test delete registered----------------------------------------------//

	@Test
	public void deleteRegStudent() {
		assertNotNull("Test if there is valid arraylist to add to", regIDList);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addStudentAccount(regIDList, r1);
		assertEquals("Test if that the  arraylist size is 1?", 1, regIDList.size());

		//remove p1
		regIDList.remove(r1);
		assertEquals("Test if parent list is empty", 0, regIDList.size());
	}

	@After
	public void tearDown() throws Exception {
		p1 = null;
		ParentList = null;
		c1 = null;
		CategoryList = null;
		r1 = null;
		regIDList = null;

	}
}
