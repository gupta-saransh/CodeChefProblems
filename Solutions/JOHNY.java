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

class JOHNY {

    static int bsearch(int arr[], long element) {
        int start = 0;
        int end = arr.length - 1;
        int found = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (element > arr[mid]) {

                start = mid + 1;
            }
            if (element < arr[mid]) {
                end = mid - 1;
            }
            
            if (element == arr[mid]) {
                return mid;
            }

        }
        return -1;
    }

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
            int pos = scn.nextInt();
            long element = arr[pos-1];

            Arrays.sort(arr);
           
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
            
            System.out.println();
            System.out.println(bsearch(arr, element) +1 );
            t--;
        }

    }
}
