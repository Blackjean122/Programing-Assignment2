package decript;

import java.util.Scanner;

public class Cestin_p1decript {
	public static void main(String[] agrs) {
		@SuppressWarnings({ "resource" })
		Scanner Scan = new Scanner(System.in);
		
		int userNum1;
		int userNum2;
		int userNum3;
		int userNum4;
		int temp;

		System.out.println(" Please enter 4 Numbers that you would like to decypt one by one: ");
		
		userNum1=Scan.nextInt();
		userNum2=Scan.nextInt();
		userNum3=Scan.nextInt();
		userNum4=Scan.nextInt();
		System.out.println("Your 4 numbers are: " +userNum1 +" " +userNum2+ " " +userNum3 + " " +userNum4);
		
		userNum1=(userNum1)-7;
		if (userNum1<0) {
			userNum1+=10;
	    }
		
		    userNum2=(userNum2)-7;
		if(userNum2<0) {
			userNum2+=10;
		}
		
		userNum3=(userNum3)-7;
		if (userNum3<0) {
			userNum3+=10;
		}
		
		userNum4=(userNum4)-7;
		if (userNum4<0) {
			userNum4+=10;
		}
		
		
		temp=userNum1;
		userNum1=userNum3;
		userNum3=temp;

		temp=userNum2;
		userNum2=userNum4;
		userNum4=temp;
		
		System.out.println("Decrypted Data is : " +userNum1 +userNum2 +userNum3 +userNum4);
		
	}

}
