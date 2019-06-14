package com.chucknorris.demochuck;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.chucknorris.demochuck.entity.Joke;
import com.chucknorris.demochuck.entity.ListOfJokes;

@Controller
public class JokeController {
	
	String url = "http://api.icndb.com/jokes/random/";
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/jokes")
	public ModelAndView getJokes(@RequestParam("quantity")Integer q) {
		List<Joke> jokes = rt.getForObject(url + q, ListOfJokes.class).getValue();
		//List<Joke> list = ((ListOfJokes) jokes).getValue();
		return new ModelAndView("random-jokes", "list", jokes);
	
	}

}
