package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> backPack = new ArrayList<String>();
        ArrayList<String> shop = new ArrayList<String>();
        shop.add("Back");
        shop.add("smh");
        shop.add("smh1");
        shop.add("smh2");
        shop.add("smh3");
        shop.add("smh4");
        shop.add("smh5");
        shop.add("smh6");
        backPack.add("Back");

        while (true) {
            System.out.println("Your options: ");
            System.out.println("1.BackPack");
            System.out.println("2.Shop");
            System.out.println("3.Sell");
            int option = scanner.nextInt();
            if (option == 1) {
                for (int i = 0; i < backPack.size(); i++) {
                    System.out.println((i + 1) + "." + backPack.get(i));
                }
                int choose = scanner.nextInt();
                if (choose == 1) {
                    System.out.println("Going back...");
                } else if (choose < (backPack.size() + 1)) {
                    System.out.println("You chose:" + backPack.get(choose - 1));
                } else {
                    System.out.println("WRONG INPUT, Coming back..");
                }
            } else if (option == 2) {
                for (int i = 0; i < shop.size(); i++) {
                    System.out.println((i + 1) + "." + shop.get(i));
                }
                int buy = scanner.nextInt();
                if (buy == 1) {
                    System.out.println("Going back...");
                } else if (buy < (shop.size() + 1)) {
                    System.out.println("You bought: " + shop.get(buy - 1));
                    backPack.add(shop.get(buy - 1));
                    shop.remove(shop.get(buy - 1));
                } else {
                    System.out.println("WRONG INPUT, Coming back..");
                }
            }
            else if (option == 3){
                for (int i = 0; i < backPack.size(); i++) {
                    System.out.println((i + 1) + "." + backPack.get(i));
                }
                int selling = scanner.nextInt();
                if (selling == 1) {
                    System.out.println("Going back...");
                } else if (selling < (backPack.size() + 1)) {
                    System.out.println("You sold: " + backPack.get(selling - 1));
                    shop.add(backPack.get(selling - 1));
                    backPack.remove(backPack.get(selling - 1));
                    Collections.sort(shop);
                } else {
                    System.out.println("WRONG INPUT, Coming back..");
                }
            }
            else {
                System.out.println("WRONG INPUT, Coming back..");
            }

        }
    }
}
