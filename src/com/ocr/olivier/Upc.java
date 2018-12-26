package com.ocr.olivier;

public class Upc {
    private String  upcFourni;
    private int upcFinal[];
    //constructeur
    Upc(String a){
        String zero = new String();
        upcFourni = a;

        // remplissage du nombre UPC pour obtenir 11 caractères

        for(int i = 11 - upcFourni.length();i>0;i--){
            zero+="0";
        }
        upcFourni = zero + upcFourni;


        System.out.println(upcFourni);

    }

    public void conversion(){
        String[] integerString = upcFourni.split("");
        upcFinal = new int [11];
        for(int i = 0 ; i < integerString.length; i++){
            upcFinal[i] = Integer.parseInt(integerString[i]);
        }
    }

    public int douziemeUPC(){
        int digit = 0;
        //addition des chiffres paires
        for (int i = 0; i < upcFinal.length;i+=2){
            digit += upcFinal[i];
        }
        //multiplication par 3
        digit = digit * 3;

        //addition des chiffres impaires
        for (int i = 1; i < upcFinal.length;i+=2){
            digit += upcFinal[i];
        }

        //modulo 10
        digit = digit % 10;

        if(digit == 0){
            return digit;
        }else{
            return 10 - digit;
        }

    }
}
