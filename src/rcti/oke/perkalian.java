/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rcti.oke;

import java.util.Scanner;

/**
 *
 * @author SBC4
 */
public class perkalian {
    public static void main(String[] args) {
        Scanner masuk=new Scanner(System.in);
System.out.print("NILAI PERTAMA:");
int N1= masuk.nextInt();

System.out.print("NILAI KEDUA:");
int N2= masuk.nextInt();

int hasil=N1*N2;
System.out.print ("hasil total=" +hasil);
    }
}

