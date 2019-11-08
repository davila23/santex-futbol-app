package davila.santex.test.domain.match;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class model for Referees
 * @author remimarion
 */
@Entity
public class MatchReferees {
	
	//ATTRIBUT
	@Id
	private String id;
	private String name;
	private String nationality;
	
	//CONSTRUCTOR
	public MatchReferees(String id, String name, String nationality) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
	}

	//GET/SET
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	//METHOD
	@Override
	public String toString() {
		return "MatchRefereesModel [id=" + id + ", name=" + name + ", nationality=" + nationality + "]";
	}
	
}
