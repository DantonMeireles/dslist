package com.a.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.a.dslist.entities.Games;

public interface GameRepository extends JpaRepository<Games, Long>{ // Essa interface faz consulta com o banco

}
