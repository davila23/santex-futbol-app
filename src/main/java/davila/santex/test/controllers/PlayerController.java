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
import davila.santex.test.util.ConfigAuth;
import davila.santex.test.util.jfdataManager.JfdataManager;

@RestController
@RequestMapping("/player")
public class PlayerController {

	@GetMapping(value = "/getPlayer")
	public Player getPlayer(@RequestParam("idPlayer") Integer id) {
		JfdataManager jfdataManager = new JfdataManager(ConfigAuth.TOKEN);
		Player actual = jfdataManager.getPlayer(id);

		return actual;
	}

}
