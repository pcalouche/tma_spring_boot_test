package com.pcalouche.tma_spring_boot_test;

import com.pcalouche.tma_spring_boot_test.entity.Team;
import com.pcalouche.tma_spring_boot_test.repository.TeamRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// This class can be used to load some initial data
@Component
public class DataLoader implements CommandLineRunner {
    private final TeamRepository teamRepository;

    public DataLoader(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Team team1 = new Team();
        team1.setCity("Charlotte");
        teamRepository.save(team1);
    }
}
