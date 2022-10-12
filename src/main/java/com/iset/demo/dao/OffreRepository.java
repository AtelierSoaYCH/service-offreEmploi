package com.iset.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.iset.demo.Offre;

@EnableJpaRepositories
public interface OffreRepository extends JpaRepository<Offre, Long> {
}
