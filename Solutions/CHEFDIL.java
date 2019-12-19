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
public class CHEFDIL {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t != 0) {

            String input = scn.next();
            char stack[] = new char[input.length()];
            for (int i = 0; i < input.length(); i++) {

                stack[i] = input.charAt(i);
            }

            int counter = 0;
            int c2 = 0;
            int flag=0;
            while (counter < stack.length) {
                int flag2 = 0;
                if (stack[0] == '1') {
                    stack[0] = 'R';
                    if (stack[1] != 'R') {
                        stack[1] = (char) (stack[1] ^ 1);
                    }

                }
                for (int i = 1; i < stack.length - 1; i++) {

                    if (stack[i] == '1') {
                        stack[i] = 'R';
                        if (stack[i + 1] != 'R') {
                            stack[i + 1] = (char) (stack[i + 1] ^ 1);
                        }
                        if (stack[i - 1] != 'R') {
                            stack[i - 1] = (char) (stack[i - 1] ^ 1);
                        }

                    }
                }
                if (stack[stack.length - 1] == '1') {
                    stack[stack.length - 1] = 'R';
                    if (stack[stack.length - 2] != 'R') {
                        stack[stack.length - 2] = (char) (stack[stack.length - 2] ^ 1);
                    }

                }

                for (int i = 0; i < input.length(); i++) {

                    System.out.print(stack[i] + " ");
                    if (stack[i] == '1') {
                        flag2 = 3;
                        break;
                    }

                }
                System.out.println(counter);
                if (flag2 != 3) {
                    flag=3;
                    break;
                }

                counter++;
            }
           // System.out.println(counter+" "+stack.length);
           
            if (flag== 3 && counter!=stack.length) {
                System.out.println("WIN");
            } else {
                System.out.println("LOSE");
            }

            t--;
        }
    }
}
