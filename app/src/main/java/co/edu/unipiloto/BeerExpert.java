package co.edu.unipiloto;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("light")) {
            brands.add("Yuengling");
            brands.add("Corona ");
        } else if(color.equals("amber")) {
            brands.add("New Belgium");
            brands.add("Odell");
            brands.add("Breckenridge ");
        }else if(color.equals("brown")) {
            brands.add("Sweetwater");
            brands.add("Brooklyn");
        }else{
            brands.add("Stout");
            brands.add("Porter");
        }

        return brands;
    }
}
