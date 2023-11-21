package hackerrankStuff;

import java.util.Scanner;

import java.io.*;
import java.util.*;

public class Solution {

    static int B;
    static int H;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        int area = B * H;
        System.out.println(area);
    }
}

