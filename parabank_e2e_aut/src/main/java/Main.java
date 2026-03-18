import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Vendedor vendedor1 = new Vendedor("Carlos","Bolaños",12,1125);
        System.out.println(vendedor1.toString());
        Vendedor vendedor2 = new Vendedor("Victor","Bolaños",13,1032);
        System.out.println(vendedor2.toString());
    }
}