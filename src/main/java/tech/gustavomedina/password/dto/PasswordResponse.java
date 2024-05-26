package tech.gustavomedina.password.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record PasswordResponse(List<String> validations){
}
