package com.project;
import java.util.Scanner;


public class SimpleCalculator {







	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MAin method is here !");
	  	
  	System.out.println("Simple Calculator");
		
		String  option= "";
	

	
      do {
    
  		
  		System.out.println("Enter a number");
  		int a = sc.nextInt();
  		
  		System.out.println("Enter another number");
  		int b = sc.nextInt();
  		
  		System.out.println("chocies one options giveb  1.[+]addition,2.[-]Subtration,3.[*]multipulation,4.[/]Division");
  		 
          int Choies= sc.nextInt();
      
      
          switch(Choies) {
          case 1:System.out.println("Addition of two number "+ (a+b));
          break;
          
          case 2:System.out.println("Subtration of two number "+(a-b));
          break;
          
          case 3:System.out.println("Mulitpulation of two nukmbers is "+a*b);
          break;
          
          case 4:System.out.println("Division of two number is"+ a/b);
          break;
          
          default:System.out.println("inivalid number entered you");
          }
          
          System.out.println("If you want to repeat in it agin please enter yes or no ");
  		option=sc.next();
  		
         	
      }while(option.equalsIgnoreCase("yes"));
      
      sc.close();
      
      }
      
	}
	
      
      
     
      
      



