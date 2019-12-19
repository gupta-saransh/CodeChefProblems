/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ownfunprograms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Saransh Gupta
 * 
 */
class Codechef1 {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t > 0) {

            int n = scn.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();

            int f1 = 0, f2 = 1;

            if (n > 2) {
                arr.add(f1);
                arr.add(f2);

                for (int i = 0; i < n - 2; i++) {

                    int sum = f1%10 + f2%10;
                    arr.add(sum % 10);
                    f1 = f2;
                    f2 = sum;

                }

            } else if (n == 1) {
                arr.add(f1);

            } else {
                arr.add(f1);
                arr.add(f2);

            }
            while (arr.size() != 1) {
                int n1 = arr.size();
                // System.out.println(n1);
                for (int i = 0; i < n1; i++) {
                    if (i % 2 == 0) {
                        arr.remove(i);
                        // System.out.println(arr);
                        n1--;
                    }

                }

                System.out.println(arr);
            }

            System.out.println(arr.get(0));

            t--;

        }
    }
}
