package com.OodlesValidBeans.validateobjects.Validators;

import com.OodlesValidBeans.validateobjects.Domains.Colors;
import com.OodlesValidBeans.validateobjects.Domains.Greeting;
import jakarta.validation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class ColorValidator implements ConstraintValidator<ColorValidation,String>
{
    public boolean isValid(String colorName, ConstraintValidatorContext cxt) {
        List list = Arrays.asList(new String[]{"RED","GREEN","BLUE"});
        return list.contains(colorName);
    }





}