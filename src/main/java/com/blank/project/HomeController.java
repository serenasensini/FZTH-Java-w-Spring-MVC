package com.blank.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	// value= URI of the request
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(Model view) {

		//View: we could add attributes to the view
		view.addAttribute("message", "hello world" );
		//name of the jsp
		return "home";
	}
	
}
