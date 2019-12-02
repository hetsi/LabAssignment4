package labassignment;

public class OperationCalculateAverage implements Strategy{

	@Override
	public double calculateClassAverage(Student student) {
		
		Double assignmentSum = student.assignmentScores.stream().reduce(0.0, (a,b) -> a+b);
		Double examSum = student.examScores.stream().reduce(0.0, (a,b) -> a+b);
		
		Double assignmentAvg = assignmentSum / student.assignmentScores.size();
		Double examAvg = examSum / student.examScores.size();
		
		Double studentAverage = (assignmentAvg * 0.4) + (examAvg * 0.6);
		
		return studentAverage;
	}
	

}
