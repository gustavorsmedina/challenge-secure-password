package tech.gustavomedina.password.service;

import tech.gustavomedina.password.dto.PasswordRequest;
import tech.gustavomedina.password.dto.PasswordResponse;

public interface PasswordService {

    PasswordResponse validate(PasswordRequest passwordRequest);

}
