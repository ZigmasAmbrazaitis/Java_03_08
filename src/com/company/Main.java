package com.company;

import java.util.Scanner;

public class Main {

    private int sk;

    public static void main(String[] args) {
        // 1.7.​ Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti, tuomet duoti jam įvesti tiek
        // skaičių, kiek jis pasirinko. Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni
        // nei 100.
        // 1.8.​ Realizuoti 1.7.​ užduotį panaudojant metodą kurio parametras būtų vartotojo įvestų
        // skaičių masyvas ir skaičių didesnių nei 100 atvaizdavimas vyktų pačiame metode.

        Main objektas = new Main();
        objektas.nuskaitymas();
    }

    private void nuskaitymas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nurodykite, kiek skaiciu noresite ivesti: ");
        sk = sc.nextInt();
        int[] masyvas = new int[sk];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite " + (i + 1) + "-aji skaiciu: ");
            masyvas[i] = sc.nextInt();
        }
        isvedimas(masyvas);
    }

    private void isvedimas(int[] masyvas) {
        System.out.println("Pasirinkti skaiciai, didesni uz 100: ");
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 100) {
                System.out.println(masyvas[i]);
            }
        }
    }
}
