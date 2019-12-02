package labassignment;
import java.util.*;

public class Student {
	String name;
	List<Double> assignmentScores;
	List<Double> examScores;
	
	public Student(String name)
	{
		this.name = name;
		assignmentScores = new ArrayList<>();
		examScores = new ArrayList<>();
	}
	
	void addAssignmentScore(double as) 
	{
		assignmentScores.add(as);
	}
	
	void addExamScore(double es) 
	{
		examScores.add(es);
	}

}
