package com.example.demo.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;

public record ProductRecordDto(@NotNull String name, BigDecimal value) {

}
