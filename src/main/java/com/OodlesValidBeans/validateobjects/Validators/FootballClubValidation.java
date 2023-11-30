package com.OodlesValidBeans.validateobjects.Validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;

@Target( {ElementType.FIELD,PARAMETER,METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = FootballClubValidators.class)
public @interface FootballClubValidation {

    public String message() default "";
    //represents group of constraints
    public Class<?>[] groups() default {};
    //represents additional information about annotation
    public Class<? extends Payload>[] payload() default {};

}
