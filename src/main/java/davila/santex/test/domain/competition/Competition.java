package davila.santex.test.domain.competition;

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

import davila.santex.test.domain.area.Area;

/**
 * Class model for Competition
 * 
 * @author remimarion
 */
@Entity
public class Competition {

	// ATTRIBUT
	@Id
	private String id;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "AREA")
    @NotFound(action = NotFoundAction.IGNORE)
	private Area area;
	private String name;
	private String code;
	private String plan;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "CURRENT_SEASON")
    @NotFound(action = NotFoundAction.IGNORE)
	private CompetitionSeason currentSeason;
/*	
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "id", fetch = FetchType.LAZY)
	private List<CompetitionSeason> seasons;
	*/
    private String lastUpdated;

	// CONSTRUCTOR

	public Competition() {
		super();
	}

	public Competition(String id, Area area, String name, String code, String plan, CompetitionSeason currentSeason,
			 String lastUpdated) {
		super();
		this.id = id;
		this.area = area;
		this.name = name;
		this.code = code;
		this.plan = plan;
		this.currentSeason = currentSeason;
	//	this.seasons = seasons;
		this.lastUpdated = lastUpdated;
	}

	// GET/SET

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public CompetitionSeason getCurrentSeason() {
		return currentSeason;
	}

	public void setCurrentSeason(CompetitionSeason currentSeason) {
		this.currentSeason = currentSeason;
	}

/*	public List<CompetitionSeason> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<CompetitionSeason> seasons) {
		this.seasons = seasons;
	}
*/
	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	// METHOD
/*	@Override
	public String toString() {
		return "Competition [id=" + id + ", area=" + area + ", name=" + name + ", code=" + code + ", plan=" + plan
				+ ", currentSeason=" + currentSeason + ", seasons=" + seasons + ", lastUpdated=" + lastUpdated + "]";
	}
	*/
	@Override
	public String toString() {
		return "Competition [id=" + id + ", area=" + area + ", name=" + name + ", code=" + code + ", plan=" + plan
				+ ", currentSeason=" + currentSeason +  ", lastUpdated=" + lastUpdated + "]";
	}
}
