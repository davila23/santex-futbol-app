package davila.santex.test.repository;

import org.springframework.data.repository.CrudRepository;

import davila.santex.test.domain.area.Area;

public interface AreaRepository extends CrudRepository<Area, String> {
	
}
