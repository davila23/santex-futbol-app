package davila.santex.test.repository;

import org.springframework.data.repository.CrudRepository;

import davila.santex.test.domain.competition.Competition;
import davila.santex.test.domain.match.Match;

public interface MatchRepository extends CrudRepository<Match, String> {
	
}
