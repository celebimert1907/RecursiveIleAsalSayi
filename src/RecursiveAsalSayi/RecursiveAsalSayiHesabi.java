package RecursiveAsalSayi;

import java.util.Scanner;

public class RecursiveAsalSayiHesabi {

    static int primeNumber(int num){
        while (true){
            for(int i = 2; i<num; i++){
                if (num %i != 0){
                    System.out.println(num + ": Asal sayidir");
                    break;
                } else {
                    System.out.println(num + ": Asal sayi degildir.");
                    break;
                }
            }
            return num;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Asal sayi olup olmadigini ogrenmek istediginiz sayiyi giriniz: ");
        int num = input.nextInt();

        primeNumber(num);

    }
}
