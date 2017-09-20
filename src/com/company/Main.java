package com.company;

import java.util.Scanner;

public class Main {

    public static void winner(int petya, int vasya){
        if (petya>vasya){
            System.out.println("Petya");
        } else {
            System.out.println("Vasya");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int scorePetya = 0;
        int scoreVasya = 0;
        int maxCardPetya=0;
        int maxCardVasya=0;

        for (int i=0;i<n;i++)
        {
            int card = scan.nextInt();
            if(i%2==0){
                scorePetya += card;
                if (card>maxCardPetya) maxCardPetya = card;
            } else {
                scoreVasya += card;
                if (card>maxCardVasya) maxCardVasya = card;
            }
        }

        if (scorePetya!=scoreVasya){
            winner(scorePetya,scoreVasya);
        } else {
            winner(maxCardPetya,maxCardVasya);
        }
    }


}
