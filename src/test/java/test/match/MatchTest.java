package test.match;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import davila.santex.test.domain.match.Match;
import davila.santex.test.domain.match.MatchList;
import davila.santex.test.util.jfdataManager.JfdataManager;
import test.config.ConfigTest;

/**
 * JUnit class test for Match
 * All Match methods are tested in this class
 * @author remimarion
 */
public class MatchTest {

	@Test
	public void testGetMatch() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		Match actual = jfdataManager.getMatch(238997);
		
		assertNotNull(actual);
		assertNotNull(actual.getScore());
		assertNotNull(actual.getScore().getWinner());
	}
	
	@Test
	public void testGetMatchByCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		MatchList actual = jfdataManager.getMatchesByCompetition(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getMatches());
	}
	
	@Test
	public void testGetMatchByTeam() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		MatchList actual = jfdataManager.getMatchesByTeam(527);
		
		assertNotNull(actual);
		assertNotNull(actual.getMatches());
	}
}
