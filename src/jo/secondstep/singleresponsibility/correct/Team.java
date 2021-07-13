package jo.secondstep.singleresponsibility.correct;

public class Team {

	private String name;
	private Stadium homeStadium;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Stadium getHomeStadium() {
		return homeStadium;
	}
	public void setHomeStadium(Stadium homeStadium) {
		this.homeStadium = homeStadium;
	}
	
	
}
