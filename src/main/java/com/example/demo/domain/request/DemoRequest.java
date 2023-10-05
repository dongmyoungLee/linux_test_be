package com.example.demo.domain.request;

import com.example.demo.domain.entity.Demo;
import lombok.Data;

@Data
public class DemoRequest {
    private String name;
    private String description;

    public Demo toEntity(){
        return Demo.builder()
                .name(name)
                .description(description)
                .build();
    }
}
