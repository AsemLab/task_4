package jo.secondstep.singleresponsibility.wrong;

import java.time.LocalDateTime;

public class Match {
	
	private LocalDateTime matchTime;
	
	private String homeTeam;
	private String awayTeam;
	
	private String stadium;
	private int stadiumCapacity;
	private String stadiumLocation;
	
	private String championship;

	public LocalDateTime getMatchTime() {
		return matchTime;
	}

	public void setMatchTime(LocalDateTime matchTime) {
		this.matchTime = matchTime;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public int getStadiumCapacity() {
		return stadiumCapacity;
	}

	public void setStadiumCapacity(int stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}

	public String getStadiumLocation() {
		return stadiumLocation;
	}

	public void setStadiumLocation(String stadiumLocation) {
		this.stadiumLocation = stadiumLocation;
	}

	public String getChampionship() {
		return championship;
	}

	public void setChampionship(String competition) {
		this.championship = competition;
	}
	
	
	
}
