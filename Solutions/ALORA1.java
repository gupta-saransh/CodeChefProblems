/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ownfunprograms;

/**
 *
 * @author Saransh Gupta
 *
 */
import java.math.BigInteger;
import java.util.*;

class ALORA1 {

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t-- > 0) {

            int n = scn.nextInt();

            HashMap<BigInteger, Integer> hm = new HashMap<>();
            boolean vs = true;

            for (int i = 0; i < n; i++) {
                BigInteger v1 = new BigInteger(scn.next());
                int v2 = i;
                if (hm.containsKey(v1)) {

                    vs = false;
                    break;
                } else {
                    hm.put(v1, v2);
                }

            }
            if(vs==false)
            {
            System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }

        }

    }

}
