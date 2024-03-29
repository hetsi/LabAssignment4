package labassignment;

public class Test {

	public static void main(String[] args) {
	
		Student student1 = new Student("Hetsi");
		student1.addAssignmentScore(100);
		student1.addAssignmentScore(95);
		student1.addAssignmentScore(50);
		
		student1.addExamScore(100);
		student1.addExamScore(95);
		
		/*GradeTracker gradeTracker = new GradeTracker();
		student1.registerObserver(gradeTracker);
		
		gradeTracker.printGrade(student1);
		*/
		
		Student student2 = new Student("Jack");
		student2.addAssignmentScore(95);
		student2.addExamScore(100);
		student2.addExamScore(90);
		
		Roster roster = new Roster("CS", "5800");
		
		roster.addStudent(student1);
		roster.addStudent(student2);
		
		RosterAverage avgRoster = new RosterAverage();
		try
		{
			avgRoster.calculateAverageForClassAPI(roster);
		}
		catch(Exception e) {
			
		}
		
		/*
		ContextStrategy algo1 = new ContextStrategy(new OperationCalculateAverage());
		ContextStrategy algo2 = new ContextStrategy(new DropScoreAverage());
		
		System.out.println("result by algorithm 1 " + algo1.executeAlgorithm(student1));
		System.out.println("result by algorithm 2 " +algo2.executeAlgorithm(student1));
		System.out.println("result by algorithm 1 " +algo1.executeAlgorithm(student1));
		*/
	}

}
