package com.example.demo.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.multi.service.MultiService;

@Controller
public class MultiController {

	private final MultiService multiService;

	public MultiController(MultiService multiService) {
		this.multiService = multiService;
	}

	@GetMapping("multi")
	public String multi(Model model) {

		String result = "";
		// サービスクラスから得た結果をstring型でresultに格納
		result = String.valueOf(multiService.plus(10, 10));
		
		model.addAttribute("result", result);

		return "multi.html";
	}

}