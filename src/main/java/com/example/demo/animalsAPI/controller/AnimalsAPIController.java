package com.example.demo.animalsAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.animalsAPI.data.Animals;
import com.example.demo.animalsAPI.service.AnimalsAPIService;

@Controller
public class AnimalsAPIController {

	private final AnimalsAPIService animalsAPIService;

	public AnimalsAPIController(AnimalsAPIService animalsAPIService) {
		this.animalsAPIService = animalsAPIService;
	}

	@GetMapping("animalsAPI")
	public String getPets() {
		return "animalsAPI.html";
	}
	
	@GetMapping("animalsResult")
	public String getPets(@RequestParam("id") int id, Model model) throws IOException {
		List<Animals> result = animalsAPIService.getAnimals(id);
		
		model.addAttribute("animalsList", result);
		return "animalsAPI.html";
	}
	
}