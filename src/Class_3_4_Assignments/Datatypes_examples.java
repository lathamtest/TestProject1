package Class_3_4_Assignments;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;

//Topic 10: Write a program which has all different types of data types 
//(mainly int, string, boolean) used and perform any operation. 


public class Datatypes_examples {

	public static void main(String[] args) {
		Datattype_string();
		Datatypeint();
		Datatypeboolean();
	}

	public static void Datattype_string(){
		
		  String string1 = "Java is object oriented programing language";
	      System.out.println(string1);
	}
	
	public static void Datatypeint(){
		
		int a=10;
		int b=20;
		
		int sum = a+b;
		System.out.println("int value is:"+sum);
	}
	public static void Datatypeboolean(){
		boolean a = true;
		
		if(a==true){
		System.out.println("the boolean value is:"+a);
		
		}
		else {
			a=false;
			System.out.println("the boolean value is:"+a);
		}
	}
}
