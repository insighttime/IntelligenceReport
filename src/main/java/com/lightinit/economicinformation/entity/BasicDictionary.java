package com.lightinit.economicinformation.entity;

import java.util.Date;

public class BasicDictionary {
    private Long id;

    private Integer voteType;

    private Integer targetType;

    private Integer targetId;

    private String opinionsAndSuggestions;

    private Date createdAt;

    private String createdBy;

    private Date deletedAt;

    private String deletedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVoteType() {
        return voteType;
    }

    public void setVoteType(Integer voteType) {
        this.voteType = voteType;
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getOpinionsAndSuggestions() {
        return opinionsAndSuggestions;
    }

    public void setOpinionsAndSuggestions(String opinionsAndSuggestions) {
        this.opinionsAndSuggestions = opinionsAndSuggestions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }
}