package gunler.gun26;

public class Cake {

    String baker;
    int slices;
    boolean isChoclate;
    static int cakeSlice = 20;

    public void eat(){
        slices--;
        System.out.println(baker + "'s cake slice : " + slices);
        cakeSlice--;
        System.out.println("Cake Slices : " + cakeSlice);
    }
}
