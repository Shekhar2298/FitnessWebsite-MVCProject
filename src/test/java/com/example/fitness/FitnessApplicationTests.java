package com.example.fitness;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.fitness.Repository.fitnessRepo;
import com.example.fitness.Service.FitService;

@SpringBootTest
class FitnessApplicationTests {

	@Autowired
	FitService serve;

	@MockBean
	fitnessRepo repo;

	@Test
	void contextLoads() {
		// when(repo.findAll()).thenReturn(Stream.of(new fitnessModel("abcd@gmail.com",
		// "sam", 8765453212, , "India", "Maharashtra", "Mumbai", "asd", 456123,
		// "Pass@1234")).collect(Collectors.toList()));
		// assertEquals(1, serve.gets().);
	}

}
