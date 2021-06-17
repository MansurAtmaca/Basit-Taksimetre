package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Gidilen mesafeyi KM olarak giriniz: ");
        double km=input.nextDouble();
        double tutar=10+(km*2.2);
        String sonuc=(tutar<20)?("Ödenecek Tutar: 20 TL"):("Ödenecek Tutar: "+tutar+" TL");
        System.out.println(sonuc);
    }
}
