package com.OodlesValidBeans.validateobjects;


import com.OodlesValidBeans.validateobjects.Domains.Greeting;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ObjectValidator {

  private final ValidatorFactory validatorFactory= Validation.buildDefaultValidatorFactory();
  private final Validator validator=validatorFactory.getValidator();

  public Set<String> validate(Greeting objectToValidate){
      Set<ConstraintViolation<Greeting>> violations = validator.validate(objectToValidate);
      if(!violations.isEmpty()){
          return violations
                  .stream()
                  .map(ConstraintViolation::getMessage)
                  .collect(Collectors.toSet());
      }
      return Collections.emptySet();
  }




}
