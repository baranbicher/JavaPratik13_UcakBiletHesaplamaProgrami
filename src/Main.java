import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, age, type;
        boolean isError = false;
        double price, dPrice;

        System.out.print("Mesafenizi Girin: ");
        distance = input.nextInt();

        System.out.print("Yaşınızı Girin: ");
        age = input.nextInt();

        System.out.print("Yolculuk Tipiniz Tek Gidiş '1' Gidiş Dönüş '2': ");
        type = input.nextInt();

        price = (distance * 0.10);
        System.out.println("Tutar: " + price);

        if (age < 12){
            price *= 0.5;
        } else if (age >=12 && age <=24) {
            price *= 0.9 ;
        } else if (age > 65) {
            price *=0.7;
        }

        switch (type){
            case 1:
                price = price;
                break;
            case 2:
                price *= 0.8;
                price *= 2;
                break;
            default:
                isError = true;
        }
        if (!(distance>=0)){
            isError = true;
        }
        if (isError == true){
            System.out.println("Hatalı Veri Girdiniz.");
        }else{
            System.out.println("Toplam Tutar: " + price + "TL");
        }
    }
}