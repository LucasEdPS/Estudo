package Java;

import java.util.*;

public class desafio001 {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do meu sistema: ");
        System.out.println(loc.getDisplayLanguage());
        System.out.print("O idioma do meu sistema: ");
        System.out.print(loc.getLanguage());
        System.out.print("-");
        System.out.println(loc.getCountry());
    }
}
