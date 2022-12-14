package gunler.gun35;

import java.util.Arrays;

public class Arrayler6Split {
    public static void main(String[] args) {
        String[] kulupler = {"Real Madrid", "Sporting Lisbon", "Werder Bremen", "Bayern Munih", "Sparta Prag"};
        String ispanya = kulupler[0];
        System.out.println("ispanya = " + ispanya);
        String[] arrayIspanya = ispanya.split(" ");
        System.out.println("Arrays.toString(arrayIspanya) = " + Arrays.toString(arrayIspanya));
        System.out.println("arrayIspanya[1] = " + arrayIspanya[1]);
        String[] sehirler = new String[kulupler.length];
        for (String kulup : kulupler) {
            String[] takim = kulup.split(" ");
            String sehir = takim[1];
            System.out.println("sehir = " + sehir);
        }
        // sehirler adindaki arraya sehirleri atalim

    }
}
