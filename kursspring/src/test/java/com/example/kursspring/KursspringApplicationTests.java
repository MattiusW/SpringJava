package com.example.kursspring;

import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.repository.InMemoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KursspringApplicationTests {

	@Autowired
	Knight knight;

	@Autowired
	InMemoryRepository castle;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCastle(){
		String except = "Zamek nazwa: InMemoryRepository Black mieszka: Rycerz o imieniu Lancelot( 29 ) Zadanie: Uratuj ksiezniczke";
		assertEquals(except, castle.toString());

	}

}
