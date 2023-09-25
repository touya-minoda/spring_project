package com.example.demo.fizzBuzz.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public ArrayList<String> fizzBuzz() {
		//ArrayListでリストを作成
		ArrayList<String> lists = new ArrayList<String>();
		
		for(int i = 0; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				lists.add("FizzBuzz");
			} else if (i % 3 == 0) {
				lists.add("Fizz");
			} else if (i % 5 == 0) {
				lists.add("Buzz");
			} else {
				lists.add(Integer.toString(i)); //iをStringに変換しリストに追加
			}
		} 
		return lists; //出来上がった結果のリストをコントローラへ
	}

}