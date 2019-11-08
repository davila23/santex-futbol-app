package davila.santex.test.repository;

import org.springframework.data.repository.CrudRepository;

import davila.santex.test.domain.standing.Standing;


public interface StandingRepository extends CrudRepository<Standing, String> {

}
