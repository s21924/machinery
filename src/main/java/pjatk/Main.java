package pjatk;

import javax.validation.*;
import java.io.*;
import java.util.*;
import javax.validation.Validation;
import javax.validation.Validator;

public class Main {
    public static void main(String[] args) {
        Rental catepillarList = new Rental();

        catepillarList.catAddPos(1, 111, 1111);
        catepillarList.catAddPos(2, 111, 1111);
        catepillarList.catAddPos(3, 111, 1111);


        System.out.println(catepillarList.findAllCats());
//        try {
//            catepillarList.catsRental(1);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Not this time, bro");
//        }

        Catepillar catBig = new Catepillar(1, 111, 1111);
        System.out.println(catBig.getSN());

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Catepillar>> validate = validator.validate(catBig);
        System.out.println(validate);


    }
}
