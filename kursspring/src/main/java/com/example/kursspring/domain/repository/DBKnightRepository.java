package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Knight;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.Collection;
import java.util.Optional;

public class DBKnightRepository implements KnightRepository {

    @PersistenceContext
    private EntityManager em;
    @Override
    public void createKnight(String name, int age){
        Knight knight = new Knight(name, age);
        em.persist(knight);
    }

    @Override
    public Collection<Knight> getAllKnights(){
        return em.createQuery("from Knight", Knight.class).getResultList();
    }

    @Override
    public Optional<Knight> getKnight(String name){
        Knight knightByName = em.createQuery("from Knight k where k.name=:name", Knight.class).setParameter("name", name).getSingleResult();
        return Optional.ofNullable(knightByName);
    }

    @Override
    public void deleteKnight(Integer id){
        System.out.println("Uzywam bazy danych");
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @PostConstruct
    public void build(){

    }

    @Override
    public Knight getKnightById(Integer id) {
        System.out.println("Uzywam bazy danych");
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void createKnight(Knight knight) {
        System.out.println("Uzywam bazy danych");
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void updateKnight(int id, Knight knight) {
        System.out.println("Uzywam bazy danych");
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
