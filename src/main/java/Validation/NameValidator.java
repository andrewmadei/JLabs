package Validation;

import java.util.List;
import java.util.ArrayList;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<NameAttribute, String> {

    List<String> valueList = null;

    @Override
    public boolean isValid(String category, ConstraintValidatorContext context) {
        return valueList.contains(category.toUpperCase());
    }

    @Override
    public void initialize(NameAttribute constraintAnnotation) {
        valueList = new ArrayList<String>();
    }
}
