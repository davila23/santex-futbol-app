package davila.santex.test.domain.match;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class model for time score
 * @author remimarion
 */
@Entity
public class MatchTime {

	//ATTRIBUT
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	

	private String homeTeam;
	private String awayTeam;
	
	//CONSTRUCTOR
	public MatchTime(String homeTeam, String awayTeam) {
		super();
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}

	//GET/SET
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//MEtHOD
	@Override
	public String toString() {
		return "MatchTimeModel [homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + "]";
	}
}
