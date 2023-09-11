package com.amdocs;


import java.util.Scanner;

import com.amdocs_entity.AdvocateChoices;
import com.amdocs_entity.CustomerChoices;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
       
    	while(true)
    	{
    		System.out.println("**********WELCOME**********");
    		System.out.println("----------------------------");
    		System.out.println("\n       1.CUSTOMER");
    		System.out.println("\n       2.ADVOCATE");
    		System.out.println("\n       3.EXIT");
    		int ch = Integer.parseInt(scanner.nextLine());
			switch (ch) {
			case 1:
				goTocustomer();
				break;
			case 2:
				goToAdvocate();
				break;
			case 0:
				System.out.println("*****Thank you*****");
				System.exit(0);
				break;
			
			default:
				System.out.println("Try again,Invalid Choice");
				break;
				
    			
    			
    		}
    	}
    	
       }
      
    private static void goTocustomer()
        {
    	   CustomerChoices customerChoices=new CustomerChoices();
    	   customerChoices.customerSelect();
        }
    
    private static void goToAdvocate()
    {
	   AdvocateChoices advocateChoices=new AdvocateChoices();
   advocateChoices.advocateSelect();
    }
    
    }

