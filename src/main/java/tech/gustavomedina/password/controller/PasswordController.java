package tech.gustavomedina.password.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.gustavomedina.password.dto.PasswordRequest;
import tech.gustavomedina.password.service.PasswordService;

import java.util.List;

@RestController
@RequestMapping("/v1/validate-password")
@RequiredArgsConstructor
public class PasswordController {

    private final PasswordService passwordService;

    @PostMapping
    public ResponseEntity<List<String>> validate(@RequestBody PasswordRequest passwordRequest){
        var response = passwordService.validate(passwordRequest);

        if(response.validations().isEmpty()){
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.badRequest().body(response.validations());
        }

    }

}
