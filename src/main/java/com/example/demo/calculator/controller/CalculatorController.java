package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

@Controller
public class CalculatorController {

	private final CalculatorService calculatorService;
	
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	@GetMapping("calculator") 
	public String calculator(Model model) {
		return "calculator.html";
	}
	
	@GetMapping("result")
	public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2, @RequestParam("operator") String operator, Model model) {
		// フォームからGETで受け取った値をサービスクラスに渡し、結果をresultに格納
		int result = calculatorService.calculator(num1, num2, operator);
		// resultをビューに渡す
		model.addAttribute("result", result);
		return "calculator.html";
	}
	
}