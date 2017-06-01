package com.github.nicorotolo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().init();
    }

    public void init(){
        try {

            Scanner s = new Scanner(System.in);
            System.out.print("Insert number to check if perfect: ");
            int numbertocheck = s.nextInt();
            if (divisore(numbertocheck)) {
                System.out.print(numbertocheck + " is a perfect number");
            } else {
                System.out.print(numbertocheck + " is not a perfect number");

            }
        } catch (InputMismatchException e){
            System.out.println("This is not a legal number");
            init();
        }
    }
    public boolean divisore(double n){
        double risultato = 0;
        ArrayList<Double> divisori = new ArrayList<>();
        divisori.add(1.0);
        for(int i=2; i<=n/2; i++) {
            if (n / i == (int) n / i) {
                divisori.add(n / i);
            }
        }
        for(int i=0; i<divisori.size(); i++){
            risultato = risultato + divisori.get(i);
        }
        if (risultato == n){
            return true;
        } else {
            return false;

        }
    }
}
