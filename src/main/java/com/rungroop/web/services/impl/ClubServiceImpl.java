package com.rungroop.web.services.impl;

import com.rungroop.web.dto.ClubDTO;
import com.rungroop.web.models.Club;
import com.rungroop.web.repositories.ClubRepository;
import com.rungroop.web.services.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubServiceImpl implements ClubService {
    private ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDTO> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map(ClubDTO::new).collect(Collectors.toList());
    }
}