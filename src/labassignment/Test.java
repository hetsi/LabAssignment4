package labassignment;

public class Test {

	public static void main(String[] args) {
	
		Student student1 = new Student("Hetsi");
		student1.addAssignmentScore(100);
		student1.addAssignmentScore(95);
		student1.addAssignmentScore(50);
		
		student1.addExamScore(100);
		student1.addExamScore(95);
		
		ContextStrategy algo1 = new ContextStrategy(new OperationCalculateAverage());
		ContextStrategy algo2 = new ContextStrategy(new DropScoreAverage());
		
		System.out.println("result by algorithm 1 " + algo1.executeAlgorithm(student1));
		System.out.println("result by algorithm 2 " +algo2.executeAlgorithm(student1));
		System.out.println("result by algorithm 1 " +algo1.executeAlgorithm(student1));
		
	}

}
