package Class_3_4_Assignments;

import java.util.Scanner;

import net.sourceforge.htmlunit.corejs.javascript.ast.ForInLoop;


public class Assignments_3_4 {
	
	public static void main(String[] args) {
		
	//Topic 5: What will be the output of following program, correct if required?
		non_static();
		//divisible5();
		sumoffirst100();
		
	}
	
	public static void non_static(){
		System.out.println("Pass");
	}
	
	//Topic 6: Write a for loop to print even numbers between 1 to 100
	
	public static void EvenNumber(){
		
		int evennmbr = 100;
		System.out.println("Printing even numbers between 1 to 100" + evennmbr);
		for (int i = 0; i <=evennmbr; i++) {
			if(i%2==0){
				System.out.println(i + "");
			}
			
		}
	}
	

//Topic 7: Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5, it prints 'divisible by 5 followed by that number'

	public static void divisible5(){
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
		for (int i = 0; i <=100; i++) {
			System.out.println(i);
			if(n%5==0){
				System.out.println(n+ "number is divisible by 5");
				
			}
			
			else{
				System.out.println(n+ "number not divisible by 5");
			}
		}
	}
	
	//Topic 8: Write a for loop to find the sum of first 100 numbers(1 to 100)
	
	public static void sumoffirst100(){
		
		int sum = 0; 
		for (int i = 1; i <= 100; i++) sum += i; 
		System.out.println("The sum is " + sum);
		
	}
}



