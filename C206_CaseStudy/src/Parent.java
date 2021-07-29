
public class Parent {
	private String studentID;
	private String studentName;
	private String grade;
	private String teacher;
	private String parentName;
	private String parentEmail;
	private String parentContact;
	
	public Parent(String studentID, String studentName, String grade, String teacher, String parentName,
			String parentEmail, String parentContact) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.teacher = teacher;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.parentContact = parentContact;
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
	
	
}