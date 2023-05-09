//package com.tutorial;

import java.util.*;
public class main{
    
    public static void main (String[] args){

        // a operator b
        Scanner inputUser;
        float a,b, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Nilai operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("Input user: " + a + " " + operator + " " + b);

        // operator tersedia * / + -

        if(operator == '+'){
            //Penjumlahan
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        } else if(operator == '-'){
            //pengurangan
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        } else if(operator == '*'){
            //perkalian
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        } else if(operator == '/'){
            //pembagian
            if(b == 0){
                System.out.println("Pembagian nol menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
            }
        } else {
            System.out.println("Opertor tidak ditemukan");
        }

    }

}