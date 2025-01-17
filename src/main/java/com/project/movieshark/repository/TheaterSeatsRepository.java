package com.project.movieshark.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.movieshark.domain.TheaterSeats;

@Repository
public interface TheaterSeatsRepository extends JpaRepository<TheaterSeats, Long> {

}