package davila.santex.test.domain.standing;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Class model for StandingTypeModel
 * @author remimarion
 */
@Entity
public class StandingType {

	//ATTRIBUT
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	


	private String stage;
	private String type;
	private String group;
	
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "id", fetch = FetchType.LAZY)
	private List<StandingTeam> table;
	
	//CONSTRUCTOR
	public StandingType(String stage, String type, String group, List<StandingTeam> table) {
		super();
		this.stage = stage;
		this.type = type;
		this.group = group;
		this.table = table;
	}

	//GET/SET
	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public List<StandingTeam> getTable() {
		return table;
	}

	public void setTable(List<StandingTeam> table) {
		this.table = table;
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
		return "StandingTypeModel [stage=" + stage + ", type=" + type + ", group=" + group + ", table=" + table + "]";
	}
}
