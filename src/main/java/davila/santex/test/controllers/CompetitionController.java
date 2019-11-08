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
import davila.santex.test.domain.player.Player;
import davila.santex.test.domain.team.Team;
import davila.santex.test.domain.team.TeamList;
import davila.santex.test.repository.CompetitionRepository;
import davila.santex.test.repository.PlayerRepository;
import davila.santex.test.repository.TeamRepository;
import davila.santex.test.util.ConfigAuth;
import davila.santex.test.util.jfdataManager.JfdataManager;

@RestController
@RequestMapping("/competition")
public class CompetitionController {
	
	@Autowired
	CompetitionRepository competitionRepository;
	@Autowired
	TeamRepository teamRepository;
	@Autowired
	PlayerRepository playerRepository;

	@GetMapping(value = "/getAllCompetition")
	public CompetitionList getAllCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigAuth.TOKEN);
		CompetitionList actual = jfdataManager.getAllCompetitions();

		return actual;
	}

	@GetMapping(value = "/getCompetition")
	public Competition getCompetition(@RequestParam("idCompetition") Integer id) {
		JfdataManager jfdataManager = new JfdataManager(ConfigAuth.TOKEN);
		Competition actual = jfdataManager.getCompetition(id);

		return actual;

	}

	@GetMapping(value = "/import-ligue")
	public void importCompetition(@RequestParam("idCompetition") Integer id) {
		JfdataManager jfdataManager = new JfdataManager(ConfigAuth.TOKEN);

		Competition actual = jfdataManager.getCompetition(id);
		competitionRepository.save(actual);

		TeamList teams = jfdataManager.getTeamsByCompetition(id);

		for (Team team : teams.getTeams()) {

			teamRepository.save(team);

			for (Player player : team.getSquad())

				playerRepository.save(player);

		}

	}
}
