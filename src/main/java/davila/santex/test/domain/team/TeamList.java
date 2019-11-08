package davila.santex.test.domain.team;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import davila.santex.test.domain.competition.Competition;
import davila.santex.test.domain.competition.CompetitionSeason;

/**
 * Class model for Team list
 * 
 * @author remimarion
 */
@Entity
public class TeamList {

	// ATTRIBUT
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private String count;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "COMPETITION")
	@NotFound(action = NotFoundAction.IGNORE)
	private Competition competition;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "SEASON")
	@NotFound(action = NotFoundAction.IGNORE)
	private CompetitionSeason season;

    @OneToMany(cascade=CascadeType.ALL,mappedBy = "id", fetch = FetchType.LAZY)
	private List<Team> teams;

	// CONSTRUCTOR
	public TeamList() {
		super();
	}

	public TeamList(String count, Competition competition, CompetitionSeason season, List<Team> teams) {
		super();
		this.count = count;
		this.competition = competition;
		this.season = season;
		this.teams = teams;
	}

	// GET/SET
	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public CompetitionSeason getSeason() {
		return season;
	}

	public void setSeason(CompetitionSeason season) {
		this.season = season;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// METHOD
	@Override
	public String toString() {
		return "TeamListModel [count=" + count + ", competition=" + competition + ", season=" + season + ", teams="
				+ teams + "]";
	}
}
