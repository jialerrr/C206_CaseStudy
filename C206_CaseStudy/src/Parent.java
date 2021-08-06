
public class Parent {
	private String studentID;
	private String studentName;
	private String grade;
	private String teacher;
	private String parentName;
	private String parentEmail;
	private String parentContact;
	private String regID;
	
	public Parent(String studentID, String studentName, String grade, String teacher, String parentName,
			String parentEmail, String parentContact, String regID) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.teacher = teacher;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.parentContact = parentContact;
		this.regID = regID;
	}

	public String getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getGrade() {
		return grade;
	}

	public String getTeacher() {
		return teacher;
	}

	public String getParentName() {
		return parentName;
	}

	public String getParentEmail() {
		return parentEmail;
	}

	public String getParentContact() {
		return parentContact;
	}
	
	public String getregID() {
		return regID;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public void setParentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}

	public void setParentContact(String parentContact) {
		this.parentContact = parentContact;
	}
	
	
	
	
}
