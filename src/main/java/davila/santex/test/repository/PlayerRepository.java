package davila.santex.test.repository;

import org.springframework.data.repository.CrudRepository;

import davila.santex.test.domain.player.Player;

public interface PlayerRepository extends CrudRepository<Player, String> {
	
}
