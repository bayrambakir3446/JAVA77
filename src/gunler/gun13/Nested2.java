package gunler.gun13;

public class Nested2 {
    public static void main(String[] args) {
        int numara = 18;
        if (numara > 0) {
            System.out.println("numara pozitif bir sayi");//
            if (numara % 5 == 0) {
                System.out.println("sayi 5 e bolunebilir");
            }
            if (numara % 2 == 0 ) {
                if (numara % 3 == 0) {
                    System.out.println("sayi 6 ya kalansiz bolunebilir.");//
                }
                System.out.println("sayi 2 ye bolunebilir");//
            }
            System.out.println("hello");//
        } else {
            System.out.println("sayi negatif bir sayidir");
        }
        if (numara > 0 && numara % 5 == 0) {
            System.out.println("sayi 10 a bolunebilir.");
        }


    }
}
