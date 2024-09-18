package nl.ErwinvanderLaan;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> overzichtGetallen = new HashMap<String, Integer>();

        int [] array = {42, 67, 35, 89, 24, 76, 58, 93, 7, 30, 83, 46, 13, 25, 98, 53, 17, 79, 57, 8} ;
        int aantalEvenGetallen = 0 ;
        int aantalOnevenGetallen = 0 ;
        for (int i : array) {
            if (i % 2 == 0) {
                aantalEvenGetallen ++;
            } else {
                aantalOnevenGetallen ++;
            }
            overzichtGetallen.put("even" , aantalEvenGetallen) ;
            overzichtGetallen.put("oneven" , aantalOnevenGetallen) ;
        }
        System.out.println(overzichtGetallen);
    }
}