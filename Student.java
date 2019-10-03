package student.java;
import java.util.ArrayList;


public class Student {
	private int studentID;
	private String lastName;
	public String firstName;
	ArrayList<Double> grades = new ArrayList<>();

	// Constructor
	// syntax: [access modifier] ClassName(...) { ... }
	public Student(int id, String fname, String lname) {
		studentID = id;
		firstName = fname;
		lastName = lname;
	}
	public double computeAverage() {
		// does not need to take parameters because
		// we have the values stored in the 'attributes' above already
		
		int total = 0;
		for (int i = 0; i < grades.size(); i++) {
		total += grades.get(i);
		}
		double avg = total / grades.size();
		return avg; 
	}
	
	public void addGrade(double grade) {
		grades.add(grade);
	}
	
	public int getStudentID() {
		return this.studentID;
	}

}



    
    

   