package java8to21;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperator {

    public static void main(String[] args) {

        List<String> lst1 = new ArrayList<String>();
        lst1.add("Arvind");
        lst1.add("Gudiseva");

        for (String s: lst1) {
            System.out.println(s);
        }

        System.out.println("________________________________________________");

        // Diamond operator only
        List<String> lst2 = new ArrayList<>();
        lst2.add("Nag Arvind");
        lst2.add("Gudiseva");

        for (String s: lst2) {
            System.out.println(s);
        }
    }
}