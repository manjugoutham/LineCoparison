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
	
	
	public static void main(String args[])
	{
		CalLength();
	}

}
