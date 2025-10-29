package com.walcodex.backend.entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class USER {
    private String name;
    private Integer age;
}
