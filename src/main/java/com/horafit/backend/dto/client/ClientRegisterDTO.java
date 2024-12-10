package com.horafit.backend.dto.client;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientRegisterDTO {
    @NotEmpty(message = "O email é obrigatório")
    @Email(message = "O email deve ser válido")
    private String email;

    @NotEmpty(message = "O nome é obrigatório")
    private String name;

    @NotEmpty(message = "A senha é obrigatória")
    private String password;
}