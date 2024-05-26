package tech.gustavomedina.password.service.impl;

import org.springframework.stereotype.Service;
import tech.gustavomedina.password.dto.PasswordRequest;
import tech.gustavomedina.password.dto.PasswordResponse;
import tech.gustavomedina.password.service.PasswordService;

import java.util.ArrayList;
import java.util.List;

@Service
public class PasswordServiceImpl implements PasswordService {

    @Override
    public PasswordResponse validate(PasswordRequest passwordRequest) {

        var password = passwordRequest.password();

        List<String> validations = new ArrayList<>();

        validateLength(validations, password);
        validateUppercase(validations, password);
        validateLowercase(validations, password);
        validateNumericDigit(validations, password);
        validateCharacters(validations, password);

        return PasswordResponse.builder()
                .validations(validations)
                .build();
    }

    private void validateLength(List<String> validations, String password){

        if(password.length() < 8){
            validations.add("The password must contain at least eight characters.");
        }
    }

    private void validateUppercase(List<String> validations, String password){

        if(!password.matches(".*[A-Z].*")){
            validations.add("The password must contain at least one uppercase letter.");
        }
    }

    private void validateLowercase(List<String> validations, String password){

        if(!password.matches(".*[a-z].*")){
            validations.add("The password must contain at least one lowercase letter.");
        }
    }

    private void validateNumericDigit(List<String> validations, String password){

        if(!password.matches(".*[0-9].*")){
            validations.add("The password must contain at least one numeric digit.");
        }
    }

    private void validateCharacters(List<String> validations, String password){

        if(!password.matches(".*\\W.*")){
            validations.add("The password must contain at least one special character.");
        }
    }

}
