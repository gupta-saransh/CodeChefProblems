/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ownfunprograms;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Saransh Gupta
 */
public class KETEKI2C {

    static int printDiv(int n) {
        int counter = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If divisors are equal, print only one 
                if (n / i == i) {
                    counter++;
                } else // Otherwise print both 
                {
                    counter = counter + 2;
                }
            }
        }

        return counter;
    }
static class Reader {

        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    break;
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg) {
                return -ret;
            }
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg) {
                return -ret;
            }
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg) {
                return -ret;
            }
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null) {
                return;
            }
            din.close();
        }
    }

    public static void main(String args[]) throws IOException {

    

        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int A[] = new int[size];

        for (int i = 0; i < A.length; i++) {

            A[i] = scn.nextInt();
        }

        int B[] = new int[size];
        int C[] = new int[size];
        int sum = 0;
        for (int i = 0; i < B.length; i++) {
            B[i] = 1;
            for (int j = 0; j < B.length; j++) {
                B[i] = B[i] * A[j];

            }
            B[i] = B[i] / A[i];

            C[i] = printDiv(B[i]);
            sum += C[i];

        }

        long num = 1000000000 + 7;
        System.out.print(sum % num);

    }

}
