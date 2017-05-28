package evenorodd;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Evenorodd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Even = new Scanner (System.in);
			
	int x;		
                System.out.println("Enter a Number to check if it's Even or Odd ");
                x=Even.nextInt();
	if( x % 2 == 0){			
		System.out.println("The Number You Entered Is EVEN");
			}		
	else{
        	System.out.println("The Number You Entered Is ODD");
             }
    
}
}
