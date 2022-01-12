package com.pcalouche.tma_spring_boot_test.repository;

import com.pcalouche.tma_spring_boot_test.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
