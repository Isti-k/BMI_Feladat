/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmifeladat;

import java.util.Scanner;


public class BmiFeladat {




    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        bmiFeladat();
        
    }

    static void bmiFeladat() {
        kiir(kerdes);
        beker();
        int m = sc.nextInt("");
        int t = sc.nextInt("");
        ertekeles();
    }
    
    private static void ertekeles() {
        String ki = "Ön %d cm magas és %d kg tömegű".formatted(magassag, tomeg);
        String alkat = "";
        if(bmi < 20){
            
        }
    }


    private static int beker(String kerdes, int also, int felso) {
        kiir(kerdes);
        int adat;
        do{
            adat = sc.nextInt();
        } while (adat < also || adat > felso);
        

        return adat;
    }

    
}
