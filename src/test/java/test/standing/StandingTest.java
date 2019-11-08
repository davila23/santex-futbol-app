package test.standing;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import davila.santex.test.domain.standing.Standing;
import davila.santex.test.util.jfdataManager.JfdataManager;
import test.config.ConfigTest;

/**
 * JUnit class test for Standing
 * All Standing methods are tested in this class
 * @author remimarion
 */

public class StandingTest {

	@Test
	public void testGetStanding() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		Standing actual = jfdataManager.getStanding(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getStandings());
	}

}
