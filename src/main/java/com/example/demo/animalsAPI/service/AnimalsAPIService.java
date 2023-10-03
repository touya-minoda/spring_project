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
	
	public List<Animals> getAllAnimals() throws IOException {
		Animals[] animalsAll = animalsAPIRepository.getAllAnimals();
		
		List<Animals> animalsAllList = Arrays.asList(animalsAll);
		
		return animalsAllList;
	}
	
	public List<Animals> getAnimals(int id) throws IOException {

		Animals[] animalsList = animalsAPIRepository.getAnimals(id);
		
		List<Animals> resultList = Arrays.asList(animalsList);
		
		return resultList;

	}
}