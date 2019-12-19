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
class Mchef
{  
// code to find all the  
// factors of the number  
// excluding the number itself 
static ArrayList<Integer> factors(int n) 
{ 
    // ArrayList to store 
    // the factors 
    ArrayList<Integer> v = new ArrayList<Integer>(); 
    v.add(1); 
  
    // note that this loop  
    // runs till sqrt(n) 
    for (int i = 2; 
             i <= Math.sqrt(n); i++) 
    { 
  
        // if the value of  
        // i is a factor 
        if (n % i == 0)  
        { 
            v.add(i); 
  
            // condition to check  
            // the divisor is not  
            // the number itself 
            if (n / i != i)  
            { 
                v.add(n / i); 
            } 
        } 
    } 
      
    // return the ArrayList 
    return v; 
} 
  
// Function to check if the  
// number is abundant or not  
static boolean checkAbundant(int n) 
{ 
    ArrayList<Integer> v; 
  
    int sum = 0; 
  
    // find the divisors 
    // using function 
    v = factors(n); 
  
    // sum all the factors 
    for (int i = 0; i < v.size(); i++)  
    { 
        sum += v.get(i); 
    } 
  
    // check for abundant 
    // or not 
    if (sum > n) 
        return true; 
    else
        return false; 
} 
  
// Function to check if the 
// number is semi-perfecr or not 
static boolean checkSemiPerfect(int n) 
{ 
    ArrayList<Integer> v; 
  
    // find the divisors 
    v = factors(n); 
  
    // sorting the ArrayList 
    Collections.sort(v); 
  
    int r = v.size(); 
  
    // subset to check if  
    // no is semiperfect 
    boolean subset[][] = new boolean[r + 1][n + 1]; 
  
    // initialising 1st 
    // column to true 
    for (int i = 0; i <= r; i++) 
        subset[i][0] = true; 
  
    // initialing 1st row except  
    // zero position to 0 
    for (int i = 1; i <= n; i++) 
        subset[0][i] = false; 
  
    // loop to find whther  
    // the number is semiperfect 
    for (int i = 1; i <= r; i++)  
    { 
        for (int j = 1; j <= n; j++)  
        { 
  
            // calculation to check  
            // if the number can be  
            // made by summation of  
            // diviors 
            if (j < v.get(i - 1)) 
                subset[i][j] = subset[i - 1][j]; 
            else { 
                subset[i][j] = subset[i - 1][j] ||  
                               subset[i - 1][j -  
                                v.get(i - 1)]; 
            } 
        } 
    } 
  
    // if not possible to make  
    // the number by any  
    // combination of divisors 
    if ((subset[r][n]) == false) 
        return false; 
    else
        return true; 
} 
  
// Function to check  
// for weird or not  
static boolean checkweird(int n) 
{ 
    if (checkAbundant(n) == true &&  
        checkSemiPerfect(n) == false) 
        return true; 
    else
        return false; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    Scanner scn = new Scanner(System.in);
    int t=scn.nextInt();
    while(t>0)
    {
  int n=scn.nextInt();
    if (checkweird(n)) 
        System.out.println("SPECIAL"); 
    else
        System.out.println("NOT SPECIAL"); 
      t--;  }
} 
} 