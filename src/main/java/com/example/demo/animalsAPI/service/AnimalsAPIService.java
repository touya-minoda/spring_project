package com.example.demo.animalsAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animalsAPI.data.Animals;
import com.example.demo.animalsAPI.repository.AnimalsAPIRepository;

@Service
public class AnimalsAPIService {

	private final AnimalsAPIRepository animalsAPIRepository;

	public AnimalsAPIService(AnimalsAPIRepository animalsAPIRepository) {
		this.animalsAPIRepository = animalsAPIRepository;
	}

	public Animals getAnimals(int id) throws IOException {

		Animals[] animalsList = animalsAPIRepository.getAnimals();
		
		List<Animals> resultList = Arrays.asList(animalsList);
		
		id--;
		
		Animals result  = resultList.get(id);
		
		return result;

	}
}