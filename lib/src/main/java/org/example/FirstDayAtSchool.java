package org.example;

import java.util.ArrayList;
import java.util.List;

public class FirstDayAtSchool {

    public List<String> prepareBag() {
        List<String> schoolBag = new ArrayList<>();
        schoolBag.add("Books");
        schoolBag.add("Notebooks");
        schoolBag.add("Pens");
        return schoolBag;
    }

    public String[] addPencilCase() {
        return new String[]{"Books", "Notebooks", "Pens", "Pencil Case"};
    }

    public String[] addLunchBox() {
        return new String[]{"Books", "Notebooks", "Pens", "Pencil Case", "Lunch Box"};
    }
}