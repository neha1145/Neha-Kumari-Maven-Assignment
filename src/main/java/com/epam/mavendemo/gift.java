package com.epam.mavendemo;

import java.util.Scanner;

interface newyear{
	public int candy();
	public int bar();
	public int sweet();
}
public class gift implements newyear {
	Scanner sc=new Scanner(System.in);
	public int candy(){
		System.out.println("money to invest on candy?");
		int x=sc.nextInt();
		return x;
	}
	public int bar() {
		System.out.println("money to invest on bar?");
		int y=sc.nextInt();
		return y;
	}
	public int sweet() {
		System.out.println("money to invest on sweet?");
		int s=sc.nextInt();
		return s;
	}
}

