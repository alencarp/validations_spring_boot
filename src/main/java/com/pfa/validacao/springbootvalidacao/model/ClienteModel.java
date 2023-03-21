package com.pfa.validacao.springbootvalidacao.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pfa.validacao.springbootvalidacao.validation.constraints.PlacaCarro;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class ClienteModel {

    private Integer id;
    @NotBlank(message = "Nome não informado")
    private String nome;
    @NotBlank(message = "E-mail não informado")
    private String email;
    @NotBlank(message = "CPF não informado")
    private String cpf;
    @NotBlank(message = "Placa do carro não informada")
    @PlacaCarro
    private String placaCarro;
    @Min(value = 1900, message = "Ano de nascimento deve ser maior do que 1900")
    private int anoNascimento;
}
