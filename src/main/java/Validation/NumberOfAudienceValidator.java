package Validation;

import java.util.ArrayList;
import java.util.List;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumberOfAudienceValidator  implements ConstraintValidator<NumberofAudienceAttribute, String>{
    List<String> valueList = null;

    @Override
    public void initialize(NumberofAudienceAttribute constraintAnnotation) {
        valueList = new ArrayList<String>();
        Class<? extends Enum<?>> enumClass = constraintAnnotation.enumClass();
        Enum[] enumArr = enumClass.getEnumConstants();
        for (Enum enumVal : enumArr) {
            valueList.add(enumVal.toString().toUpperCase());
        }
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return valueList.contains(value);
    }
}
