package gunler.gun35;

public class Arrayler4 {
    public static void main(String[] args) {
        String[] sehirler = {"Istanbul", "Ankara", "Mus", "Antalya", "Artvin"};
        String ist = sehirler[0];
        String baskent = "Ankara";

        for (String sehir : sehirler) {
            if (sehir.startsWith("A")) {
                System.out.println("sehir = " + sehir);
            }
        }


    }
}
