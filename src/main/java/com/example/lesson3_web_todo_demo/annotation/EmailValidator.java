package com.example.lesson3_web_todo_demo.annotation;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class EmailValidator implements ConstraintValidator<Email, String>  {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.length() > 10;
    }
}
