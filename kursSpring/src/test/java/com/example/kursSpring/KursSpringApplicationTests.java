package com.example.kursSpring;

import com.example.kursSpring.repository.KnightRepository;
import com.example.kursSpring.domain.Knight;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KursSpringApplicationTests {

	@Autowired
	Knight knight;

	@Autowired
    KnightRepository castle;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCastle()
	{
		String except = "Znajduje sie tu zamek o nazwie: Castle Black Zamieszkaly przez rycerza Knight name Lancelot ( 29 )  zadanie: Uratuj ksiezniczke";
		assertEquals(except, castle.toString());
	}

}
