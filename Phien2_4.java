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
public class Phien2_4 
{
    public static void main(String[] args)
{       
    int i,num = 0,sum = 0;
    double avg;
    System.out.print("Enter 5 num : ");  
    for (i=0;i<5;i++)
    {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sum += num;
    }
    avg = sum / 5;
    System.out.println("The sum of 5 no is : " + sum );
    System.out.println("The Average is : " + avg);
}
}
