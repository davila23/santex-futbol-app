package test.team;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import davila.santex.test.domain.team.Team;
import davila.santex.test.domain.team.TeamList;
import davila.santex.test.util.jfdataManager.JfdataManager;
import test.config.ConfigTest;

/**
 * JUnit class test for Team
 * All Team methods are tested in this class
 * @author remimarion
 */
public class TeamTest {

	@Test
	public void testGetTeamsByCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		TeamList actual = jfdataManager.getTeamsByCompetition(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getTeams());
	}
	
	@Test
	public void testGetTeam() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		Team actual = jfdataManager.getTeam(18);
		
		assertNotNull(actual);
		assertNotNull(actual.getName());
	}
}
