/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ownfunprograms;

import java.util.Scanner;

/**
 *
 * @author Saransh Gupta
 */
class STFOOD {

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t-- > 0) {
            int n = scn.nextInt();
            int s[] = new int[n];
            int p[] = new int[n];
            int v[] = new int[n];

            for (int i = 0; i < n; i++) {
                s[i] = scn.nextInt();
                p[i] = scn.nextInt();
                v[i] = scn.nextInt();

            }

            int max = 0;

            for (int i = 0; i < n; i++) {

                int cmax = (p[i] / (s[i] + 1)) * v[i];
                if (cmax > max) {
                    max = cmax;
                }
            }

            System.out.println(max);

        }

    }
}
