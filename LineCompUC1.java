package employeewage;

import java.util.Scanner;

public class LineCompUC1 {
	static int len,len1;
	static Integer L1,L2;
	
	static void CalLength()
	{
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter First Co-ordinates:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        System.out.println("Enter Second Co-ordinates:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
       
	    len = (int) Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
		L1 = len;
		System.out.println("The length is "+"("+x1+","+y1+"),"+"("+x2+","+y2+")=======>"+len);
	}
	
	static void Equals() {
		CalLength();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Third Co-ordinates:");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();

		System.out.println("Enter Fourth Co-ordinates:");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();

	    len1 = (int) Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
		System.out.println("The length of Second line is:" + len1);
        L2 = len1;
		
		if (L1.equals(L2)) {
			System.out.println("Lines are equal");
		} else 
			System.out.println("Lines are not equals");
		
	}
	
	static void EqualsGL()
	{
		 Equals();
		 
		 if (L1 > L2) {
				System.out.println("Line1 is Greater line2");
			} else if(L1 < L2) {
				System.out.println("Line1 lesser than line2");	
			}
	}
	
	public static void main(String args[])
	{
		EqualsGL();
	}

}
