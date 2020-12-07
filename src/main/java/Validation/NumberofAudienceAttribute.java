package Validation;

import java.lang.annotation.Documented;
import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NumberOfAudienceValidator.class)
public @interface NumberofAudienceAttribute {

    Class<? extends Enum<?>> enumClass();
    String message() default "Invalid Input";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}