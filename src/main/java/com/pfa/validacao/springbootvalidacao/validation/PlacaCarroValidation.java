package com.pfa.validacao.springbootvalidacao.validation;

import com.pfa.validacao.springbootvalidacao.validation.constraints.PlacaCarro;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PlacaCarroValidation implements ConstraintValidator<PlacaCarro, String> {

    @Override
    public void initialize(PlacaCarro constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        String placa = value == null ? "" : value;
        return placa.matches("[a-zA-Z]{3}[0-9][A-Za-z0-9][0-9]{2}");
    }
}
