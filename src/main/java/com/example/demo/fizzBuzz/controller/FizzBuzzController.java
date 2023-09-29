package com.example.demo.fizzBuzz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.fizzBuzz.service.FizzBuzzService;

@Controller
public class FizzBuzzController {
	
	private final FizzBuzzService fizzBuzzService;
	
	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}
	
	@GetMapping("fizzbuzz")
	public String multi(Model model) {
		//Listでresultリストを作成
		List<String> result = new ArrayList<String>();
		// サービスクラスから結果をresultに格納
		result = fizzBuzzService.fizzBuzz();
		//resultの値をビューに渡す
		model.addAttribute("result", result);

		return "fizzbuzz.html";
	}
}