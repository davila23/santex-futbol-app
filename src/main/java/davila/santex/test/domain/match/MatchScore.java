package davila.santex.test.domain.match;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 * Class model for Score
 * @author remimarion
 */
@Entity
public class MatchScore {
	
	//ATTRIBUT
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private String winner;
	private String duration;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ID")
    @NotFound(action = NotFoundAction.IGNORE)
	private MatchTime fullTime;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ID")
    @NotFound(action = NotFoundAction.IGNORE)
	private MatchTime halfTime;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ID")
    @NotFound(action = NotFoundAction.IGNORE)
	private MatchTime extraTime;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ID")
    @NotFound(action = NotFoundAction.IGNORE)
	private MatchTime penalties;
	
	//CONSTRUCTOR
	public MatchScore(String id,String winner, String duration, MatchTime fullTime, MatchTime halfTime,
			MatchTime extraTime, MatchTime penalties) {
		super();
		this.id = id;
		this.winner = winner;
		this.duration = duration;
		this.fullTime = fullTime;
		this.halfTime = halfTime;
		this.extraTime = extraTime;
		this.penalties = penalties;
	}

	//GET/SET
	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public MatchTime getFullTime() {
		return fullTime;
	}

	public void setFullTime(MatchTime fullTime) {
		this.fullTime = fullTime;
	}

	public MatchTime getHalfTime() {
		return halfTime;
	}

	public void setHalfTime(MatchTime halfTime) {
		this.halfTime = halfTime;
	}

	public MatchTime getExtraTime() {
		return extraTime;
	}

	public void setExtraTime(MatchTime extraTime) {
		this.extraTime = extraTime;
	}

	public MatchTime getPenalties() {
		return penalties;
	}

	public void setPenalties(MatchTime penalties) {
		this.penalties = penalties;
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
		return "MatchScoreModel [winner=" + winner + ", duration=" + duration + ", fullTime=" + fullTime + ", halfTime="
				+ halfTime + ", extraTime=" + extraTime + ", penalties=" + penalties + "]";
	}


}
