package davila.santex.test.domain.standing;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import davila.santex.test.domain.team.Team;

/**
 * Class model for StandingTeamModel
 * @author remimarion
 */
@Entity
public class StandingTeam {

	//ATTRIBUT
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	private String StandingTeamModel;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "TEAM")
    @NotFound(action = NotFoundAction.IGNORE)
	private Team team;
	
	private String playedGames;
	private String won;
	private String draw;
	private String lost;
	private String points;
	private String goalsFor;
	private String goalsAgainst;
	private String goalDifference;
	
	//CONSTRUCTOR
	public StandingTeam(String standingTeamModel, Team team, String playedGames, String won, String draw,
			String lost, String points, String goalsFor, String goalsAgainst, String goalDifference) {
		super();
		this.StandingTeamModel = standingTeamModel;
		this.team = team;
		this.playedGames = playedGames;
		this.won = won;
		this.draw = draw;
		this.lost = lost;
		this.points = points;
		this.goalsFor = goalsFor;
		this.goalsAgainst = goalsAgainst;
		this.goalDifference = goalDifference;
	}

	//GET/SET
	public String getStandingTeamModel() {
		return StandingTeamModel;
	}

	public void setStandingTeamModel(String standingTeamModel) {
		StandingTeamModel = standingTeamModel;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getPlayedGames() {
		return playedGames;
	}

	public void setPlayedGames(String playedGames) {
		this.playedGames = playedGames;
	}

	public String getWon() {
		return won;
	}

	public void setWon(String won) {
		this.won = won;
	}

	public String getDraw() {
		return draw;
	}

	public void setDraw(String draw) {
		this.draw = draw;
	}

	public String getLost() {
		return lost;
	}

	public void setLost(String lost) {
		this.lost = lost;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public String getGoalsFor() {
		return goalsFor;
	}

	public void setGoalsFor(String goalsFor) {
		this.goalsFor = goalsFor;
	}

	public String getGoalsAgainst() {
		return goalsAgainst;
	}

	public void setGoalsAgainst(String goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}

	public String getGoalDifference() {
		return goalDifference;
	}

	public void setGoalDifference(String goalDifference) {
		this.goalDifference = goalDifference;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	//METHOD
	@Override
	public String toString() {
		return "StandingTeamModel [StandingTeamModel=" + StandingTeamModel + ", team=" + team + ", playedGames="
				+ playedGames + ", won=" + won + ", draw=" + draw + ", lost=" + lost + ", points=" + points
				+ ", goalsFor=" + goalsFor + ", goalsAgainst=" + goalsAgainst + ", goalDifference=" + goalDifference
				+ "]";
	}
}
