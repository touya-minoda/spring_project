package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	//コントローラから数値と演算子を受け取る
	public int calculator(int num1, int num2, String operator) {
		int result = 0;
		//演算子によって条件分岐し、resultに計算結果を格納
		switch(operator) {
		case "plus":
			result = num1 + num2;
			break;
		case "minus":
			result = num1 - num2;
			break;
		case "multi":
			result = num1 * num2;
			break;
		case "division":
			result = num1 / num2;
			break;
		default:
			result = 0;
			break;
		}
		// resultをコントローラに渡す
		return result;

	}
}