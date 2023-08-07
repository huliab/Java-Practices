package BasicJava;

import java.util.Scanner;

public class TaksimetreHesabi {
    public static void main(String[] args) {

//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen km giriniz");

        double km = scan.nextDouble();
        int first = 10;
        double total = first + km*2.20;


        double last =   total>20 ? total : 20;
        System.out.println(last);

    }
}
