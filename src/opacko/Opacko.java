/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opacko;

import java.util.Scanner;

/**
 *
 * @author pavel
 */
public class Opacko {

    private int cCislo;
    private int pCislo;

    public Opacko(int cislo1, int cislo2) {
        cCislo = cislo1;
        pCislo = cislo2;
    }

    public void prvocisla() {
        int delitelnost;
        for (int y = 1; y <= cCislo; y++) {

            delitelnost = 0;
            for (int z = 1; z <= y; z++) {
                if (y % z == 0) {
                    delitelnost++;
                }
            }

            if (delitelnost == 2) {
                System.out.println(y);
            }
        }
    }

    public void delitelnost() {
        System.out.println("Zadejte cilo: ");
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        if (x % pCislo == 0) {
            System.out.println("Je delitelny");
        } else {
            System.out.println("Neni delitelny");
        }

    }

}
