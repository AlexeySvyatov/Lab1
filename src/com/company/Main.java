/* var 2 */
package com.company;
import java.util.Scanner;
public class Main{

    public static void main(String[] arge) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number please - ");
        double a = in.nextDouble();
        double s = Math.cos(a) + Math.sin(a);
        double s1 = Math.cos(3 * a) + Math.sin(3 * a);
        double s2 = s + s1;
        System.out.println("Z = " + s2);
        in.close();
    }
}