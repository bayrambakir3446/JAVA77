package gunler.gun42_Constructors2;

public class BoxTest {
    public static void main(String[] args) {
        Box kutu = new Box();
        System.out.println("kutu.width = " + kutu.width);
        System.out.println("kutu.length = " + kutu.length);

        Box kutu1 = new Box(23,45);
        System.out.println("kutu1.width = " + kutu1.width);
        System.out.println("kutu1.length = " + kutu1.length);

        System.out.println("kutu1 Alan hesaplaması = " + kutu1.areaCalculate());
        System.out.println("kutu Alan hesaplaması= " + kutu.areaCalculate());

/*
       kutu1.showInfo();
       String bilgi = kutu1.strShowInfo();
       System.out.println(bilgi);*/

        System.out.println(kutu1);
        System.out.println(kutu);
    }
}
