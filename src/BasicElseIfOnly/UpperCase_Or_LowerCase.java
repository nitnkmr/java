package BasicElseIfOnly;

import java.util.Scanner;

public class UpperCase_Or_LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
        String s=sc.next();
        char a1=s.charAt(0);
           sc.close();
       if(a1>='A' && a1<='Z'){
           System.out.println("Char is Uppercase");
       }
       else
           System.out.println("Char is Lowercase");

	}

}
