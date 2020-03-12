package com.lightinit.economicinformation.entity;

import java.util.Date;

public class SysUser {
    private Long id;

    private Integer userType;

    private String username;

    private String password;

    private String salt;

    private String fullName;

    private Byte isAuth;

    private Byte isLcokedOut;

    private Byte isBuildin;

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

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Byte getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(Byte isAuth) {
        this.isAuth = isAuth;
    }

    public Byte getIsLcokedOut() {
        return isLcokedOut;
    }

    public void setIsLcokedOut(Byte isLcokedOut) {
        this.isLcokedOut = isLcokedOut;
    }

    public Byte getIsBuildin() {
        return isBuildin;
    }

    public void setIsBuildin(Byte isBuildin) {
        this.isBuildin = isBuildin;
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