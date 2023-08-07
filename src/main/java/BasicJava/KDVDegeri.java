package BasicJava;

import java.util.Scanner;

public class KDVDegeri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfen bir fiyat giriniz ");

        int tutar = scan.nextInt();
        int num = 1000;
        Math.abs(tutar);

        int kdvli =  tutar > num ? ((tutar*8)/100 + tutar ):((tutar*18)/100 + tutar);

        System.out.println("KDVli fiyat : " + kdvli);


    }
}
