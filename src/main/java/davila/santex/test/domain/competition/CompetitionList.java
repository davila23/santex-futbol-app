package davila.santex.test.domain.competition;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Class model for Competition list
 * @author remimarion
 */
@Entity
public class CompetitionList{
	
	//ATTRIBUT
	@Id
	private String id;

    @OneToMany(cascade=CascadeType.ALL,mappedBy = "id", fetch = FetchType.LAZY)
	private List<Competition> competitions;
	
	//CONSTRUCTOR
	public CompetitionList(String id, List<Competition> competitions) {
		super();
		this.id = id;
		this.competitions = competitions;
	}

	//GET/SET
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Competition> getCompetitions() {
		return competitions;
	}

	public void setCompetitions(List<Competition> competitions) {
		this.competitions = competitions;
	}

	//METHOD
	@Override
	public String toString() {
		return "CompetitionList [id=" + id + ", competitions=" + competitions + "]";
	}
}
