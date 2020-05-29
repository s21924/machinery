package pjatk;

import java.awt.print.*;
import java.util.*;

public class Rental {
    private List<Catepillar> catalogue = new ArrayList<>();

    public List<Catepillar> getCat1() {
        return catalogue;
    }

    public void setCat1(List<Catepillar> cat1) {
        this.catalogue = cat1;
    }

    public List<Catepillar> findAllCats() {
        return this.catalogue;

    }

    public void catAddPos(int id, int power, int sN) {

        Catepillar catepillar1 = new Catepillar(id, power, sN);
        catalogue.add(catepillar1);

    }

    public Optional<Catepillar> findById(int id) {
        return catalogue.stream().filter(catepillar -> catepillar.getId() == id).findFirst();

    }

    public void catsRental(int id) {
        Optional<Catepillar> byId = findById(id);
        catalogue.remove(id);
        System.out.println("There is your " + byId.get());
    }


}
