package com.pfa.validacao.springbootvalidacao.validation.constraints;

import com.pfa.validacao.springbootvalidacao.validation.PlacaCarroValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PlacaCarroValidation.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PlacaCarro { //@interface mostra que essa interface é uma anotation

    String message() default "Placa de carro inválida";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default {};
}
