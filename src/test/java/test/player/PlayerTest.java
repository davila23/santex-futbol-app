package test.player;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import davila.santex.test.domain.player.Player;
import davila.santex.test.util.jfdataManager.JfdataManager;
import test.config.ConfigTest;

/**
 * JUnit class test for Player
 * All Player methods are tested in this class
 * @author remimarion
 */

public class PlayerTest {

	@Test
	public void testGetPlayer() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		Player actual = jfdataManager.getPlayer(44);
		
		assertNotNull(actual);
		assertNotNull(actual.getName());
	}
}
