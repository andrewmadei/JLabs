package Program;

import Audience.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class MainValidation {

    public static void main(String[] args) {

        Validator v = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<ComputerAudience>> violations;

        ComputerAudience computerAudience;
        computerAudience= new ComputerAudience();
        computerAudience.nameOfAudience = "";
        violations = v.validate(computerAudience);
        System.out.println("Invalid object:");
        if (violations != null) {
            for(ConstraintViolation cv : violations) {
                System.out.println(cv.getPropertyPath().toString() + " | " + cv.getMessage());
            }
        }

        ComputerAudienceBuilder computerAudienceBuilder = new ComputerAudienceBuilder();
        computerAudienceBuilder.setSquare(10);
        computerAudienceBuilder.setFloor(2);
        computerAudienceBuilder.setNumberOfAudience(18);
        computerAudienceBuilder.addTables(15);
        computerAudienceBuilder.addComputer(10);

        computerAudience = computerAudienceBuilder.getComputerAudience();

        computerAudience.nameOfAudience = "Qwerty";
        violations = v.validate(computerAudience);
        System.out.println("\nValid object:");

        if (violations != null) {
            for(ConstraintViolation cv : violations) {
                System.out.println(cv.getPropertyPath().toString() + " | " + cv.getMessage());
            }
        }
    }
}
