/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ownfunprograms;
import java.util.*;

/**
 *
 * @author Saransh Gupta
 * 
 * problem link: https://www.codechef.com/DEC19B/problems/PLMU
 */
class PLMU {
      public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        while (t != 0) {

            int n = scn.nextInt();
            int arr[] = new int[n];
            
            for(int i=0;i<n;i++)
            {
             
                arr[i] = scn.nextInt();
                
            }
            int cz=0;
            int ct=0;
            int count=0;
            
            for(int i=0;i<n;i++)
            {
             if(arr[i]==0)
                 cz++;
             if(arr[i]==2)
                 ct++;
                        
                
            }

            count= (cz*(cz-1))/2 + (ct*(ct-1))/2;

    System.out.println(count);
    t--;
}
      }
}
