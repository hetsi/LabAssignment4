package labassignment;

public class ContextStrategy {
	
	private Strategy strategy;
	
	public ContextStrategy(Strategy strategy) {
		this.strategy = strategy;
		
	}
	
	public double executeAlgorithm(Student student) {
		return strategy.calculateClassAverage(student);
	}
	

}
