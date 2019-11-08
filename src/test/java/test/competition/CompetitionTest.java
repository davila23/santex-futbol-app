package test.competition;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import davila.santex.test.domain.competition.Competition;
import davila.santex.test.domain.competition.CompetitionList;
import davila.santex.test.util.jfdataManager.JfdataManager;
import test.config.ConfigTest;

/**
 * JUnit class test for Competition
 * All Competition methods are tested in this class
 * @author remimarion
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CompetitionTest {

	@Test
	public void testGetAllCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		CompetitionList actual = jfdataManager.getAllCompetitions();
		
		assertNotNull(actual);
		
		for (Competition competitionModel : actual.getCompetitions()) {
			assertNotNull(competitionModel.getId());
		}
	}

	@Test
	public void testGetCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		Competition actual = jfdataManager.getCompetition(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getId());
	}
}
