
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private ArrayList<Student> ParentList;
	private ArrayList<String> CategoryList;
	private ArrayList<Parent> regIDList;
	private ArrayList<CCA> ccaList;
	private Student p1;
	private String c1;
	private Parent r1;
	private CCA ca1;
	private String allstudent;
	private String allstudentReg;
	private String allCCAdetail;

	//Testing add Parents

	@Before
	public void setUp() throws Exception {
		// prepare test data
		p1 = new Student("ID", "name","grade","teacher", "pname","pemail","pcontact");
		c1 = "Sports";
		r1 = new Parent("ID", "name","grade","teacher", "pname","pemail","pcontact", "pReg");;
		ca1 = new CCA("title", "description", 1, "day", "time", "venue", "instructor");
		ParentList = new ArrayList<Student>();
		CategoryList = new ArrayList<String>();
		regIDList = new ArrayList<Parent>();
		ccaList = new ArrayList<CCA>();
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
		C206_CaseStudy.addStudentDetail(ParentList, p1);
		C206_CaseStudy.addStudentAccount(ParentList, regIDList, r1);    
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
		C206_CaseStudy.addStudentDetail(ParentList, p1);
		C206_CaseStudy.addStudentAccount(ParentList, regIDList, r1);
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
		C206_CaseStudy.addStudentDetail(ParentList, p1);
		C206_CaseStudy.addStudentAccount(ParentList, regIDList, r1);
		assertEquals("Test if that the  arraylist size is 1?", 1, regIDList.size());

		//remove p1
		regIDList.remove(r1);
		assertEquals("Test if parent list is empty", 0, regIDList.size());
	}
	
	@Test
	public void testAddCCA() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid arraylist to add to", ccaList);

		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addCCADetail(ccaList, ca1);    
		assertEquals("Test if that  arraylist size is 1?", 1, ccaList.size());

		//The item just added is as same as the first item of the list
		assertSame("Test that student is added same as 1st item of the list?", ca1, ccaList.get(0));

	}

	//------------------------------------------test view all parent----------------------------------------------//

	@Test
	public void testRetrieveAllCCA() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid  arraylist to add to", ccaList);

		//test if the list of parent retrieved from the C206_CaseStudy is empty
		String allDetail = C206_CaseStudy.retrieveAllCCADetails(ccaList);
		String testOutput = "";
		assertEquals("Check that ViewAllCCADetail", testOutput, allDetail);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addCCADetail(ccaList, ca1);
		assertEquals("Test if that the  arraylist size is 1?", 1, ccaList.size());

		//test if the expected output string same as the list of student retrieved from the C206_CaseStudy
		allCCAdetail= C206_CaseStudy.retrieveAllCCADetails(ccaList);

		testOutput = String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n","title", "description", 1, "day", "time", "venue", "instructor");

		assertEquals("Check that retrieveAllCCADetails", testOutput, allCCAdetail);

	}

	//------------------------------------------test delete parent----------------------------------------------//

	@Test
	public void testDeleteCCA() {
		//fail("Not yet implemented");
		// write your code here

		assertNotNull("Test if there is valid arraylist to add to", ccaList);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addCCADetail(ccaList, ca1);
		assertEquals("Test if that the  arraylist size is 1?", 1, ccaList.size());

		//remove p1
		ccaList.remove(ca1);
		assertEquals("Test if cca detail list is empty", 0, ccaList.size());

	}
	
//	@Test
//	  public void testAddStudenttoCCA() {
//	   assertNotNull("Test if there is valid arraylist to add to", ccaList);
//	   //Given an empty list, after adding 1 item, the size of the list is 1
//	   C206_CaseStudy.addstudentCCA(regIDList,ccaList, ccaTitles);  
//	   assertEquals("Test if that arraylist size is 1?", 1, ccaList.size());
//	  }
//	  @Test
//	  public void testDelStudentfrCCA() {
//	   assertNotNull("Test if there is valid arraylist to add to", ccaList);
//	   
//	   C206_CaseStudy.addstudentCCA(regIDList,ccaList, ccaTitles); 
//	   assertEquals("Test if that the  arraylist size is 1?", 1, ccaList.size());
//
//	   //Given an empty list, after adding 1 item, the size of the list is 1
//	   for (int i = 0; i < ccaTitles.size(); i++) {
//	    if (ccaTitles.contains(ParentList.get(i).getStudentID())) {
//	     assertTrue("Check that student id is inside CCA titles",ccaTitles.contains(ParentList.get(i).getStudentID()));
//	     C206_CaseStudy.deletestudentCCA(ccaTitles);  
//	     assertEquals("Test if that arraylist size is 0?", 0, ccaList.size());
//	    }
//	   }
//	  }
//	  @Test
//	  public void testViewstudentCCA() {
//	   assertNotNull("Test if there is valid arraylist to add to", ccaList);
//	   
//	   C206_CaseStudy.addstudentCCA(regIDList,ccaList, ccaTitles); 
//	   assertTrue("Check that student id is registered",regIDList.add(r1));
//	   assertTrue("Check that cca is registered in cca list",ccaList.add(ca1));
//	   assertTrue("Check that student id is registered",regIDList.add(r1));
//	   
//	   assertEquals("Test if that the  arraylist size is 1?", 1, ccaList.size());
//	   
//	   //Given an empty list, after adding 1 item, the size of the list is 1
//	   C206_CaseStudy.viewstudentCCA(ccaTitles);  
//	   assertEquals("Test if that arraylist size is 1?", 1, ccaList.size());
//	  }

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
