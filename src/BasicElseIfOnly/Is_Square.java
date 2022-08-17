package BasicElseIfOnly;

import java.util.Scanner;

public class Is_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
    if(a==b){
        System.out.println("Square");
    }
    else
        System.out.println("Not a Square");

	}

}
