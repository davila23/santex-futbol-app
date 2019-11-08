package davila.santex.test.repository;

import org.springframework.data.repository.CrudRepository;

import davila.santex.test.domain.team.Team;


public interface TeamRepository extends CrudRepository<Team, String> {
	
}
