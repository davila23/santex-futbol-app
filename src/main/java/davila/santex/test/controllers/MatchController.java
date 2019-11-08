package davila.santex.test.controllers;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import davila.santex.test.domain.competition.Competition;
import davila.santex.test.domain.competition.CompetitionList;
import davila.santex.test.domain.match.Match;
import davila.santex.test.domain.match.MatchList;
import davila.santex.test.util.ConfigAuth;
import davila.santex.test.util.jfdataManager.JfdataManager;

@RestController
@RequestMapping("/match")
public class MatchController {

	@GetMapping(value = "/getMatch")
	public Match getMatch(@RequestParam("idMatch") Integer id) {
		JfdataManager jfdataManager = new JfdataManager(ConfigAuth.TOKEN);
		Match actual = jfdataManager.getMatch(238997);

		return actual;
	}

	@GetMapping(value = "/getMatchByCompetition")
	public MatchList getMatchByCompetition(@RequestParam("idCompetition") Integer id) {
		JfdataManager jfdataManager = new JfdataManager(ConfigAuth.TOKEN);
		MatchList actual = jfdataManager.getMatchesByCompetition(id);

		return actual;

	}

	@GetMapping(value = "/getMatchByTeam")
	public MatchList getMatchByTeam(@RequestParam("idTeam") Integer id) {
		JfdataManager jfdataManager = new JfdataManager(ConfigAuth.TOKEN);
		MatchList actual = jfdataManager.getMatchesByTeam(id);

		return actual;

	}
}
