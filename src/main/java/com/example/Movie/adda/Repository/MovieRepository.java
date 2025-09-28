package com.example.Movie.adda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie.adda.Entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
