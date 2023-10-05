package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "Demos")
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Demo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
}
