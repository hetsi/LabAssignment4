package labassignment;

public class RosterAverage implements AvgDispenser{

	@Override
	public void calculateAverageForClassAPI(Roster roster) throws Exception {
		roster.calculateClassAverage();
		
	}

}
