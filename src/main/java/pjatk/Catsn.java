package pjatk;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // kiedy ma działać
@Target(ElementType.FIELD) // czego ma dotyczyć
@Constraint(validatedBy = SNValidator.class)

public @interface Catsn {
    public int key() default -1;

    String message() default "Invalid SN format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
