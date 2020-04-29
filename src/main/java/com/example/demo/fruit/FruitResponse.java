package com.example.demo.fruit;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class FruitResponse {
    private String errormessage;
    private Boolean resultok;
    private Fruit fruit;
    private LocalDateTime datetime = LocalDateTime.now();
}
