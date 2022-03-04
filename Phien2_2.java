/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Phien2_2 {
    public static void main(String[ ] arg)
	{
	int i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char ch=sc.next( ).charAt(0);	 
	//char ch=sc.nextChar();
	switch(ch)
	{
	 case 'a' :
	 case 'e' :
	 case 'i' :
	 case 'o' :
	 case 'u' :
	 case 'A' :
	 case 'E' :
	 case 'I' :
	 case 'O' :
	 case 'U' :i++;
	}
	if(i==1)
	System.out.println("Entered character "+ch+" is  Vowel");
	else 
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character "+ch+" is Consonent");
		else
		System.out.println("Not an alphabet");		
	}
}