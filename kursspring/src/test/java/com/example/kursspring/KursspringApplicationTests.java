package com.example.kursspring;

import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.Knight;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KursspringApplicationTests {

	@Autowired
	Knight knight;

	@Autowired
	Castle castle;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCastle(){
		String except = "Zamek nazwa: Castle Black mieszka: Rycerz o imieniu Lancelot( 29 ) Zadanie: Uratuj ksiezniczke";
		assertEquals(except, castle.toString());

	}

}
