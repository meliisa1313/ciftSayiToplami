package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        Scanner input=new Scanner(System.in);
        int sayi,toplam=0;
        int i;

       do{
           System.out.println("sayiyi girin");
           sayi= input.nextInt();
           if(sayi%2==0){
           toplam=toplam+sayi;}

       }
       while(sayi%2==0);
        System.out.println(toplam);




    }


    }




