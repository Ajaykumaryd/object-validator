package com.OodlesValidBeans.validateobjects.Validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

public class FootballClubValidators implements ConstraintValidator<FootballClubValidation,String>{

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        List list = Arrays.asList(new String[]{"FIFA","UEFA"});
        return list.contains(s);
    }

}
