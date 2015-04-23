package it.test.ottavio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/welcome")
public class WelcomeController {
	
	@RequestMapping("index")
	public ModelAndView contattaci() throws Exception {
		return new ModelAndView("index");
	}
}
