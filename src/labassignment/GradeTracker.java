package labassignment;

public class GradeTracker implements Observer{

	private String calculateGrade(Student student) {
		String grade;
		double Average = new OperationCalculateAverage().calculateClassAverage(student);
		
		if(Average>=90) {
			grade ="A";
			
		}else if (Average >= 80) {
			grade = "B";
			
		}else if (Average >= 70) {
			grade = "C";
			
		}else if (Average >= 60) {
			grade = "D";
			
		}else {
			grade = "F";
		}
		
		return grade;
	}
	
	public void printGrade(Student student) {
		System.out.println("Grade of the student : " + student.name+ " = " + calculateGrade(student));
	}

	@Override
	public void update(Student student) {
		printGrade(student);
		
	}
}
