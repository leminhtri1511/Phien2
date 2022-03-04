/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaphien1;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Phien2_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        if((n % 400==0) || ((n%100!=0) && (n%4==0)))
        {
            System.out.println(n + " is a leap year");
        }
        else System.out.println(n + " is not a leap year ");
        
    }
    
}
