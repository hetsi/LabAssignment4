package labassignment;

import java.util.Collections;

public class DropScoreAverage implements Strategy{

	@Override
	public double calculateClassAverage(Student student) {
		
		Double assignmentSum = student.assignmentScores.stream().reduce(0.0, (a,b) -> a+b);
		Double assignmentAvg = assignmentSum / student.assignmentScores.size();
		
		if(student.assignmentScores.size()>=2) {
			Collections.sort(student.assignmentScores);
			assignmentAvg = assignmentAvg * student.assignmentScores.size() - student.assignmentScores.get(0);
			assignmentAvg /= student.assignmentScores.size() - 1;
		}
		
		Double examSum = student.examScores.stream().reduce(0.0, (a,b) -> a+b);
		Double examAvg = examSum / student.examScores.size();
		
		Double studentAverage = (assignmentAvg * 0.4) + (examAvg * 0.6);
		
		return studentAverage;
	}

}
