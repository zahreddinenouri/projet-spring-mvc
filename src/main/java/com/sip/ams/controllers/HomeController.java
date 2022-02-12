package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HomeController {
	@PostMapping("/result")
	@ResponseBody
	public String resultat(@RequestParam("nom") String n, @RequestParam("email") String e) {
		return " Vous avez taper un nom : " + n + " un email : " + e;
	}

	@RequestMapping("/info")
	public String info(Model model) {
		ArrayList<String> names = new ArrayList<>();
		names.add("oca");
		names.add("ocp");
		names.add("spring boot");
		model.addAttribute("names", names);

		String formation = "fullstack";
		model.addAttribute("workshop", formation);
		return "home/info";

	}

	@RequestMapping("/affichage")
	public String affichage() {
		return "home/affichage";

	}
}
