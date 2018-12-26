package com.ocr.olivier;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //recuperation du nombre UPC
        System.out.println("entrez le nombre UPC à checker");
        Scanner sc = new Scanner(System.in);
        String upcDepart;
        upcDepart = sc.nextLine();
        while(upcDepart.length()>11){
            System.out.println("entrez un nombre UPC valide");
            upcDepart = sc.nextLine();
        }

        //transformation en nombre à 11 chiffres
        Upc upc = new Upc(upcDepart);
        upc.conversion();
        int digit = upc.douziemeUPC();
        System.out.println("le douxième digit est " + digit);
    }
}
