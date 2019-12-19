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
public class DSTAPLS {

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t != 0) {

            int n = scn.nextInt();
            int k = scn.nextInt();

            long first[] = new long[k];
            long second[] = new long[k];

            int cn = n;

            for (int i = 0; i < first.length; i++) {
                first[i] = n / k;

            }
            int j = 0;
            while (cn != 0) {
                if (j > k - 1) {
                    j = 0;
                }
                second[j] += k;
                cn = cn - k;
                j++;

            }
            int flag = 0;
            for (int h = 0; h < k; h++) {
                if (first[h] != second[h]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {

                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            for (int i = 0; i < k; i++) {
                System.out.print(first[i]);
            }

            System.out.println();
            for (int i = 0; i < k; i++) {
                System.out.print(second[i]);
            }
            t--;

        }

    }

}
