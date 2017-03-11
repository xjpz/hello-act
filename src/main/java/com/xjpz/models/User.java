package com.xjpz.models;

/**
 * Created by xjpz on 2017/3/11.
 */


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Optional;

@Entity(name = "user")
public class User {

    @Id
    private Long id;

    private String name;

    private String password;

    private String email;

    private String phone;

    private Integer type;

    private Integer status;

    private Long initTime;

    private Long updateTime;

    private Integer tombstone;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getInitTime() {
        return initTime;
    }

    public void setInitTime(Long initTime) {
        this.initTime = initTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getTombstone() {
        return tombstone;
    }

    public void setTombstone(Integer tombstone) {
        this.tombstone = tombstone;
    }

    public User patch(User user){
        this.name = Optional.ofNullable(user.getName()).orElse(this.getName());
        this.password = Optional.ofNullable(user.getName()).orElse(this.getPassword());
        this.email = Optional.ofNullable(user.getEmail()).orElse(this.getEmail());
        this.phone = Optional.ofNullable(user.getPhone()).orElse(this.getPhone());
        this.type = Optional.ofNullable(user.getType()).orElse(this.getType());
        this.status = Optional.ofNullable(user.getStatus()).orElse(this.getStatus());
        this.updateTime = Optional.ofNullable(user.getUpdateTime()).orElse(this.getUpdateTime());
        this.tombstone = Optional.ofNullable(user.getTombstone()).orElse(this.getTombstone());
        return this;
    }
}

