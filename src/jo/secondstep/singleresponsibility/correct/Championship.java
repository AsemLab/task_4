package jo.secondstep.singleresponsibility.correct;

import java.util.List;

public class Championship {

	private String name;
	private List<Team> teams;
	private List<List<Match>> matchSchedule;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	public List<List<Match>> getMatchSchedule() {
		return matchSchedule;
	}
	public void setMatchSchedule(List<List<Match>> matchSchedule) {
		this.matchSchedule = matchSchedule;
	}
	
	
}
