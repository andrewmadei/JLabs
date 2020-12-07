package Validation;

import java.lang.annotation.Documented;
import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NameValidator.class)
public @interface NameAttribute {

    String message() default "Invalid Input";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
