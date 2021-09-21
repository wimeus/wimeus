package modele.humain;

public class Student extends Humain{
	private String studentID;

	
	
	public Student(String lname, String fname,String studentID) {
		super(lname, fname);
		
		this.studentID=studentID;
	}

	public String getStudentId() {
		return studentID;
	}

	public void setIdetudiant(String idetudiant) {
		studentID= studentID;
	}

	@Override
	public String toString() {
		return "Studiant [StudentId=" + studentID + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
