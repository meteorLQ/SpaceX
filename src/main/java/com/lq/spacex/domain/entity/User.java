package com.lq.spacex.domain.entity;

import jakarta.validation.constraints.NotBlank;

public class User {
    private  String id;
    @NotBlank(message = "[name]名称不能为空")
    private  String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
