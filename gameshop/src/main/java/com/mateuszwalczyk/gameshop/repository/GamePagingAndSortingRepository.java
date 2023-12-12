package com.mateuszwalczyk.gameshop.repository;

import com.mateuszwalczyk.gameshop.entity.Game;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GamePagingAndSortingRepository extends PagingAndSortingRepository<Game, Long> {



}
