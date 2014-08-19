package com.testimoo.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
public class ApiController {
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {

		model.addAttribute("message", name);
		return "list";

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getRoot(ModelMap model) {
		model.addAttribute("message", "Welcome to Testimoo API!");
		return "index";
	}
}
