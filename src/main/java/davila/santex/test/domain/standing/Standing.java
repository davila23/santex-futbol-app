package davila.santex.test.domain.standing;

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
 * Class model for Standing list
 * @author remimarion
 */
@Entity
public class Standing {

	//ATTRIBUT
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "COMPETITION")
    @NotFound(action = NotFoundAction.IGNORE)
	private Competition competition;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "SEASON")
    @NotFound(action = NotFoundAction.IGNORE)
	private CompetitionSeason season;
	
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "id", fetch = FetchType.LAZY)
	private List<StandingType> standings;
	
	//CONSTRUCTOR
	public Standing(Competition competition, CompetitionSeason season,
			List<StandingType> standings) {
		super();
		this.competition = competition;
		this.season = season;
		this.standings = standings;
	}

	//GET/SET
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

	public List<StandingType> getStandings() {
		return standings;
	}

	public void setStandings(List<StandingType> standings) {
		this.standings = standings;
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
		return "StandingListModel [competition=" + competition + ", season=" + season + ", standings=" + standings
				+ "]";
	}
}
