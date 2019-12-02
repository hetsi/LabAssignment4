package labassignment;
import java.util.*;

public class Student implements ObserverMethods{
	String name;
	List<Double> assignmentScores;
	List<Double> examScores;
	List<Observer> observers = new ArrayList<>();
	
	
	public Student(String name)
	{
		this.name = name;
		assignmentScores = new ArrayList<>();
		examScores = new ArrayList<>();
	}
	
	void addAssignmentScore(double as) 
	{
		assignmentScores.add(as);
		notifyObservers();
	}
	
	void addExamScore(double es) 
	{
		examScores.add(es);
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void unregisterObserver(Observer o) {
		observers.remove(observers.indexOf(o));
		
		
	}

	@Override
	public void notifyObservers() {
		for (Iterator<Observer> it = observers.iterator(); it.hasNext();)
		{
			Observer o = it.next();
			o.update(this);
		}
		
	}

}
