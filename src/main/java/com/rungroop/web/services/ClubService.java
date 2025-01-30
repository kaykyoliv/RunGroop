package com.rungroop.web.services;

import com.rungroop.web.dto.ClubDTO;

import java.util.List;

public interface ClubService {
    List<ClubDTO> findAllClubs();
}
