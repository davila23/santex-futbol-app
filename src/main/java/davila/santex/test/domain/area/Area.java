package davila.santex.test.domain.area;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * CLass model for CompetitionArea, for Competition Class
 * @author remimarion
 */
@Entity
public class Area {

	//ATTRIBUT
	@Id
	private String id;
	private String name;

	//CONSTRUCTOR
	public Area() {
		super();
	}
	
	public Area(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	//METHOD
	@Override
	public String toString() {
		return "CompetitionArea [id=" + id + ", name=" + name + "]";
	}
}
