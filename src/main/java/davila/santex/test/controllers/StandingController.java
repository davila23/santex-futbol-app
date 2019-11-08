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
import davila.santex.test.domain.standing.Standing;
import davila.santex.test.util.ConfigAuth;
import davila.santex.test.util.jfdataManager.JfdataManager;

@RestController
@RequestMapping("/standing")
public class StandingController {

	@GetMapping(value = "/getStanding")
	public Standing getStanding(@RequestParam("idCompetition") Integer id) {
		JfdataManager jfdataManager = new JfdataManager(ConfigAuth.TOKEN);
		Standing actual = jfdataManager.getStanding(id);

		return actual;
	}

}
