/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ownfunprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Saransh Gupta
 *
 *
 * contest link :https://www.codechef.com/DEC19B/problems/WATSCORE
 */
class WATSCORE {

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        while (t != 0) {

            int n = scn.nextInt();

            HashMap<Integer, Integer> hm = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int v1 = scn.nextInt();
                int v2 = scn.nextInt();

                if (hm.containsKey(v1)) {
                    if (hm.get(v1) < v2) {
                        hm.put(v1, v2);
                    }
                } else {
                    hm.put(v1, v2);
                }

            }
            ArrayList<Integer> keys = new ArrayList<>(hm.keySet());
            int sum = 0;
            for (int j = 0; j < hm.size(); j++) {
                int x = keys.get(j);
                if (x < 9) {
                    sum += hm.get(x);
                }

            }

            System.out.print(sum);

            t--;
        }

    }

}
