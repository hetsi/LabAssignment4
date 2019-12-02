package labassignment;

import java.util.*;

public class Roster {
	String courseName;
	String number;
	List<Student> students;
	
	public Roster(String name, String number)
	{
		courseName = name;
		this.number = number;
		students = new ArrayList<>();
		
	}
	
	String getCourseName()
	{
		return courseName;
	}
	
	void addStudent(Student student)
	{
		students.add(student);
	}
	
	void calculateClassAverage() {
		OperationCalculateAverage avgCalc = new OperationCalculateAverage();
		
		System.out.println("~~~~~~ CLASS AVERAGE DATA ~~~~~~~");
		
		for(int i = 0; i<students.size();i++) {
			System.out.println(students.get(i).name + " : " + avgCalc.calculateClassAverage(students.get(i)));
		}
	}
	
	

}
