package com.example.rodrigolorandi.repository;

import com.example.rodrigolorandi.entity.Voter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotanteRepository extends JpaRepository<Voter, Long> {
}
