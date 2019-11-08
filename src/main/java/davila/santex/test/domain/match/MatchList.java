package davila.santex.test.domain.match;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import davila.santex.test.domain.competition.Competition;

/**
 * Class model for Match list
 * @author remimarion
 */
@Entity
public class MatchList {

	//ATTRIBUT
	@Id
	private String count;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "COMPETITION")
    @NotFound(action = NotFoundAction.IGNORE)
	private Competition competition;
	
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "id", fetch = FetchType.LAZY)
	private List<Match> matches;
	
	//CONSTRUCTOR
	public MatchList(String count, Competition competition, List<Match> matches) {
		super();
		this.count = count;
		this.competition = competition;
		this.matches = matches;
	}

	//GET/SET
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

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	//METHOD
	@Override
	public String toString() {
		return "MatchListModel [count=" + count + ", competition=" + competition + ", matches=" + matches + "]";
	}
}
