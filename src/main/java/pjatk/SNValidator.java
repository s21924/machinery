package pjatk;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SNValidator implements ConstraintValidator<Catsn, Integer> {

    private Integer someVar;



    @Override
    public void initialize(Catsn constraintAnnotation) {
        someVar = constraintAnnotation.key();
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer == 1111;
    }


}
