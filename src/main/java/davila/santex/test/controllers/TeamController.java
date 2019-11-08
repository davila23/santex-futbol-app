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
import davila.santex.test.domain.team.Team;
import davila.santex.test.domain.team.TeamList;
import davila.santex.test.util.ConfigAuth;
import davila.santex.test.util.jfdataManager.JfdataManager;

@RestController
@RequestMapping("/team")
public class TeamController {

	@GetMapping(value = "/getTeamsByCompetition")
	public TeamList getTeamsByCompetition(@RequestParam("idCompetition") Integer id) {
		JfdataManager jfdataManager = new JfdataManager(ConfigAuth.TOKEN);
		TeamList actual = jfdataManager.getTeamsByCompetition(id);

		return actual;
	}

	@GetMapping(value = "/getTeam")
	public Team getTeam(@RequestParam("idTeam") Integer id) {
		JfdataManager jfdataManager = new JfdataManager(ConfigAuth.TOKEN);
		Team actual = jfdataManager.getTeam(id);

		return actual;

	}

}
