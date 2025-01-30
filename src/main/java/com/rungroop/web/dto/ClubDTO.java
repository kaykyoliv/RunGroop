package com.rungroop.web.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDateTime;

@Data
@Builder
public class ClubDTO {
    private Long id;
    private String title;
    private String photoUrl;
    private String content;
    private Instant createdOn;
    private Instant updatedOn;
}