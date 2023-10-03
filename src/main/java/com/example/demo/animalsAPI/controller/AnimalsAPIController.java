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
	public String getPets(Model model) throws IOException {
		List<Animals> animalsAllList = animalsAPIService.getAllAnimals();
		
		model.addAttribute("animalsAllList", animalsAllList);
		
		return "animalsAPI.html";
	}
	
	//動物の詳細表示
	@GetMapping("animalsDetail")
	public String getPets(@RequestParam("id") int id, Model model) throws IOException {
		List<Animals> animalsList = animalsAPIService.getAnimals(id);
		
		model.addAttribute("animalsList", animalsList);
		return "animalsDetail.html";
	}
	
}