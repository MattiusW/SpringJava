package com.example.kursspring.domain;

import com.example.kursspring.domain.repository.KnightRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnightRepositoryTest {
    @Test
    public void castleToStringMessage(){
        Knight knight = new Knight();
        String except = "Zamek nazwa: KnightRepository Black mieszka: Rycerz o imieniu Lancelot( 29 ) Zadanie: Uratuj ksiezniczke";
    }
}
