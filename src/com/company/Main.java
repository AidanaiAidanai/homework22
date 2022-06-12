package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random  random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arraylist.add(random.nextInt(1,100));
        }
        for (int takSan: arraylist) {
            if(takSan %2 ==1){
            System.out.print("bul tak san "+takSan+",");}}
            System.out.println();

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
        arrayList1.add(random.nextInt(1,100));}

        for (int jupSan:arrayList1) {
            if(jupSan % 2 ==0){
                System.out.print("bul jup san "+jupSan+",");
            }

        }



    }
}
