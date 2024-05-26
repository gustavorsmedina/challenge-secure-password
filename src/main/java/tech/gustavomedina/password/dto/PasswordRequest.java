package tech.gustavomedina.password.dto;

import jakarta.validation.constraints.NotBlank;

public record PasswordRequest(@NotBlank String password) {
}
