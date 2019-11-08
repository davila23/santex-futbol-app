package davila.santex.test.repository;

import org.springframework.data.repository.CrudRepository;

import davila.santex.test.domain.competition.Competition;

public interface CompetitionRepository extends CrudRepository<Competition, String> {
	
}
