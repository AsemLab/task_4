package jo.secondstep.singleresponsibility.correct;

import java.time.LocalDateTime;

public class Match {

	private LocalDateTime matchTime;
	
	private Team homeTeam;
	private Team awayTeam;
	
	private Stadium sadium;
	
	private Championship championship;
	
	
	public LocalDateTime getMatchTime() {
		return matchTime;
	}
	public void setMatchTime(LocalDateTime matchTime) {
		this.matchTime = matchTime;
	}
	public Team getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	public Team getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	public Stadium getSadium() {
		return sadium;
	}
	public void setSadium(Stadium sadium) {
		this.sadium = sadium;
	}
	public Championship getChampionship() {
		return championship;
	}
	public void setChampionship(Championship championship) {
		this.championship = championship;
	}
	
	
		
}
