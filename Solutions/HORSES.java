/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ownfunprograms;

/**
 *
 * @author Saransh Gupta
 */
import java.util.*;

class Horses {

    public static void main(String[] args) throws java.lang.Exception {
		// your code goes here

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t != 0) {
            int n = scn.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {

                arr[i] = scn.nextInt();
            }
            long min = Integer.MAX_VALUE;
            //Arrays.sort(arr);

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    
                    
                    long cmin=arr[i] - arr[j];
                    
                    if(cmin<0)
                    {
                    cmin = cmin *(-1);
                    }
                    if(cmin<min)
                    {
                    min = cmin;
                    }
                    
                    

                }
            }
            System.out.println(min);

            t--;
        }
    }
}
