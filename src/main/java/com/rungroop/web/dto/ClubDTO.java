package com.rungroop.web.dto;

import com.rungroop.web.models.Club;
import org.springframework.beans.BeanUtils;

import java.time.Instant;

public class ClubDTO {

    private Long id;
    private String title;
    private String photoUrl;
    private String content;
    private Instant createdOn;
    private Instant updatedOn;

    public ClubDTO(Long id, String title, String photoUrl, String content, Instant createdOn, Instant updatedOn) {
        this.id = id;
        this.title = title;
        this.photoUrl = photoUrl;
        this.content = content;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public ClubDTO(Club club){
        BeanUtils.copyProperties(this, club);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Instant getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Instant updatedOn) {
        this.updatedOn = updatedOn;
    }
}