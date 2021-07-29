
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
  private ArrayList<Parent> ParentList;
  private ArrayList<String> CategoryList;
  private Parent p1;
  private String allstudent;
  
  //Testing add Parents

  public void setUp() throws Exception {
    // prepare test data
    p1 = new Parent("ID", "name","grade","teacher", "pname","pemail","pcontact");
    ParentList= new ArrayList<Parent>();
  }
  
  public void testAddParent() {
    // Item list is not null, so that can add a new item
    assertNotNull("Test if there is valid  arraylist to add to", ParentList);
    
    //Given an empty list, after adding 1 item, the size of the list is 1
    C206_CaseStudy.addStudentDetail(ParentList, p1);    
    assertEquals("Test if that  arraylist size is 1?", 1, ParentList.size());
    
    //The item just added is as same as the first item of the list
    assertSame("Test that student is added same as 1st item of the list?", p1, ParentList.get(0));
    
  }
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
  
    assertEquals("Check that ViewAllCamcorderlist", testOutput, allstudent);
    
  }
  public void testDelete() {
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
  public void tearDown() throws Exception {
    p1 = null;
    ParentList = null;

  }
}
